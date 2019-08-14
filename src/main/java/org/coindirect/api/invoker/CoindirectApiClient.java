package org.coindirect.api.invoker;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.LongNode;
import org.coindirect.api.invoker.auth.HawkAuth;
import org.coindirect.api.model.User;
import org.glassfish.jersey.client.ClientConfig;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.ws.rs.RuntimeType;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.UUID;


public class CoindirectApiClient extends ApiClient {
    private HawkAuth hawkAuth;

    public CoindirectApiClient(final String apiKey, final String apiSecret) {
        super();
        hawkAuth = new HawkAuth(apiKey, apiSecret);
        setBasePath("https://api.coindirect.com");
        ObjectMapper objectMapper = getJSON().getContext(null);
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addDeserializer(OffsetDateTime.class, new CoindirectDateDeserializer());
        objectMapper.registerModule(simpleModule);
    }

    private class CoindirectApiFeature implements Feature {

        @Override
        public boolean configure(FeatureContext featureContext) {
            if (featureContext.getConfiguration().getRuntimeType() == RuntimeType.CLIENT) {
                featureContext.register(new CoindirectApiFilter(hawkAuth));
            }

            return true;
        }
    }

    @Override
    protected void performAdditionalClientConfiguration(ClientConfig clientConfig) {
        clientConfig.register(new CoindirectApiFeature());
    }

    private static class CoindirectApiFilter implements ClientRequestFilter {
        private HawkAuth hawkAuth;

        public CoindirectApiFilter(HawkAuth hawkAuth) {
            this.hawkAuth = hawkAuth;
        }

        private String generateHash(String key, String data) throws InvalidKeyException, NoSuchAlgorithmException {
            Mac sha256_HMAC = null;
            String result = null;

            byte[] byteKey = key.getBytes(StandardCharsets.UTF_8);
            final String HMAC_SHA256 = "HmacSHA256";
            sha256_HMAC = Mac.getInstance(HMAC_SHA256);
            SecretKeySpec keySpec = new SecretKeySpec(byteKey, HMAC_SHA256);
            sha256_HMAC.init(keySpec);
            byte[] mac_data = sha256_HMAC.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(mac_data);
        }

        @Override
        public void filter(ClientRequestContext clientRequestContext) throws IOException {
            long timestamp = Math.round(System.currentTimeMillis() / 1000);
            String nonce = UUID.randomUUID().toString().substring(0, 8);
            String method = clientRequestContext.getMethod().toUpperCase();
            URI uri = clientRequestContext.getUri();
            String path = uri.getPath();
            String query = uri.getRawQuery();
            String host = uri.getHost();
            int port = uri.getPort() == -1 ? 443 : uri.getPort();

            StringBuilder hawkHeader = new StringBuilder();
            hawkHeader.append("hawk.1.header\n");
            hawkHeader.append(timestamp);
            hawkHeader.append("\n");
            hawkHeader.append(nonce);
            hawkHeader.append("\n");
            hawkHeader.append(method);
            hawkHeader.append("\n");
            hawkHeader.append(path);
            if (query != null) {
                hawkHeader.append("?");
                hawkHeader.append(query);
            }
            hawkHeader.append("\n");
            hawkHeader.append(host);
            hawkHeader.append("\n");
            hawkHeader.append(port);
            hawkHeader.append("\n");
            // body
            hawkHeader.append("\n");
            // app data
            hawkHeader.append("\n");
            
            try {
                String mac = generateHash(hawkAuth.getApiSecret(), hawkHeader.toString());
                String authorization = "Hawk id=\"" + hawkAuth.getApiKey() + "\", ts=\"" + timestamp + "\", nonce=\"" + nonce + "\", mac=\"" + mac + "\"";
                clientRequestContext.getHeaders().putSingle("Authorization", authorization);
            } catch(Exception e) {
                throw new IOException(e);
            }
        }
    }

    public class CoindirectDateDeserializer extends StdDeserializer<OffsetDateTime> {

        public CoindirectDateDeserializer() {
            this(null);
        }

        public CoindirectDateDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public OffsetDateTime deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            LongNode node = jp.getCodec().readTree(jp);

            if(node == null) {
                return null;
            }

            return OffsetDateTime.ofInstant(Instant.ofEpochMilli(node.longValue()), ZoneId.systemDefault());
        }
    }

}
