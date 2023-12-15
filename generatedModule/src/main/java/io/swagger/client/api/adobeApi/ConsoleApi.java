package io.swagger.client.api.adobeApi;

import io.swagger.client.service.adobeService.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.adobeModel.BundleInfo;
import io.swagger.client.model.adobeModel.SamlConfigurationInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ConsoleApi {
  /**
   * 
   * 
   * @return Call&lt;List&lt;String&gt;&gt;
   */
  @GET("system/console/status-productinfo.json")
  Call<List<String>> getAemProductInfo();
    

  /**
   * 
   * 
   * @param name  (required)
   * @return Call&lt;BundleInfo&gt;
   */
  @GET("system/console/bundles/{name}.json")
  Call<BundleInfo> getBundleInfo(
            @retrofit2.http.Path("name") String name            
  );

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("system/console/configMgr")
  Call<String> getConfigMgr();
    

  /**
   * 
   * 
   * @param name  (required)
   * @param action  (required)
   * @return Call&lt;Void&gt;
   */
  @POST("system/console/bundles/{name}")
  Call<Void> postBundle(
            @retrofit2.http.Path("name") String name            ,     @retrofit2.http.Query("action") String action                
  );

  /**
   * 
   * 
   * @param action  (required)
   * @return Call&lt;Void&gt;
   */
  @POST("system/console/jmx/com.adobe.granite:type=Repository/op/{action}")
  Call<Void> postJmxRepository(
            @retrofit2.http.Path("action") String action            
  );

  /**
   * 
   * 
   * @param post  (optional)
   * @param apply  (optional)
   * @param delete  (optional)
   * @param action  (optional)
   * @param $location  (optional)
   * @param path  (optional)
   * @param serviceRanking  (optional)
   * @param idpUrl  (optional)
   * @param idpCertAlias  (optional)
   * @param idpHttpRedirect  (optional)
   * @param serviceProviderEntityId  (optional)
   * @param assertionConsumerServiceURL  (optional)
   * @param spPrivateKeyAlias  (optional)
   * @param keyStorePassword  (optional)
   * @param defaultRedirectUrl  (optional)
   * @param userIDAttribute  (optional)
   * @param useEncryption  (optional)
   * @param createUser  (optional)
   * @param addGroupMemberships  (optional)
   * @param groupMembershipAttribute  (optional)
   * @param defaultGroups  (optional)
   * @param nameIdFormat  (optional)
   * @param synchronizeAttributes  (optional)
   * @param handleLogout  (optional)
   * @param logoutUrl  (optional)
   * @param clockTolerance  (optional)
   * @param digestMethod  (optional)
   * @param signatureMethod  (optional)
   * @param userIntermediatePath  (optional)
   * @param propertylist  (optional)
   * @return Call&lt;SamlConfigurationInfo&gt;
   */
  @POST("system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler")
  Call<SamlConfigurationInfo> postSamlConfiguration(
        @retrofit2.http.Query("post") Boolean post                ,     @retrofit2.http.Query("apply") Boolean apply                ,     @retrofit2.http.Query("delete") Boolean delete                ,     @retrofit2.http.Query("action") String action                ,     @retrofit2.http.Query("$location") String $location                ,     @retrofit2.http.Query("path") List<String> path                ,     @retrofit2.http.Query("service.ranking") Integer serviceRanking                ,     @retrofit2.http.Query("idpUrl") String idpUrl                ,     @retrofit2.http.Query("idpCertAlias") String idpCertAlias                ,     @retrofit2.http.Query("idpHttpRedirect") Boolean idpHttpRedirect                ,     @retrofit2.http.Query("serviceProviderEntityId") String serviceProviderEntityId                ,     @retrofit2.http.Query("assertionConsumerServiceURL") String assertionConsumerServiceURL                ,     @retrofit2.http.Query("spPrivateKeyAlias") String spPrivateKeyAlias                ,     @retrofit2.http.Query("keyStorePassword") String keyStorePassword                ,     @retrofit2.http.Query("defaultRedirectUrl") String defaultRedirectUrl                ,     @retrofit2.http.Query("userIDAttribute") String userIDAttribute                ,     @retrofit2.http.Query("useEncryption") Boolean useEncryption                ,     @retrofit2.http.Query("createUser") Boolean createUser                ,     @retrofit2.http.Query("addGroupMemberships") Boolean addGroupMemberships                ,     @retrofit2.http.Query("groupMembershipAttribute") String groupMembershipAttribute                ,     @retrofit2.http.Query("defaultGroups") List<String> defaultGroups                ,     @retrofit2.http.Query("nameIdFormat") String nameIdFormat                ,     @retrofit2.http.Query("synchronizeAttributes") List<String> synchronizeAttributes                ,     @retrofit2.http.Query("handleLogout") Boolean handleLogout                ,     @retrofit2.http.Query("logoutUrl") String logoutUrl                ,     @retrofit2.http.Query("clockTolerance") Integer clockTolerance                ,     @retrofit2.http.Query("digestMethod") String digestMethod                ,     @retrofit2.http.Query("signatureMethod") String signatureMethod                ,     @retrofit2.http.Query("userIntermediatePath") String userIntermediatePath                ,     @retrofit2.http.Query("propertylist") List<String> propertylist                
  );

}
