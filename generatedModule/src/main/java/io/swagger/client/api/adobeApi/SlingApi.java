package io.swagger.client.api.adobeApi;

import io.swagger.client.service.adobeService.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import java.math.BigDecimal;
import java.io.File;
import io.swagger.client.model.adobeModel.KeystoreInfo;
import io.swagger.client.model.adobeModel.TruststoreInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SlingApi {
  /**
   * 
   * 
   * @param runmode  (required)
   * @param name  (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("etc/replication/agents.{runmode}/{name}")
  Call<Void> deleteAgent(
            @retrofit2.http.Path("runmode") String runmode            ,         @retrofit2.http.Path("name") String name            
  );

  /**
   * 
   * 
   * @param path  (required)
   * @param name  (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("{path}/{name}")
  Call<Void> deleteNode(
            @retrofit2.http.Path("path") String path            ,         @retrofit2.http.Path("name") String name            
  );

  /**
   * 
   * 
   * @param runmode  (required)
   * @param name  (required)
   * @return Call&lt;Void&gt;
   */
  @GET("etc/replication/agents.{runmode}/{name}")
  Call<Void> getAgent(
            @retrofit2.http.Path("runmode") String runmode            ,         @retrofit2.http.Path("name") String name            
  );

  /**
   * 
   * 
   * @param runmode  (required)
   * @return Call&lt;String&gt;
   */
  @GET("etc/replication/agents.{runmode}.-1.json")
  Call<String> getAgents(
            @retrofit2.http.Path("runmode") String runmode            
  );

  /**
   * 
   * 
   * @param intermediatePath  (required)
   * @param authorizableId  (required)
   * @return Call&lt;KeystoreInfo&gt;
   */
  @GET("{intermediatePath}/{authorizableId}.ks.json")
  Call<KeystoreInfo> getAuthorizableKeystore(
            @retrofit2.http.Path("intermediatePath") String intermediatePath            ,         @retrofit2.http.Path("authorizableId") String authorizableId            
  );

  /**
   * 
   * 
   * @param intermediatePath  (required)
   * @param authorizableId  (required)
   * @return Call&lt;File&gt;
   */
  @GET("{intermediatePath}/{authorizableId}/keystore/store.p12")
  Call<File> getKeystore(
            @retrofit2.http.Path("intermediatePath") String intermediatePath            ,         @retrofit2.http.Path("authorizableId") String authorizableId            
  );

  /**
   * 
   * 
   * @param path  (required)
   * @param name  (required)
   * @return Call&lt;Void&gt;
   */
  @GET("{path}/{name}")
  Call<Void> getNode(
            @retrofit2.http.Path("path") String path            ,         @retrofit2.http.Path("name") String name            
  );

  /**
   * 
   * 
   * @param group  (required)
   * @param name  (required)
   * @param version  (required)
   * @return Call&lt;File&gt;
   */
  @GET("etc/packages/{group}/{name}-{version}.zip")
  Call<File> getPackage(
            @retrofit2.http.Path("group") String group            ,         @retrofit2.http.Path("name") String name            ,         @retrofit2.http.Path("version") String version            
  );

  /**
   * 
   * 
   * @param group  (required)
   * @param name  (required)
   * @param version  (required)
   * @return Call&lt;String&gt;
   */
  @GET("etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json")
  Call<String> getPackageFilter(
            @retrofit2.http.Path("group") String group            ,         @retrofit2.http.Path("name") String name            ,         @retrofit2.http.Path("version") String version            
  );

  /**
   * 
   * 
   * @param path  (required)
   * @param pLimit  (required)
   * @param _1Property  (required)
   * @param _1PropertyValue  (required)
   * @return Call&lt;String&gt;
   */
  @GET("bin/querybuilder.json")
  Call<String> getQuery(
        @retrofit2.http.Query("path") String path                ,     @retrofit2.http.Query("p.limit") BigDecimal pLimit                ,     @retrofit2.http.Query("1_property") String _1Property                ,     @retrofit2.http.Query("1_property.value") String _1PropertyValue                
  );

  /**
   * 
   * 
   * @return Call&lt;File&gt;
   */
  @GET("etc/truststore/truststore.p12")
  Call<File> getTruststore();
    

  /**
   * 
   * 
   * @return Call&lt;TruststoreInfo&gt;
   */
  @GET("libs/granite/security/truststore.json")
  Call<TruststoreInfo> getTruststoreInfo();
    

  /**
   * 
   * 
   * @param runmode  (required)
   * @param name  (required)
   * @param jcrcontentcqdistribute  (optional)
   * @param jcrcontentcqdistributeAtTypeHint  (optional)
   * @param jcrcontentcqname  (optional)
   * @param jcrcontentcqtemplate  (optional)
   * @param jcrcontentenabled  (optional)
   * @param jcrcontentjcrdescription  (optional)
   * @param jcrcontentjcrlastModified  (optional)
   * @param jcrcontentjcrlastModifiedBy  (optional)
   * @param jcrcontentjcrmixinTypes  (optional)
   * @param jcrcontentjcrtitle  (optional)
   * @param jcrcontentlogLevel  (optional)
   * @param jcrcontentnoStatusUpdate  (optional)
   * @param jcrcontentnoVersioning  (optional)
   * @param jcrcontentprotocolConnectTimeout  (optional)
   * @param jcrcontentprotocolHTTPConnectionClosed  (optional)
   * @param jcrcontentprotocolHTTPExpired  (optional)
   * @param jcrcontentprotocolHTTPHeaders  (optional)
   * @param jcrcontentprotocolHTTPHeadersAtTypeHint  (optional)
   * @param jcrcontentprotocolHTTPMethod  (optional)
   * @param jcrcontentprotocolHTTPSRelaxed  (optional)
   * @param jcrcontentprotocolInterface  (optional)
   * @param jcrcontentprotocolSocketTimeout  (optional)
   * @param jcrcontentprotocolVersion  (optional)
   * @param jcrcontentproxyNTLMDomain  (optional)
   * @param jcrcontentproxyNTLMHost  (optional)
   * @param jcrcontentproxyHost  (optional)
   * @param jcrcontentproxyPassword  (optional)
   * @param jcrcontentproxyPort  (optional)
   * @param jcrcontentproxyUser  (optional)
   * @param jcrcontentqueueBatchMaxSize  (optional)
   * @param jcrcontentqueueBatchMode  (optional)
   * @param jcrcontentqueueBatchWaitTime  (optional)
   * @param jcrcontentretryDelay  (optional)
   * @param jcrcontentreverseReplication  (optional)
   * @param jcrcontentserializationType  (optional)
   * @param jcrcontentslingresourceType  (optional)
   * @param jcrcontentssl  (optional)
   * @param jcrcontenttransportNTLMDomain  (optional)
   * @param jcrcontenttransportNTLMHost  (optional)
   * @param jcrcontenttransportPassword  (optional)
   * @param jcrcontenttransportUri  (optional)
   * @param jcrcontenttransportUser  (optional)
   * @param jcrcontenttriggerDistribute  (optional)
   * @param jcrcontenttriggerModified  (optional)
   * @param jcrcontenttriggerOnOffTime  (optional)
   * @param jcrcontenttriggerReceive  (optional)
   * @param jcrcontenttriggerSpecific  (optional)
   * @param jcrcontentuserId  (optional)
   * @param jcrprimaryType  (optional)
   * @param operation  (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("etc/replication/agents.{runmode}/{name}")
  Call<Void> postAgent(
            @retrofit2.http.Path("runmode") String runmode            ,         @retrofit2.http.Path("name") String name            ,     @retrofit2.http.Query("jcr:content/cq:distribute") Boolean jcrcontentcqdistribute                ,     @retrofit2.http.Query("jcr:content/cq:distribute@TypeHint") String jcrcontentcqdistributeAtTypeHint                ,     @retrofit2.http.Query("jcr:content/cq:name") String jcrcontentcqname                ,     @retrofit2.http.Query("jcr:content/cq:template") String jcrcontentcqtemplate                ,     @retrofit2.http.Query("jcr:content/enabled") Boolean jcrcontentenabled                ,     @retrofit2.http.Query("jcr:content/jcr:description") String jcrcontentjcrdescription                ,     @retrofit2.http.Query("jcr:content/jcr:lastModified") String jcrcontentjcrlastModified                ,     @retrofit2.http.Query("jcr:content/jcr:lastModifiedBy") String jcrcontentjcrlastModifiedBy                ,     @retrofit2.http.Query("jcr:content/jcr:mixinTypes") String jcrcontentjcrmixinTypes                ,     @retrofit2.http.Query("jcr:content/jcr:title") String jcrcontentjcrtitle                ,     @retrofit2.http.Query("jcr:content/logLevel") String jcrcontentlogLevel                ,     @retrofit2.http.Query("jcr:content/noStatusUpdate") Boolean jcrcontentnoStatusUpdate                ,     @retrofit2.http.Query("jcr:content/noVersioning") Boolean jcrcontentnoVersioning                ,     @retrofit2.http.Query("jcr:content/protocolConnectTimeout") BigDecimal jcrcontentprotocolConnectTimeout                ,     @retrofit2.http.Query("jcr:content/protocolHTTPConnectionClosed") Boolean jcrcontentprotocolHTTPConnectionClosed                ,     @retrofit2.http.Query("jcr:content/protocolHTTPExpired") String jcrcontentprotocolHTTPExpired                ,     @retrofit2.http.Query("jcr:content/protocolHTTPHeaders") List<String> jcrcontentprotocolHTTPHeaders                ,     @retrofit2.http.Query("jcr:content/protocolHTTPHeaders@TypeHint") String jcrcontentprotocolHTTPHeadersAtTypeHint                ,     @retrofit2.http.Query("jcr:content/protocolHTTPMethod") String jcrcontentprotocolHTTPMethod                ,     @retrofit2.http.Query("jcr:content/protocolHTTPSRelaxed") Boolean jcrcontentprotocolHTTPSRelaxed                ,     @retrofit2.http.Query("jcr:content/protocolInterface") String jcrcontentprotocolInterface                ,     @retrofit2.http.Query("jcr:content/protocolSocketTimeout") BigDecimal jcrcontentprotocolSocketTimeout                ,     @retrofit2.http.Query("jcr:content/protocolVersion") String jcrcontentprotocolVersion                ,     @retrofit2.http.Query("jcr:content/proxyNTLMDomain") String jcrcontentproxyNTLMDomain                ,     @retrofit2.http.Query("jcr:content/proxyNTLMHost") String jcrcontentproxyNTLMHost                ,     @retrofit2.http.Query("jcr:content/proxyHost") String jcrcontentproxyHost                ,     @retrofit2.http.Query("jcr:content/proxyPassword") String jcrcontentproxyPassword                ,     @retrofit2.http.Query("jcr:content/proxyPort") BigDecimal jcrcontentproxyPort                ,     @retrofit2.http.Query("jcr:content/proxyUser") String jcrcontentproxyUser                ,     @retrofit2.http.Query("jcr:content/queueBatchMaxSize") BigDecimal jcrcontentqueueBatchMaxSize                ,     @retrofit2.http.Query("jcr:content/queueBatchMode") String jcrcontentqueueBatchMode                ,     @retrofit2.http.Query("jcr:content/queueBatchWaitTime") BigDecimal jcrcontentqueueBatchWaitTime                ,     @retrofit2.http.Query("jcr:content/retryDelay") String jcrcontentretryDelay                ,     @retrofit2.http.Query("jcr:content/reverseReplication") Boolean jcrcontentreverseReplication                ,     @retrofit2.http.Query("jcr:content/serializationType") String jcrcontentserializationType                ,     @retrofit2.http.Query("jcr:content/sling:resourceType") String jcrcontentslingresourceType                ,     @retrofit2.http.Query("jcr:content/ssl") String jcrcontentssl                ,     @retrofit2.http.Query("jcr:content/transportNTLMDomain") String jcrcontenttransportNTLMDomain                ,     @retrofit2.http.Query("jcr:content/transportNTLMHost") String jcrcontenttransportNTLMHost                ,     @retrofit2.http.Query("jcr:content/transportPassword") String jcrcontenttransportPassword                ,     @retrofit2.http.Query("jcr:content/transportUri") String jcrcontenttransportUri                ,     @retrofit2.http.Query("jcr:content/transportUser") String jcrcontenttransportUser                ,     @retrofit2.http.Query("jcr:content/triggerDistribute") Boolean jcrcontenttriggerDistribute                ,     @retrofit2.http.Query("jcr:content/triggerModified") Boolean jcrcontenttriggerModified                ,     @retrofit2.http.Query("jcr:content/triggerOnOffTime") Boolean jcrcontenttriggerOnOffTime                ,     @retrofit2.http.Query("jcr:content/triggerReceive") Boolean jcrcontenttriggerReceive                ,     @retrofit2.http.Query("jcr:content/triggerSpecific") Boolean jcrcontenttriggerSpecific                ,     @retrofit2.http.Query("jcr:content/userId") String jcrcontentuserId                ,     @retrofit2.http.Query("jcr:primaryType") String jcrprimaryType                ,     @retrofit2.http.Query(":operation") String operation                
  );

  /**
   * 
   * 
   * @param intermediatePath  (required)
   * @param authorizableId  (required)
   * @param certChain  (optional)
   * @param keyStore  (optional)
   * @param pk  (optional)
   * @param operation  (optional)
   * @param currentPassword  (optional)
   * @param newPassword  (optional)
   * @param rePassword  (optional)
   * @param keyPassword  (optional)
   * @param keyStorePass  (optional)
   * @param alias  (optional)
   * @param newAlias  (optional)
   * @param removeAlias  (optional)
   * @return Call&lt;KeystoreInfo&gt;
   */
  @retrofit2.http.Multipart
  @POST("{intermediatePath}/{authorizableId}.ks.html")
  Call<KeystoreInfo> postAuthorizableKeystore(
            @retrofit2.http.Path("intermediatePath") String intermediatePath            ,         @retrofit2.http.Path("authorizableId") String authorizableId            ,                     @retrofit2.http.Part("cert-chain\"; filename=\"cert-chain") RequestBody certChain,                     @retrofit2.http.Part("keyStore\"; filename=\"keyStore") RequestBody keyStore,                     @retrofit2.http.Part("pk\"; filename=\"pk") RequestBody pk,     @retrofit2.http.Query(":operation") String operation                ,     @retrofit2.http.Query("currentPassword") String currentPassword                ,     @retrofit2.http.Query("newPassword") String newPassword                ,     @retrofit2.http.Query("rePassword") String rePassword                ,     @retrofit2.http.Query("keyPassword") String keyPassword                ,     @retrofit2.http.Query("keyStorePass") String keyStorePass                ,     @retrofit2.http.Query("alias") String alias                ,     @retrofit2.http.Query("newAlias") String newAlias                ,     @retrofit2.http.Query("removeAlias") String removeAlias                
  );

  /**
   * 
   * 
   * @param authorizableId  (required)
   * @param intermediatePath  (required)
   * @param createUser  (optional)
   * @param createGroup  (optional)
   * @param reppassword  (optional)
   * @param profilegivenName  (optional)
   * @return Call&lt;String&gt;
   */
  @POST("libs/granite/security/post/authorizables")
  Call<String> postAuthorizables(
        @retrofit2.http.Query("authorizableId") String authorizableId                ,     @retrofit2.http.Query("intermediatePath") String intermediatePath                ,     @retrofit2.http.Query("createUser") String createUser                ,     @retrofit2.http.Query("createGroup") String createGroup                ,     @retrofit2.http.Query("rep:password") String reppassword                ,     @retrofit2.http.Query("profile/givenName") String profilegivenName                
  );

  /**
   * 
   * 
   * @param keyStorePassword  (optional)
   * @param keyStorePasswordAtTypeHint  (optional)
   * @param serviceRanking  (optional)
   * @param serviceRankingAtTypeHint  (optional)
   * @param idpHttpRedirect  (optional)
   * @param idpHttpRedirectAtTypeHint  (optional)
   * @param createUser  (optional)
   * @param createUserAtTypeHint  (optional)
   * @param defaultRedirectUrl  (optional)
   * @param defaultRedirectUrlAtTypeHint  (optional)
   * @param userIDAttribute  (optional)
   * @param userIDAttributeAtTypeHint  (optional)
   * @param defaultGroups  (optional)
   * @param defaultGroupsAtTypeHint  (optional)
   * @param idpCertAlias  (optional)
   * @param idpCertAliasAtTypeHint  (optional)
   * @param addGroupMemberships  (optional)
   * @param addGroupMembershipsAtTypeHint  (optional)
   * @param path  (optional)
   * @param pathAtTypeHint  (optional)
   * @param synchronizeAttributes  (optional)
   * @param synchronizeAttributesAtTypeHint  (optional)
   * @param clockTolerance  (optional)
   * @param clockToleranceAtTypeHint  (optional)
   * @param groupMembershipAttribute  (optional)
   * @param groupMembershipAttributeAtTypeHint  (optional)
   * @param idpUrl  (optional)
   * @param idpUrlAtTypeHint  (optional)
   * @param logoutUrl  (optional)
   * @param logoutUrlAtTypeHint  (optional)
   * @param serviceProviderEntityId  (optional)
   * @param serviceProviderEntityIdAtTypeHint  (optional)
   * @param assertionConsumerServiceURL  (optional)
   * @param assertionConsumerServiceURLAtTypeHint  (optional)
   * @param handleLogout  (optional)
   * @param handleLogoutAtTypeHint  (optional)
   * @param spPrivateKeyAlias  (optional)
   * @param spPrivateKeyAliasAtTypeHint  (optional)
   * @param useEncryption  (optional)
   * @param useEncryptionAtTypeHint  (optional)
   * @param nameIdFormat  (optional)
   * @param nameIdFormatAtTypeHint  (optional)
   * @param digestMethod  (optional)
   * @param digestMethodAtTypeHint  (optional)
   * @param signatureMethod  (optional)
   * @param signatureMethodAtTypeHint  (optional)
   * @param userIntermediatePath  (optional)
   * @param userIntermediatePathAtTypeHint  (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config")
  Call<Void> postConfigAdobeGraniteSamlAuthenticationHandler(
        @retrofit2.http.Query("keyStorePassword") String keyStorePassword                ,     @retrofit2.http.Query("keyStorePassword@TypeHint") String keyStorePasswordAtTypeHint                ,     @retrofit2.http.Query("service.ranking") Integer serviceRanking                ,     @retrofit2.http.Query("service.ranking@TypeHint") String serviceRankingAtTypeHint                ,     @retrofit2.http.Query("idpHttpRedirect") Boolean idpHttpRedirect                ,     @retrofit2.http.Query("idpHttpRedirect@TypeHint") String idpHttpRedirectAtTypeHint                ,     @retrofit2.http.Query("createUser") Boolean createUser                ,     @retrofit2.http.Query("createUser@TypeHint") String createUserAtTypeHint                ,     @retrofit2.http.Query("defaultRedirectUrl") String defaultRedirectUrl                ,     @retrofit2.http.Query("defaultRedirectUrl@TypeHint") String defaultRedirectUrlAtTypeHint                ,     @retrofit2.http.Query("userIDAttribute") String userIDAttribute                ,     @retrofit2.http.Query("userIDAttribute@TypeHint") String userIDAttributeAtTypeHint                ,     @retrofit2.http.Query("defaultGroups") List<String> defaultGroups                ,     @retrofit2.http.Query("defaultGroups@TypeHint") String defaultGroupsAtTypeHint                ,     @retrofit2.http.Query("idpCertAlias") String idpCertAlias                ,     @retrofit2.http.Query("idpCertAlias@TypeHint") String idpCertAliasAtTypeHint                ,     @retrofit2.http.Query("addGroupMemberships") Boolean addGroupMemberships                ,     @retrofit2.http.Query("addGroupMemberships@TypeHint") String addGroupMembershipsAtTypeHint                ,     @retrofit2.http.Query("path") List<String> path                ,     @retrofit2.http.Query("path@TypeHint") String pathAtTypeHint                ,     @retrofit2.http.Query("synchronizeAttributes") List<String> synchronizeAttributes                ,     @retrofit2.http.Query("synchronizeAttributes@TypeHint") String synchronizeAttributesAtTypeHint                ,     @retrofit2.http.Query("clockTolerance") Integer clockTolerance                ,     @retrofit2.http.Query("clockTolerance@TypeHint") String clockToleranceAtTypeHint                ,     @retrofit2.http.Query("groupMembershipAttribute") String groupMembershipAttribute                ,     @retrofit2.http.Query("groupMembershipAttribute@TypeHint") String groupMembershipAttributeAtTypeHint                ,     @retrofit2.http.Query("idpUrl") String idpUrl                ,     @retrofit2.http.Query("idpUrl@TypeHint") String idpUrlAtTypeHint                ,     @retrofit2.http.Query("logoutUrl") String logoutUrl                ,     @retrofit2.http.Query("logoutUrl@TypeHint") String logoutUrlAtTypeHint                ,     @retrofit2.http.Query("serviceProviderEntityId") String serviceProviderEntityId                ,     @retrofit2.http.Query("serviceProviderEntityId@TypeHint") String serviceProviderEntityIdAtTypeHint                ,     @retrofit2.http.Query("assertionConsumerServiceURL") String assertionConsumerServiceURL                ,     @retrofit2.http.Query("assertionConsumerServiceURL@TypeHint") String assertionConsumerServiceURLAtTypeHint                ,     @retrofit2.http.Query("handleLogout") Boolean handleLogout                ,     @retrofit2.http.Query("handleLogout@TypeHint") String handleLogoutAtTypeHint                ,     @retrofit2.http.Query("spPrivateKeyAlias") String spPrivateKeyAlias                ,     @retrofit2.http.Query("spPrivateKeyAlias@TypeHint") String spPrivateKeyAliasAtTypeHint                ,     @retrofit2.http.Query("useEncryption") Boolean useEncryption                ,     @retrofit2.http.Query("useEncryption@TypeHint") String useEncryptionAtTypeHint                ,     @retrofit2.http.Query("nameIdFormat") String nameIdFormat                ,     @retrofit2.http.Query("nameIdFormat@TypeHint") String nameIdFormatAtTypeHint                ,     @retrofit2.http.Query("digestMethod") String digestMethod                ,     @retrofit2.http.Query("digestMethod@TypeHint") String digestMethodAtTypeHint                ,     @retrofit2.http.Query("signatureMethod") String signatureMethod                ,     @retrofit2.http.Query("signatureMethod@TypeHint") String signatureMethodAtTypeHint                ,     @retrofit2.http.Query("userIntermediatePath") String userIntermediatePath                ,     @retrofit2.http.Query("userIntermediatePath@TypeHint") String userIntermediatePathAtTypeHint                
  );

  /**
   * 
   * 
   * @param orgApacheFelixHttpsNio  (optional)
   * @param orgApacheFelixHttpsNioAtTypeHint  (optional)
   * @param orgApacheFelixHttpsKeystore  (optional)
   * @param orgApacheFelixHttpsKeystoreAtTypeHint  (optional)
   * @param orgApacheFelixHttpsKeystorePassword  (optional)
   * @param orgApacheFelixHttpsKeystorePasswordAtTypeHint  (optional)
   * @param orgApacheFelixHttpsKeystoreKey  (optional)
   * @param orgApacheFelixHttpsKeystoreKeyAtTypeHint  (optional)
   * @param orgApacheFelixHttpsKeystoreKeyPassword  (optional)
   * @param orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint  (optional)
   * @param orgApacheFelixHttpsTruststore  (optional)
   * @param orgApacheFelixHttpsTruststoreAtTypeHint  (optional)
   * @param orgApacheFelixHttpsTruststorePassword  (optional)
   * @param orgApacheFelixHttpsTruststorePasswordAtTypeHint  (optional)
   * @param orgApacheFelixHttpsClientcertificate  (optional)
   * @param orgApacheFelixHttpsClientcertificateAtTypeHint  (optional)
   * @param orgApacheFelixHttpsEnable  (optional)
   * @param orgApacheFelixHttpsEnableAtTypeHint  (optional)
   * @param orgOsgiServiceHttpPortSecure  (optional)
   * @param orgOsgiServiceHttpPortSecureAtTypeHint  (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("apps/system/config/org.apache.felix.http")
  Call<Void> postConfigApacheFelixJettyBasedHttpService(
        @retrofit2.http.Query("org.apache.felix.https.nio") Boolean orgApacheFelixHttpsNio                ,     @retrofit2.http.Query("org.apache.felix.https.nio@TypeHint") String orgApacheFelixHttpsNioAtTypeHint                ,     @retrofit2.http.Query("org.apache.felix.https.keystore") String orgApacheFelixHttpsKeystore                ,     @retrofit2.http.Query("org.apache.felix.https.keystore@TypeHint") String orgApacheFelixHttpsKeystoreAtTypeHint                ,     @retrofit2.http.Query("org.apache.felix.https.keystore.password") String orgApacheFelixHttpsKeystorePassword                ,     @retrofit2.http.Query("org.apache.felix.https.keystore.password@TypeHint") String orgApacheFelixHttpsKeystorePasswordAtTypeHint                ,     @retrofit2.http.Query("org.apache.felix.https.keystore.key") String orgApacheFelixHttpsKeystoreKey                ,     @retrofit2.http.Query("org.apache.felix.https.keystore.key@TypeHint") String orgApacheFelixHttpsKeystoreKeyAtTypeHint                ,     @retrofit2.http.Query("org.apache.felix.https.keystore.key.password") String orgApacheFelixHttpsKeystoreKeyPassword                ,     @retrofit2.http.Query("org.apache.felix.https.keystore.key.password@TypeHint") String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint                ,     @retrofit2.http.Query("org.apache.felix.https.truststore") String orgApacheFelixHttpsTruststore                ,     @retrofit2.http.Query("org.apache.felix.https.truststore@TypeHint") String orgApacheFelixHttpsTruststoreAtTypeHint                ,     @retrofit2.http.Query("org.apache.felix.https.truststore.password") String orgApacheFelixHttpsTruststorePassword                ,     @retrofit2.http.Query("org.apache.felix.https.truststore.password@TypeHint") String orgApacheFelixHttpsTruststorePasswordAtTypeHint                ,     @retrofit2.http.Query("org.apache.felix.https.clientcertificate") String orgApacheFelixHttpsClientcertificate                ,     @retrofit2.http.Query("org.apache.felix.https.clientcertificate@TypeHint") String orgApacheFelixHttpsClientcertificateAtTypeHint                ,     @retrofit2.http.Query("org.apache.felix.https.enable") Boolean orgApacheFelixHttpsEnable                ,     @retrofit2.http.Query("org.apache.felix.https.enable@TypeHint") String orgApacheFelixHttpsEnableAtTypeHint                ,     @retrofit2.http.Query("org.osgi.service.http.port.secure") String orgOsgiServiceHttpPortSecure                ,     @retrofit2.http.Query("org.osgi.service.http.port.secure@TypeHint") String orgOsgiServiceHttpPortSecureAtTypeHint                
  );

  /**
   * 
   * 
   * @param proxyHost  (optional)
   * @param proxyHostAtTypeHint  (optional)
   * @param proxyPort  (optional)
   * @param proxyPortAtTypeHint  (optional)
   * @param proxyExceptions  (optional)
   * @param proxyExceptionsAtTypeHint  (optional)
   * @param proxyEnabled  (optional)
   * @param proxyEnabledAtTypeHint  (optional)
   * @param proxyUser  (optional)
   * @param proxyUserAtTypeHint  (optional)
   * @param proxyPassword  (optional)
   * @param proxyPasswordAtTypeHint  (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("apps/system/config/org.apache.http.proxyconfigurator.config")
  Call<Void> postConfigApacheHttpComponentsProxyConfiguration(
        @retrofit2.http.Query("proxy.host") String proxyHost                ,     @retrofit2.http.Query("proxy.host@TypeHint") String proxyHostAtTypeHint                ,     @retrofit2.http.Query("proxy.port") Integer proxyPort                ,     @retrofit2.http.Query("proxy.port@TypeHint") String proxyPortAtTypeHint                ,     @retrofit2.http.Query("proxy.exceptions") List<String> proxyExceptions                ,     @retrofit2.http.Query("proxy.exceptions@TypeHint") String proxyExceptionsAtTypeHint                ,     @retrofit2.http.Query("proxy.enabled") Boolean proxyEnabled                ,     @retrofit2.http.Query("proxy.enabled@TypeHint") String proxyEnabledAtTypeHint                ,     @retrofit2.http.Query("proxy.user") String proxyUser                ,     @retrofit2.http.Query("proxy.user@TypeHint") String proxyUserAtTypeHint                ,     @retrofit2.http.Query("proxy.password") String proxyPassword                ,     @retrofit2.http.Query("proxy.password@TypeHint") String proxyPasswordAtTypeHint                
  );

  /**
   * 
   * 
   * @param alias  (optional)
   * @param aliasAtTypeHint  (optional)
   * @param davCreateAbsoluteUri  (optional)
   * @param davCreateAbsoluteUriAtTypeHint  (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet")
  Call<Void> postConfigApacheSlingDavExServlet(
        @retrofit2.http.Query("alias") String alias                ,     @retrofit2.http.Query("alias@TypeHint") String aliasAtTypeHint                ,     @retrofit2.http.Query("dav.create-absolute-uri") Boolean davCreateAbsoluteUri                ,     @retrofit2.http.Query("dav.create-absolute-uri@TypeHint") String davCreateAbsoluteUriAtTypeHint                
  );

  /**
   * 
   * 
   * @param jsonMaximumresults  (optional)
   * @param jsonMaximumresultsAtTypeHint  (optional)
   * @param enableHtml  (optional)
   * @param enableHtmlAtTypeHint  (optional)
   * @param enableTxt  (optional)
   * @param enableTxtAtTypeHint  (optional)
   * @param enableXml  (optional)
   * @param enableXmlAtTypeHint  (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet")
  Call<Void> postConfigApacheSlingGetServlet(
        @retrofit2.http.Query("json.maximumresults") String jsonMaximumresults                ,     @retrofit2.http.Query("json.maximumresults@TypeHint") String jsonMaximumresultsAtTypeHint                ,     @retrofit2.http.Query("enable.html") Boolean enableHtml                ,     @retrofit2.http.Query("enable.html@TypeHint") String enableHtmlAtTypeHint                ,     @retrofit2.http.Query("enable.txt") Boolean enableTxt                ,     @retrofit2.http.Query("enable.txt@TypeHint") String enableTxtAtTypeHint                ,     @retrofit2.http.Query("enable.xml") Boolean enableXml                ,     @retrofit2.http.Query("enable.xml@TypeHint") String enableXmlAtTypeHint                
  );

  /**
   * 
   * 
   * @param allowEmpty  (optional)
   * @param allowEmptyAtTypeHint  (optional)
   * @param allowHosts  (optional)
   * @param allowHostsAtTypeHint  (optional)
   * @param allowHostsRegexp  (optional)
   * @param allowHostsRegexpAtTypeHint  (optional)
   * @param filterMethods  (optional)
   * @param filterMethodsAtTypeHint  (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("apps/system/config/org.apache.sling.security.impl.ReferrerFilter")
  Call<Void> postConfigApacheSlingReferrerFilter(
        @retrofit2.http.Query("allow.empty") Boolean allowEmpty                ,     @retrofit2.http.Query("allow.empty@TypeHint") String allowEmptyAtTypeHint                ,     @retrofit2.http.Query("allow.hosts") String allowHosts                ,     @retrofit2.http.Query("allow.hosts@TypeHint") String allowHostsAtTypeHint                ,     @retrofit2.http.Query("allow.hosts.regexp") String allowHostsRegexp                ,     @retrofit2.http.Query("allow.hosts.regexp@TypeHint") String allowHostsRegexpAtTypeHint                ,     @retrofit2.http.Query("filter.methods") String filterMethods                ,     @retrofit2.http.Query("filter.methods@TypeHint") String filterMethodsAtTypeHint                
  );

  /**
   * 
   * 
   * @param configNodeName  (required)
   * @return Call&lt;Void&gt;
   */
  @POST("apps/system/config/{configNodeName}")
  Call<Void> postConfigProperty(
            @retrofit2.http.Path("configNodeName") String configNodeName            
  );

  /**
   * 
   * 
   * @param path  (required)
   * @param name  (required)
   * @param file  (optional)
   * @param operation  (optional)
   * @param deleteAuthorizable  (optional)
   * @return Call&lt;Void&gt;
   */
  @retrofit2.http.Multipart
  @POST("{path}/{name}")
  Call<Void> postNode(
            @retrofit2.http.Path("path") String path            ,         @retrofit2.http.Path("name") String name            ,                     @retrofit2.http.Part("file\"; filename=\"file") RequestBody file,     @retrofit2.http.Query(":operation") String operation                ,     @retrofit2.http.Query("deleteAuthorizable") String deleteAuthorizable                
  );

  /**
   * 
   * 
   * @param path  (required)
   * @param name  (required)
   * @param addMembers  (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("{path}/{name}.rw.html")
  Call<Void> postNodeRw(
            @retrofit2.http.Path("path") String path            ,         @retrofit2.http.Path("name") String name            ,     @retrofit2.http.Query("addMembers") String addMembers                
  );

  /**
   * 
   * 
   * @param path  (required)
   * @param jcrprimaryType  (required)
   * @param name  (required)
   * @return Call&lt;Void&gt;
   */
  @POST("{path}/")
  Call<Void> postPath(
            @retrofit2.http.Path("path") String path            ,     @retrofit2.http.Query("jcr:primaryType") String jcrprimaryType                ,     @retrofit2.http.Query(":name") String name                
  );

  /**
   * 
   * 
   * @param path  (required)
   * @param pLimit  (required)
   * @param _1Property  (required)
   * @param _1PropertyValue  (required)
   * @return Call&lt;String&gt;
   */
  @POST("bin/querybuilder.json")
  Call<String> postQuery(
        @retrofit2.http.Query("path") String path                ,     @retrofit2.http.Query("p.limit") BigDecimal pLimit                ,     @retrofit2.http.Query("1_property") String _1Property                ,     @retrofit2.http.Query("1_property.value") String _1PropertyValue                
  );

  /**
   * 
   * 
   * @param ignoredeactivated  (required)
   * @param onlymodified  (required)
   * @param path  (required)
   * @param cmd  (required)
   * @return Call&lt;Void&gt;
   */
  @POST("libs/replication/treeactivation.html")
  Call<Void> postTreeActivation(
        @retrofit2.http.Query("ignoredeactivated") Boolean ignoredeactivated                ,     @retrofit2.http.Query("onlymodified") Boolean onlymodified                ,     @retrofit2.http.Query("path") String path                ,     @retrofit2.http.Query("cmd") String cmd                
  );

  /**
   * 
   * 
   * @param certificate  (optional)
   * @param operation  (optional)
   * @param newPassword  (optional)
   * @param rePassword  (optional)
   * @param keyStoreType  (optional)
   * @param removeAlias  (optional)
   * @return Call&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("libs/granite/security/post/truststore")
  Call<String> postTruststore(
                        @retrofit2.http.Part("certificate\"; filename=\"certificate") RequestBody certificate,     @retrofit2.http.Query(":operation") String operation                ,     @retrofit2.http.Query("newPassword") String newPassword                ,     @retrofit2.http.Query("rePassword") String rePassword                ,     @retrofit2.http.Query("keyStoreType") String keyStoreType                ,     @retrofit2.http.Query("removeAlias") String removeAlias                
  );

  /**
   * 
   * 
   * @param truststoreP12  (optional)
   * @return Call&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("etc/truststore")
  Call<String> postTruststorePKCS12(
                        @retrofit2.http.Part("truststore.p12\"; filename=\"truststore.p12") RequestBody truststoreP12
  );

}
