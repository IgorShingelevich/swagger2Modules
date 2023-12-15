package io.swagger.client.api.adobeApi;

import io.swagger.client.service.adobeService.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomApi
 */
public class CustomApiTest {

    private CustomApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CustomApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void getAemHealthCheckTest() {
        String tags = null;
        Boolean combineTagsOr = null;
        // String response = api.getAemHealthCheck(tags, combineTagsOr);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postConfigAemHealthCheckServletTest() {
        List<String> bundlesIgnored = null;
        String bundlesIgnoredAtTypeHint = null;
        // Void response = api.postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredAtTypeHint);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postConfigAemPasswordResetTest() {
        List<String> pwdresetAuthorizables = null;
        String pwdresetAuthorizablesAtTypeHint = null;
        // Void response = api.postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesAtTypeHint);

        // TODO: test validations
    }
}
