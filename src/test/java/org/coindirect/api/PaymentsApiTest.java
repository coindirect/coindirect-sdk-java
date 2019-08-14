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
import org.coindirect.api.model.PayDetailRequest;
import org.coindirect.api.model.PayInMethod;
import org.coindirect.api.model.PayOutMethod;
import org.coindirect.api.model.PayRequest;
import org.coindirect.api.model.Payment;
import org.coindirect.api.model.PaymentMetadata;
import org.coindirect.api.model.Quote;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsApi
 */
@Ignore
public class PaymentsApiTest {

    private final PaymentsApi api = new PaymentsApi();

    /**
     * Accept payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acceptPaymentTest() throws ApiException {
        String uuid = null;
        PaymentMetadata body = null;
        Payment response = api.acceptPayment(uuid, body);

        // TODO: test validations
    }
    /**
     * Cancel payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelPaymentTest() throws ApiException {
        String uuid = null;
        api.cancelPayment(uuid);

        // TODO: test validations
    }
    /**
     * Read payments
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPaymentsTest() throws ApiException {
        String merchantId = null;
        List<Payment> response = api.listPayments(merchantId);

        // TODO: test validations
    }
    /**
     * List supported pay in methods
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSupportedPayInMethodsTest() throws ApiException {
        String country = null;
        String currency = null;
        String uuid = null;
        String merchant = null;
        List<PayInMethod> response = api.listSupportedPayInMethods(country, currency, uuid, merchant);

        // TODO: test validations
    }
    /**
     * List supported pay out methods
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSupportedPayOutMethodsTest() throws ApiException {
        String country = null;
        String currency = null;
        String uuid = null;
        String merchant = null;
        List<PayOutMethod> response = api.listSupportedPayOutMethods(country, currency, uuid, merchant);

        // TODO: test validations
    }
    /**
     * Lock payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void lockPaymentTest() throws ApiException {
        String uuid = null;
        Payment response = api.lockPayment(uuid);

        // TODO: test validations
    }
    /**
     * Read payment information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readPaymentTest() throws ApiException {
        String uuid = null;
        String reference = null;
        Payment response = api.readPayment(uuid, reference);

        // TODO: test validations
    }
    /**
     * Request a new payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void requestPaymentTest() throws ApiException {
        PayRequest body = null;
        Payment response = api.requestPayment(body);

        // TODO: test validations
    }
    /**
     * Settle payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void settlePaymentWithQuoteTest() throws ApiException {
        String uuid = null;
        Quote body = null;
        Payment response = api.settlePaymentWithQuote(uuid, body);

        // TODO: test validations
    }
    /**
     * Update payment details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePaymentTest() throws ApiException {
        String uuid = null;
        PayDetailRequest body = null;
        Payment response = api.updatePayment(uuid, body);

        // TODO: test validations
    }
}
