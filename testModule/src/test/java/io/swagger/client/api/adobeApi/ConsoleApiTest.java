package io.swagger.client.api.adobeApi;

import io.swagger.client.service.adobeService.ApiClient;
import io.swagger.client.model.adobeModel.BundleInfo;
import io.swagger.client.model.adobeModel.SamlConfigurationInfo;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConsoleApi
 */
public class ConsoleApiTest {

    private ConsoleApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ConsoleApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void getAemProductInfoTest() {
        // List<String> response = api.getAemProductInfo();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getBundleInfoTest() {
        String name = null;
        // BundleInfo response = api.getBundleInfo(name);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getConfigMgrTest() {
        // String response = api.getConfigMgr();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postBundleTest() {
        String name = null;
        String action = null;
        // Void response = api.postBundle(name, action);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postJmxRepositoryTest() {
        String action = null;
        // Void response = api.postJmxRepository(action);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postSamlConfigurationTest() {
        Boolean post = null;
        Boolean apply = null;
        Boolean delete = null;
        String action = null;
        String $location = null;
        List<String> path = null;
        Integer serviceRanking = null;
        String idpUrl = null;
        String idpCertAlias = null;
        Boolean idpHttpRedirect = null;
        String serviceProviderEntityId = null;
        String assertionConsumerServiceURL = null;
        String spPrivateKeyAlias = null;
        String keyStorePassword = null;
        String defaultRedirectUrl = null;
        String userIDAttribute = null;
        Boolean useEncryption = null;
        Boolean createUser = null;
        Boolean addGroupMemberships = null;
        String groupMembershipAttribute = null;
        List<String> defaultGroups = null;
        String nameIdFormat = null;
        List<String> synchronizeAttributes = null;
        Boolean handleLogout = null;
        String logoutUrl = null;
        Integer clockTolerance = null;
        String digestMethod = null;
        String signatureMethod = null;
        String userIntermediatePath = null;
        List<String> propertylist = null;
        // SamlConfigurationInfo response = api.postSamlConfiguration(post, apply, delete, action, $location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist);

        // TODO: test validations
    }
}
