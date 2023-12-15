package io.swagger.client.api.adobeApi;

import io.swagger.client.service.adobeService.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CustomApi {
  /**
   * 
   * 
   * @param tags  (optional)
   * @param combineTagsOr  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("system/health")
  Call<String> getAemHealthCheck(
        @retrofit2.http.Query("tags") String tags                ,     @retrofit2.http.Query("combineTagsOr") Boolean combineTagsOr                
  );

  /**
   * 
   * 
   * @param bundlesIgnored  (optional)
   * @param bundlesIgnoredAtTypeHint  (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck")
  Call<Void> postConfigAemHealthCheckServlet(
        @retrofit2.http.Query("bundles.ignored") List<String> bundlesIgnored                ,     @retrofit2.http.Query("bundles.ignored@TypeHint") String bundlesIgnoredAtTypeHint                
  );

  /**
   * 
   * 
   * @param pwdresetAuthorizables  (optional)
   * @param pwdresetAuthorizablesAtTypeHint  (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("apps/system/config/com.shinesolutions.aem.passwordreset.Activator")
  Call<Void> postConfigAemPasswordReset(
        @retrofit2.http.Query("pwdreset.authorizables") List<String> pwdresetAuthorizables                ,     @retrofit2.http.Query("pwdreset.authorizables@TypeHint") String pwdresetAuthorizablesAtTypeHint                
  );

}
