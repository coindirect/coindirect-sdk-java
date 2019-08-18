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
import org.coindirect.api.model.AcceptedQuote;
import org.coindirect.api.model.Errors;
import org.coindirect.api.model.Limits;
import org.coindirect.api.model.PaymentMetadata;
import org.coindirect.api.model.Quote;
import org.coindirect.api.model.QuoteRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuotesApi
 */
@Ignore
public class QuotesApiTest {

    private final QuotesApi api = new QuotesApi();

    /**
     * Accept a quote
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acceptQuoteTest() throws ApiException {
        String uuid = null;
        PaymentMetadata body = null;
        AcceptedQuote response = api.acceptQuote(uuid, body);

        // TODO: test validations
    }
    /**
     * List quotes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listQuotesTest() throws ApiException {
        String merchantId = null;
        Quote response = api.listQuotes(merchantId);

        // TODO: test validations
    }
    /**
     * Read a quote
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readQuoteTest() throws ApiException {
        String uuid = null;
        AcceptedQuote response = api.readQuote(uuid);

        // TODO: test validations
    }
    /**
     * Get transaction limits
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readTransactionLimitsTest() throws ApiException {
        String country = null;
        String currency = null;
        String direction = null;
        String method = null;
        Limits response = api.readTransactionLimits(country, currency, direction, method);

        // TODO: test validations
    }
    /**
     * Request new payment instructions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void requestNewQuotePaymentInstructionsTest() throws ApiException {
        String uuid = null;
        PaymentMetadata body = null;
        AcceptedQuote response = api.requestNewQuotePaymentInstructions(uuid, body);

        // TODO: test validations
    }
    /**
     * Request a quote
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void requestQuoteTest() throws ApiException {
        QuoteRequest body = null;
        Boolean estimate = null;
        String direction = null;
        Quote response = api.requestQuote(body, estimate, direction);

        // TODO: test validations
    }
}