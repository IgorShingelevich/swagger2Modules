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

public interface CqApi {
  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("libs/granite/core/content/login.html")
  Call<String> getLoginPage();
    

  /**
   * 
   * 
   * @param authorizableId  (required)
   * @param changelog  (required)
   * @return Call&lt;Void&gt;
   */
  @POST(".cqactions.html")
  Call<Void> postCqActions(
        @retrofit2.http.Query("authorizableId") String authorizableId                ,     @retrofit2.http.Query("changelog") String changelog                
  );

}
