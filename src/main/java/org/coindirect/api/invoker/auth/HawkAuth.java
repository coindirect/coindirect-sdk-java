package org.coindirect.api.invoker.auth;

import org.coindirect.api.invoker.Pair;

import java.util.List;
import java.util.Map;

public class HawkAuth implements Authentication {

    private final String apiKey;
    private final String apiSecret;

    public HawkAuth(String apiKey, String apiSecret) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
    }

    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {

    }

    public String getApiKey() {
        return apiKey;
    }

    public String getApiSecret() {
        return apiSecret;
    }
}
