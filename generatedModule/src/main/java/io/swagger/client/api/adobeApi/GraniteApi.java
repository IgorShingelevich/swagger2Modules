package io.swagger.client.api.adobeApi;

import io.swagger.client.service.adobeService.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GraniteApi {
  /**
   * 
   * 
   * @param keystorePassword  (required)
   * @param keystorePasswordConfirm  (required)
   * @param truststorePassword  (required)
   * @param truststorePasswordConfirm  (required)
   * @param httpsHostname  (required)
   * @param httpsPort  (required)
   * @param certificateFile  (optional)
   * @param privatekeyFile  (optional)
   * @return Call&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("libs/granite/security/post/sslSetup.html")
  Call<String> sslSetup(
        @retrofit2.http.Query("keystorePassword") String keystorePassword                ,     @retrofit2.http.Query("keystorePasswordConfirm") String keystorePasswordConfirm                ,     @retrofit2.http.Query("truststorePassword") String truststorePassword                ,     @retrofit2.http.Query("truststorePasswordConfirm") String truststorePasswordConfirm                ,     @retrofit2.http.Query("httpsHostname") String httpsHostname                ,     @retrofit2.http.Query("httpsPort") String httpsPort                ,                     @retrofit2.http.Part("certificateFile\"; filename=\"certificateFile") RequestBody certificateFile,                     @retrofit2.http.Part("privatekeyFile\"; filename=\"privatekeyFile") RequestBody privatekeyFile
  );

}
