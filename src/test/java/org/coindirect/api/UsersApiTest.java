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
import org.coindirect.api.model.AuthenticationToken;
import org.coindirect.api.model.AuthenticationTokenRequest;
import org.coindirect.api.model.EncodedFile;
import org.coindirect.api.model.Errors;
import org.coindirect.api.model.User;
import org.coindirect.api.model.UserForgotPasswordRequest;
import org.coindirect.api.model.UserPasswordChangeRequest;
import org.coindirect.api.model.UserProfile;
import org.coindirect.api.model.UserRegistrationRequest;
import org.coindirect.api.model.WrappedPrimitive;
import org.coindirect.api.model.WrappedString;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    /**
     * Create API Key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiKeyCreateTest() throws ApiException {
        AuthenticationTokenRequest body = null;
        api.apiKeyCreate(body);

        // TODO: test validations
    }
    /**
     * Create ID Verification Document
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIdVerificationDocumentTest() throws ApiException {
        EncodedFile body = null;
        api.createIdVerificationDocument(body);

        // TODO: test validations
    }
    /**
     * Forgot Password Confirm
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void forgotPasswordConfirmTest() throws ApiException {
        UserForgotPasswordRequest body = null;
        api.forgotPasswordConfirm(body);

        // TODO: test validations
    }
    /**
     * Forgot Password Request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void forgotPasswordRequestTest() throws ApiException {
        UserForgotPasswordRequest body = null;
        api.forgotPasswordRequest(body);

        // TODO: test validations
    }
    /**
     * Register New User
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerNewUserTest() throws ApiException {
        UserRegistrationRequest body = null;
        api.registerNewUser(body);

        // TODO: test validations
    }
    /**
     * Confirm New User
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void confirmNewUserTest() throws ApiException {
        WrappedString body = null;
        api.confirmNewUser(body);

        // TODO: test validations
    }
    /**
     * Resend Verification
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resendVerificationEmailTest() throws ApiException {
        UserRegistrationRequest body = null;
        api.resendVerificationEmail(body);

        // TODO: test validations
    }
    /**
     * Confirm Two Factor Code
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void twoFactorConfirmTest() throws ApiException {
        WrappedString body = null;
        api.twoFactorConfirm(body);

        // TODO: test validations
    }
    /**
     * Start Two Factor Setup
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void twoFactorStartTest() throws ApiException {
        WrappedString body = null;
        WrappedString response = api.twoFactorStart(body);

        // TODO: test validations
    }
    /**
     * List API Keys
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiKeyListTest() throws ApiException {
        List<AuthenticationToken> response = api.apiKeyList();

        // TODO: test validations
    }
    /**
     * Revoke API Key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiKeyRevokeTest() throws ApiException {
        String token = null;
        api.apiKeyRevoke(token);

        // TODO: test validations
    }
    /**
     * Update User Profile
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserProfileTest() throws ApiException {
        User body = null;
        User response = api.updateUserProfile(body);

        // TODO: test validations
    }
    /**
     * Read WebSocket Channel
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readUserWebsocketChannelTest() throws ApiException {
        WrappedPrimitive response = api.readUserWebsocketChannel();

        // TODO: test validations
    }
    /**
     * Update User Profile Image
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserProfileImageTest() throws ApiException {
        EncodedFile body = null;
        api.updateUserProfileImage(body);

        // TODO: test validations
    }
    /**
     * Update User Password
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserPasswordTest() throws ApiException {
        UserPasswordChangeRequest body = null;
        api.updateUserPassword(body);

        // TODO: test validations
    }
    /**
     * Read User Profile
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readUserProfileTest() throws ApiException {
        UserProfile response = api.readUserProfile();

        // TODO: test validations
    }
    /**
     * Update User Profile
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserProfile_0Test() throws ApiException {
        UserProfile body = null;
        UserProfile response = api.updateUserProfile_0(body);

        // TODO: test validations
    }
    /**
     * Read Two Factor Status
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void twoFactorStatusReadTest() throws ApiException {
        Boolean response = api.twoFactorStatusRead();

        // TODO: test validations
    }
}
