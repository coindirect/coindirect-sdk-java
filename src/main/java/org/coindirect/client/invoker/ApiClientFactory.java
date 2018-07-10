package org.coindirect.api.client.invoker;

import com.squareup.okhttp.*;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.UUID;

public class ApiClientFactory {
    public static ApiClient newApiClient(final String apiKey, final String apiSecret) {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://api.dev.node.limited");
        OkHttpClient okHttpClient = apiClient.getHttpClient();
        List<Interceptor> interceptorList = okHttpClient.interceptors();
        interceptorList.add(new ApiClientInterceptor(apiKey, apiSecret));
        return apiClient;
    }

    private static class ApiClientInterceptor implements Interceptor {
        private String apiKey;
        private String apiSecret;

        private ApiClientInterceptor(String apiKey, String apiSecret) {
            this.apiKey = apiKey;
            this.apiSecret = apiSecret;
        }

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            if (apiKey != null && apiSecret != null) {
                request = attachHawk(request);
            }
            return chain.proceed(request);
        }

        private Request attachHawk(Request request) {
            long timestamp = Math.round(System.currentTimeMillis() / 1000);
            String nonce = UUID.randomUUID().toString().substring(0, 8);
            String method = request.method().toUpperCase();
            HttpUrl httpUrl = request.httpUrl();
            String path = httpUrl.encodedPath();
            String query = httpUrl.query();
            String host = httpUrl.host();
            int port = httpUrl.port();

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

            String mac = generateHash(apiSecret, hawkHeader.toString());

            String authorization = "Hawk id=\""+apiKey+"\", ts=\""+timestamp+"\", nonce=\""+nonce+"\", mac=\""+mac+"\"";

            return request.newBuilder().addHeader("Authorization", authorization).build();
        }

        private String generateHash(String key, String data) {
            Mac sha256_HMAC = null;
            String result = null;

            try {
                byte[] byteKey = key.getBytes("UTF-8");
                final String HMAC_SHA256 = "HmacSHA256";
                sha256_HMAC = Mac.getInstance(HMAC_SHA256);
                SecretKeySpec keySpec = new SecretKeySpec(byteKey, HMAC_SHA256);
                sha256_HMAC.init(keySpec);
                byte[] mac_data = sha256_HMAC.doFinal(data.getBytes());
                return Base64.encodeBase64String(mac_data);
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InvalidKeyException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
//            System.out.println("Done");
            }
            return "";
        }
    }
}
