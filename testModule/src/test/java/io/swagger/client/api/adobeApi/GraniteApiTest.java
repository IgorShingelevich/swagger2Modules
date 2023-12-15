package io.swagger.client.api.adobeApi;

import io.swagger.client.service.adobeService.ApiClient;
import java.io.File;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GraniteApi
 */
public class GraniteApiTest {

    private GraniteApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(GraniteApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void sslSetupTest() {
        String keystorePassword = null;
        String keystorePasswordConfirm = null;
        String truststorePassword = null;
        String truststorePasswordConfirm = null;
        String httpsHostname = null;
        String httpsPort = null;
        File certificateFile = null;
        File privatekeyFile = null;
        // String response = api.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, certificateFile, privatekeyFile);

        // TODO: test validations
    }
}
