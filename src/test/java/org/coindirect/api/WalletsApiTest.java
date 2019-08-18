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
import org.coindirect.api.model.Currency;
import org.coindirect.api.model.Errors;
import org.coindirect.api.model.TransferRequest;
import org.coindirect.api.model.Wallet;
import org.coindirect.api.model.WalletFundingOption;
import org.coindirect.api.model.WalletWallet;
import org.coindirect.api.model.Withdrawal;
import org.coindirect.api.model.WithdrawalRequest;
import org.coindirect.api.model.WrappedPrimitive;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WalletsApi
 */
@Ignore
public class WalletsApiTest {

    private final WalletsApi api = new WalletsApi();

    /**
     * Create Transfer Request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTransferRequestTest() throws ApiException {
        TransferRequest body = null;
        TransferRequest response = api.createTransferRequest(body);

        // TODO: test validations
    }
    /**
     * Create Wallet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createWalletTest() throws ApiException {
        WalletWallet body = null;
        Wallet response = api.createWallet(body);

        // TODO: test validations
    }
    /**
     * Get convertible currencies
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConvertibleCurrenciesTest() throws ApiException {
        String code = null;
        List<Currency> response = api.getConvertibleCurrencies(code);

        // TODO: test validations
    }
    /**
     * Estimate Transfer Request Output
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransferRequestOutputEstimateTest() throws ApiException {
        TransferRequest body = null;
        WrappedPrimitive response = api.getTransferRequestOutputEstimate(body);

        // TODO: test validations
    }
    /**
     * Get transferable currencies
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransferableCurrenciesTest() throws ApiException {
        Long id = null;
        List<Currency> response = api.getTransferableCurrencies(id);

        // TODO: test validations
    }
    /**
     * Read Wallet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWalletTest() throws ApiException {
        Long id = null;
        Wallet response = api.getWallet(id);

        // TODO: test validations
    }
    /**
     * Get Deposit Address
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWalletDepositAddressTest() throws ApiException {
        Long id = null;
        api.getWalletDepositAddress(id);

        // TODO: test validations
    }
    /**
     * Get Funding Options
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWalletFundingOptionsTest() throws ApiException {
        Long id = null;
        List<WalletFundingOption> response = api.getWalletFundingOptions(id);

        // TODO: test validations
    }
    /**
     * Read Withdrawal Request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWithdrawalRequestTest() throws ApiException {
        Long id = null;
        WithdrawalRequest response = api.getWithdrawalRequest(id);

        // TODO: test validations
    }
    /**
     * List All Wallet Balances
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAllBalancesTest() throws ApiException {
        List<Wallet> response = api.listAllBalances();

        // TODO: test validations
    }
    /**
     * List Transfer Requests
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTransferRequestsTest() throws ApiException {
        Integer offset = null;
        Integer max = null;
        List<TransferRequest> response = api.listTransferRequests(offset, max);

        // TODO: test validations
    }
    /**
     * List Wallets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listWalletsTest() throws ApiException {
        Integer offset = null;
        Integer max = null;
        List<Wallet> response = api.listWallets(offset, max);

        // TODO: test validations
    }
    /**
     * List Withdrawal Requests
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listWithdrawalRequestsTest() throws ApiException {
        Integer offset = null;
        Integer max = null;
        List<WithdrawalRequest> response = api.listWithdrawalRequests(offset, max);

        // TODO: test validations
    }
    /**
     * Withdraw from Wallet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void withdrawFromWalletTest() throws ApiException {
        Long id = null;
        Withdrawal body = null;
        WithdrawalRequest response = api.withdrawFromWallet(id, body);

        // TODO: test validations
    }
    /**
     * Pre-validate Withdrawal
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void withdrawValidateTest() throws ApiException {
        Long id = null;
        Withdrawal body = null;
        Errors response = api.withdrawValidate(id, body);

        // TODO: test validations
    }
}