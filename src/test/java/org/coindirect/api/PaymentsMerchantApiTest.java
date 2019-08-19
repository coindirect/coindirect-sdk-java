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
import org.coindirect.api.model.PayRequest;
import org.coindirect.api.model.Payment;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsMerchantApi
 */
@Ignore
public class PaymentsMerchantApiTest {

    private final PaymentsMerchantApi api = new PaymentsMerchantApi();

    /**
     * Create Payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentCreateTest() throws ApiException {
        PayRequest body = null;
        Payment response = api.paymentCreate(body);

        // TODO: test validations
    }
    /**
     * List Payments
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentListTest() throws ApiException {
        String merchantId = null;
        List<Payment> response = api.paymentList(merchantId);

        // TODO: test validations
    }
    /**
     * Read Payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentReadTest() throws ApiException {
        String uuid = null;
        String reference = null;
        Payment response = api.paymentRead(uuid, reference);

        // TODO: test validations
    }
    /**
     * Cancel Payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentCancelTest() throws ApiException {
        String uuid = null;
        api.paymentCancel(uuid);

        // TODO: test validations
    }
}