/*
 * Coindirect
 * The Coindirect API is offered to all users to make use of our P2P Marketplace, Exchange and Wallets.
 *
 * OpenAPI spec version: 1
 * Contact: support@coindirect.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.coindirect.api;

import org.coindirect.api.invoker.ApiException;
import org.coindirect.api.model.AmlCheckResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IdentityApi
 */
@Ignore
public class IdentityApiTest {

    private final IdentityApi api = new IdentityApi();

    /**
     * Start Identity Verification
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void identityVerificationStartTest() throws ApiException {
        AmlCheckResponse response = api.identityVerificationStart();

        // TODO: test validations
    }
    /**
     * Notify of Start
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void identityVerificationStartedTest() throws ApiException {
        api.identityVerificationStarted();

        // TODO: test validations
    }
}
