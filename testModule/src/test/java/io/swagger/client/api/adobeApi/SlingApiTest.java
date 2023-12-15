package io.swagger.client.api.adobeApi;

import io.swagger.client.service.adobeService.ApiClient;
import java.math.BigDecimal;
import java.io.File;
import io.swagger.client.model.adobeModel.KeystoreInfo;
import io.swagger.client.model.adobeModel.TruststoreInfo;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SlingApi
 */
public class SlingApiTest {

    private SlingApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SlingApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void deleteAgentTest() {
        String runmode = null;
        String name = null;
        // Void response = api.deleteAgent(runmode, name);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void deleteNodeTest() {
        String path = null;
        String name = null;
        // Void response = api.deleteNode(path, name);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getAgentTest() {
        String runmode = null;
        String name = null;
        // Void response = api.getAgent(runmode, name);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getAgentsTest() {
        String runmode = null;
        // String response = api.getAgents(runmode);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getAuthorizableKeystoreTest() {
        String intermediatePath = null;
        String authorizableId = null;
        // KeystoreInfo response = api.getAuthorizableKeystore(intermediatePath, authorizableId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getKeystoreTest() {
        String intermediatePath = null;
        String authorizableId = null;
        // File response = api.getKeystore(intermediatePath, authorizableId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getNodeTest() {
        String path = null;
        String name = null;
        // Void response = api.getNode(path, name);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getPackageTest() {
        String group = null;
        String name = null;
        String version = null;
        // File response = api.getPackage(group, name, version);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getPackageFilterTest() {
        String group = null;
        String name = null;
        String version = null;
        // String response = api.getPackageFilter(group, name, version);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getQueryTest() {
        String path = null;
        BigDecimal pLimit = null;
        String _1Property = null;
        String _1PropertyValue = null;
        // String response = api.getQuery(path, pLimit, _1Property, _1PropertyValue);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getTruststoreTest() {
        // File response = api.getTruststore();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getTruststoreInfoTest() {
        // TruststoreInfo response = api.getTruststoreInfo();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postAgentTest() {
        String runmode = null;
        String name = null;
        Boolean jcrcontentcqdistribute = null;
        String jcrcontentcqdistributeAtTypeHint = null;
        String jcrcontentcqname = null;
        String jcrcontentcqtemplate = null;
        Boolean jcrcontentenabled = null;
        String jcrcontentjcrdescription = null;
        String jcrcontentjcrlastModified = null;
        String jcrcontentjcrlastModifiedBy = null;
        String jcrcontentjcrmixinTypes = null;
        String jcrcontentjcrtitle = null;
        String jcrcontentlogLevel = null;
        Boolean jcrcontentnoStatusUpdate = null;
        Boolean jcrcontentnoVersioning = null;
        BigDecimal jcrcontentprotocolConnectTimeout = null;
        Boolean jcrcontentprotocolHTTPConnectionClosed = null;
        String jcrcontentprotocolHTTPExpired = null;
        List<String> jcrcontentprotocolHTTPHeaders = null;
        String jcrcontentprotocolHTTPHeadersAtTypeHint = null;
        String jcrcontentprotocolHTTPMethod = null;
        Boolean jcrcontentprotocolHTTPSRelaxed = null;
        String jcrcontentprotocolInterface = null;
        BigDecimal jcrcontentprotocolSocketTimeout = null;
        String jcrcontentprotocolVersion = null;
        String jcrcontentproxyNTLMDomain = null;
        String jcrcontentproxyNTLMHost = null;
        String jcrcontentproxyHost = null;
        String jcrcontentproxyPassword = null;
        BigDecimal jcrcontentproxyPort = null;
        String jcrcontentproxyUser = null;
        BigDecimal jcrcontentqueueBatchMaxSize = null;
        String jcrcontentqueueBatchMode = null;
        BigDecimal jcrcontentqueueBatchWaitTime = null;
        String jcrcontentretryDelay = null;
        Boolean jcrcontentreverseReplication = null;
        String jcrcontentserializationType = null;
        String jcrcontentslingresourceType = null;
        String jcrcontentssl = null;
        String jcrcontenttransportNTLMDomain = null;
        String jcrcontenttransportNTLMHost = null;
        String jcrcontenttransportPassword = null;
        String jcrcontenttransportUri = null;
        String jcrcontenttransportUser = null;
        Boolean jcrcontenttriggerDistribute = null;
        Boolean jcrcontenttriggerModified = null;
        Boolean jcrcontenttriggerOnOffTime = null;
        Boolean jcrcontenttriggerReceive = null;
        Boolean jcrcontenttriggerSpecific = null;
        String jcrcontentuserId = null;
        String jcrprimaryType = null;
        String operation = null;
        // Void response = api.postAgent(runmode, name, jcrcontentcqdistribute, jcrcontentcqdistributeAtTypeHint, jcrcontentcqname, jcrcontentcqtemplate, jcrcontentenabled, jcrcontentjcrdescription, jcrcontentjcrlastModified, jcrcontentjcrlastModifiedBy, jcrcontentjcrmixinTypes, jcrcontentjcrtitle, jcrcontentlogLevel, jcrcontentnoStatusUpdate, jcrcontentnoVersioning, jcrcontentprotocolConnectTimeout, jcrcontentprotocolHTTPConnectionClosed, jcrcontentprotocolHTTPExpired, jcrcontentprotocolHTTPHeaders, jcrcontentprotocolHTTPHeadersAtTypeHint, jcrcontentprotocolHTTPMethod, jcrcontentprotocolHTTPSRelaxed, jcrcontentprotocolInterface, jcrcontentprotocolSocketTimeout, jcrcontentprotocolVersion, jcrcontentproxyNTLMDomain, jcrcontentproxyNTLMHost, jcrcontentproxyHost, jcrcontentproxyPassword, jcrcontentproxyPort, jcrcontentproxyUser, jcrcontentqueueBatchMaxSize, jcrcontentqueueBatchMode, jcrcontentqueueBatchWaitTime, jcrcontentretryDelay, jcrcontentreverseReplication, jcrcontentserializationType, jcrcontentslingresourceType, jcrcontentssl, jcrcontenttransportNTLMDomain, jcrcontenttransportNTLMHost, jcrcontenttransportPassword, jcrcontenttransportUri, jcrcontenttransportUser, jcrcontenttriggerDistribute, jcrcontenttriggerModified, jcrcontenttriggerOnOffTime, jcrcontenttriggerReceive, jcrcontenttriggerSpecific, jcrcontentuserId, jcrprimaryType, operation);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postAuthorizableKeystoreTest() {
        String intermediatePath = null;
        String authorizableId = null;
        File certChain = null;
        File keyStore = null;
        File pk = null;
        String operation = null;
        String currentPassword = null;
        String newPassword = null;
        String rePassword = null;
        String keyPassword = null;
        String keyStorePass = null;
        String alias = null;
        String newAlias = null;
        String removeAlias = null;
        // KeystoreInfo response = api.postAuthorizableKeystore(intermediatePath, authorizableId, certChain, keyStore, pk, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postAuthorizablesTest() {
        String authorizableId = null;
        String intermediatePath = null;
        String createUser = null;
        String createGroup = null;
        String reppassword = null;
        String profilegivenName = null;
        // String response = api.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, reppassword, profilegivenName);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postConfigAdobeGraniteSamlAuthenticationHandlerTest() {
        String keyStorePassword = null;
        String keyStorePasswordAtTypeHint = null;
        Integer serviceRanking = null;
        String serviceRankingAtTypeHint = null;
        Boolean idpHttpRedirect = null;
        String idpHttpRedirectAtTypeHint = null;
        Boolean createUser = null;
        String createUserAtTypeHint = null;
        String defaultRedirectUrl = null;
        String defaultRedirectUrlAtTypeHint = null;
        String userIDAttribute = null;
        String userIDAttributeAtTypeHint = null;
        List<String> defaultGroups = null;
        String defaultGroupsAtTypeHint = null;
        String idpCertAlias = null;
        String idpCertAliasAtTypeHint = null;
        Boolean addGroupMemberships = null;
        String addGroupMembershipsAtTypeHint = null;
        List<String> path = null;
        String pathAtTypeHint = null;
        List<String> synchronizeAttributes = null;
        String synchronizeAttributesAtTypeHint = null;
        Integer clockTolerance = null;
        String clockToleranceAtTypeHint = null;
        String groupMembershipAttribute = null;
        String groupMembershipAttributeAtTypeHint = null;
        String idpUrl = null;
        String idpUrlAtTypeHint = null;
        String logoutUrl = null;
        String logoutUrlAtTypeHint = null;
        String serviceProviderEntityId = null;
        String serviceProviderEntityIdAtTypeHint = null;
        String assertionConsumerServiceURL = null;
        String assertionConsumerServiceURLAtTypeHint = null;
        Boolean handleLogout = null;
        String handleLogoutAtTypeHint = null;
        String spPrivateKeyAlias = null;
        String spPrivateKeyAliasAtTypeHint = null;
        Boolean useEncryption = null;
        String useEncryptionAtTypeHint = null;
        String nameIdFormat = null;
        String nameIdFormatAtTypeHint = null;
        String digestMethod = null;
        String digestMethodAtTypeHint = null;
        String signatureMethod = null;
        String signatureMethodAtTypeHint = null;
        String userIntermediatePath = null;
        String userIntermediatePathAtTypeHint = null;
        // Void response = api.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, serviceRanking, serviceRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postConfigApacheFelixJettyBasedHttpServiceTest() {
        Boolean orgApacheFelixHttpsNio = null;
        String orgApacheFelixHttpsNioAtTypeHint = null;
        String orgApacheFelixHttpsKeystore = null;
        String orgApacheFelixHttpsKeystoreAtTypeHint = null;
        String orgApacheFelixHttpsKeystorePassword = null;
        String orgApacheFelixHttpsKeystorePasswordAtTypeHint = null;
        String orgApacheFelixHttpsKeystoreKey = null;
        String orgApacheFelixHttpsKeystoreKeyAtTypeHint = null;
        String orgApacheFelixHttpsKeystoreKeyPassword = null;
        String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint = null;
        String orgApacheFelixHttpsTruststore = null;
        String orgApacheFelixHttpsTruststoreAtTypeHint = null;
        String orgApacheFelixHttpsTruststorePassword = null;
        String orgApacheFelixHttpsTruststorePasswordAtTypeHint = null;
        String orgApacheFelixHttpsClientcertificate = null;
        String orgApacheFelixHttpsClientcertificateAtTypeHint = null;
        Boolean orgApacheFelixHttpsEnable = null;
        String orgApacheFelixHttpsEnableAtTypeHint = null;
        String orgOsgiServiceHttpPortSecure = null;
        String orgOsgiServiceHttpPortSecureAtTypeHint = null;
        // Void response = api.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioAtTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreAtTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordAtTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyAtTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreAtTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordAtTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateAtTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableAtTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureAtTypeHint);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postConfigApacheHttpComponentsProxyConfigurationTest() {
        String proxyHost = null;
        String proxyHostAtTypeHint = null;
        Integer proxyPort = null;
        String proxyPortAtTypeHint = null;
        List<String> proxyExceptions = null;
        String proxyExceptionsAtTypeHint = null;
        Boolean proxyEnabled = null;
        String proxyEnabledAtTypeHint = null;
        String proxyUser = null;
        String proxyUserAtTypeHint = null;
        String proxyPassword = null;
        String proxyPasswordAtTypeHint = null;
        // Void response = api.postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostAtTypeHint, proxyPort, proxyPortAtTypeHint, proxyExceptions, proxyExceptionsAtTypeHint, proxyEnabled, proxyEnabledAtTypeHint, proxyUser, proxyUserAtTypeHint, proxyPassword, proxyPasswordAtTypeHint);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postConfigApacheSlingDavExServletTest() {
        String alias = null;
        String aliasAtTypeHint = null;
        Boolean davCreateAbsoluteUri = null;
        String davCreateAbsoluteUriAtTypeHint = null;
        // Void response = api.postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriAtTypeHint);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postConfigApacheSlingGetServletTest() {
        String jsonMaximumresults = null;
        String jsonMaximumresultsAtTypeHint = null;
        Boolean enableHtml = null;
        String enableHtmlAtTypeHint = null;
        Boolean enableTxt = null;
        String enableTxtAtTypeHint = null;
        Boolean enableXml = null;
        String enableXmlAtTypeHint = null;
        // Void response = api.postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsAtTypeHint, enableHtml, enableHtmlAtTypeHint, enableTxt, enableTxtAtTypeHint, enableXml, enableXmlAtTypeHint);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postConfigApacheSlingReferrerFilterTest() {
        Boolean allowEmpty = null;
        String allowEmptyAtTypeHint = null;
        String allowHosts = null;
        String allowHostsAtTypeHint = null;
        String allowHostsRegexp = null;
        String allowHostsRegexpAtTypeHint = null;
        String filterMethods = null;
        String filterMethodsAtTypeHint = null;
        // Void response = api.postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyAtTypeHint, allowHosts, allowHostsAtTypeHint, allowHostsRegexp, allowHostsRegexpAtTypeHint, filterMethods, filterMethodsAtTypeHint);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postConfigPropertyTest() {
        String configNodeName = null;
        // Void response = api.postConfigProperty(configNodeName);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postNodeTest() {
        String path = null;
        String name = null;
        File file = null;
        String operation = null;
        String deleteAuthorizable = null;
        // Void response = api.postNode(path, name, file, operation, deleteAuthorizable);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postNodeRwTest() {
        String path = null;
        String name = null;
        String addMembers = null;
        // Void response = api.postNodeRw(path, name, addMembers);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postPathTest() {
        String path = null;
        String jcrprimaryType = null;
        String name = null;
        // Void response = api.postPath(path, jcrprimaryType, name);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postQueryTest() {
        String path = null;
        BigDecimal pLimit = null;
        String _1Property = null;
        String _1PropertyValue = null;
        // String response = api.postQuery(path, pLimit, _1Property, _1PropertyValue);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postTreeActivationTest() {
        Boolean ignoredeactivated = null;
        Boolean onlymodified = null;
        String path = null;
        String cmd = null;
        // Void response = api.postTreeActivation(ignoredeactivated, onlymodified, path, cmd);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postTruststoreTest() {
        File certificate = null;
        String operation = null;
        String newPassword = null;
        String rePassword = null;
        String keyStoreType = null;
        String removeAlias = null;
        // String response = api.postTruststore(certificate, operation, newPassword, rePassword, keyStoreType, removeAlias);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postTruststorePKCS12Test() {
        File truststoreP12 = null;
        // String response = api.postTruststorePKCS12(truststoreP12);

        // TODO: test validations
    }
}
