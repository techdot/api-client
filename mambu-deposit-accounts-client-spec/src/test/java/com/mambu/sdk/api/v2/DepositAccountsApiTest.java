/*
 * deposits
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v2
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.mambu.sdk.api.v2;

import com.mambu.sdk.api.ApiException;
import com.mambu.sdk.model.v2.*;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for DepositAccountsApi
 */
@Ignore
public class DepositAccountsApiTest {

    private final DepositAccountsApi api = new DepositAccountsApi();


    /**
     * Allows posting an action such as approve deposit account
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changeStateTest() throws ApiException {
        String depositAccountId = null;
        DepositAccountAction body = null;
        String idempotencyKey = null;
        DepositAccount response = api.changeState(depositAccountId, body, idempotencyKey);

        // TODO: test validations
    }

    /**
     * Creates a new deposit account
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        DepositAccount body = null;
        String idempotencyKey = null;
        DepositAccount response = api.create(body, idempotencyKey);

        // TODO: test validations
    }

    /**
     * Create and associate a new card to the provided account
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCardTest() throws ApiException {
        String depositAccountId = null;
        Card body = null;
        String idempotencyKey = null;
        api.createCard(depositAccountId, body, idempotencyKey);

        // TODO: test validations
    }

    /**
     * Delete an inactive deposit account via id or encoded key
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        String depositAccountId = null;
        api.delete(depositAccountId);

        // TODO: test validations
    }

    /**
     * Delete a card associated to the provided account via its reference token
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCardTest() throws ApiException {
        String depositAccountId = null;
        String cardReferenceToken = null;
        api.deleteCard(depositAccountId, cardReferenceToken);

        // TODO: test validations
    }

    /**
     * Allows retrieval of deposit accounts using various query parameters. It&#39;s possible to look up deposits by their state, branch, centre or by a credit officer to which the deposits are assigned.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        Integer offset = null;
        Integer limit = null;
        String paginationDetails = null;
        String detailsLevel = null;
        String creditOfficerUsername = null;
        String branchId = null;
        String centreId = null;
        String accountState = null;
        String accountHolderType = null;
        String accountHolderId = null;
        List<DepositAccount> response = api.getAll(offset, limit, paginationDetails, detailsLevel, creditOfficerUsername, branchId, centreId, accountState, accountHolderType, accountHolderId);

        // TODO: test validations
    }

    /**
     * Retrieves the authorization holds related to a deposit account, ordered from newest to oldest by creation date
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllAuthorizationHoldsTest() throws ApiException {
        String depositAccountId = null;
        Integer offset = null;
        Integer limit = null;
        String paginationDetails = null;
        String status = null;
        List<AuthorizationHold> response = api.getAllAuthorizationHolds(depositAccountId, offset, limit, paginationDetails, status);

        // TODO: test validations
    }

    /**
     * Allows retrieval of all cards associated with the account
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllCardsTest() throws ApiException {
        String depositAccountId = null;
        List<Card> response = api.getAllCards(depositAccountId);

        // TODO: test validations
    }

    /**
     * Allows retrieval of a single deposit account via id or encoded key
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String depositAccountId = null;
        String detailsLevel = null;
        DepositAccount response = api.getById(depositAccountId, detailsLevel);

        // TODO: test validations
    }

    /**
     * Partially update a deposit account
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchTest() throws ApiException {
        String depositAccountId = null;
        List<PatchOperation> body = null;
        api.patch(depositAccountId, body);

        // TODO: test validations
    }

    /**
     * Update an existing deposit account
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        String depositAccountId = null;
        DepositAccount body = null;
        DepositAccount response = api.update(depositAccountId, body);

        // TODO: test validations
    }

}
