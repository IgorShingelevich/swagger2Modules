package io.swagger.client.api.adobeApi;

import io.swagger.client.service.adobeService.ApiClient;
import java.io.File;
import io.swagger.client.model.adobeModel.InstallStatus;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CrxApi
 */
public class CrxApiTest {

    private CrxApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CrxApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void getCrxdeStatusTest() {
        // String response = api.getCrxdeStatus();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getInstallStatusTest() {
        // InstallStatus response = api.getInstallStatus();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getPackageManagerServletTest() {
        // Void response = api.getPackageManagerServlet();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postPackageServiceTest() {
        String cmd = null;
        // String response = api.postPackageService(cmd);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postPackageServiceJsonTest() {
        String cmd = null;
        String path = null;
        File _package = null;
        String groupName = null;
        String packageName = null;
        String packageVersion = null;
        String _charset_ = null;
        Boolean force = null;
        Boolean recursive = null;
        // String response = api.postPackageServiceJson(cmd, path, _package, groupName, packageName, packageVersion, _charset_, force, recursive);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postPackageUpdateTest() {
        String groupName = null;
        String packageName = null;
        String version = null;
        String path = null;
        String filter = null;
        String _charset_ = null;
        // String response = api.postPackageUpdate(groupName, packageName, version, path, filter, _charset_);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postSetPasswordTest() {
        String old = null;
        String plain = null;
        String verify = null;
        // String response = api.postSetPassword(old, plain, verify);

        // TODO: test validations
    }
}
