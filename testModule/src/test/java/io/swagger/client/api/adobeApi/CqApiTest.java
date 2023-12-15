package io.swagger.client.api.adobeApi;

import io.swagger.client.service.adobeService.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CqApi
 */
public class CqApiTest {

    private CqApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CqApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void getLoginPageTest() {
        // String response = api.getLoginPage();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postCqActionsTest() {
        String authorizableId = null;
        String changelog = null;
        // Void response = api.postCqActions(authorizableId, changelog);

        // TODO: test validations
    }
}
