package io.swagger.client.api.adobeApi;

import io.swagger.client.service.adobeService.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import java.io.File;
import io.swagger.client.model.adobeModel.InstallStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CrxApi {
  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("crx/server/crx.default/jcr:root/.1.json")
  Call<String> getCrxdeStatus();
    

  /**
   * 
   * 
   * @return Call&lt;InstallStatus&gt;
   */
  @GET("crx/packmgr/installstatus.jsp")
  Call<InstallStatus> getInstallStatus();
    

  /**
   * 
   * 
   * @return Call&lt;Void&gt;
   */
  @GET("crx/packmgr/service/script.html")
  Call<Void> getPackageManagerServlet();
    

  /**
   * 
   * 
   * @param cmd  (required)
   * @return Call&lt;String&gt;
   */
  @POST("crx/packmgr/service.jsp")
  Call<String> postPackageService(
        @retrofit2.http.Query("cmd") String cmd                
  );

  /**
   * 
   * 
   * @param cmd  (required)
   * @param path  (required)
   * @param _package  (optional)
   * @param groupName  (optional)
   * @param packageName  (optional)
   * @param packageVersion  (optional)
   * @param _charset_  (optional)
   * @param force  (optional)
   * @param recursive  (optional)
   * @return Call&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("crx/packmgr/service/.json/{path}")
  Call<String> postPackageServiceJson(
        @retrofit2.http.Query("cmd") String cmd                ,         @retrofit2.http.Path("path") String path            ,                     @retrofit2.http.Part("package\"; filename=\"package") RequestBody _package,     @retrofit2.http.Query("groupName") String groupName                ,     @retrofit2.http.Query("packageName") String packageName                ,     @retrofit2.http.Query("packageVersion") String packageVersion                ,     @retrofit2.http.Query("_charset_") String _charset_                ,     @retrofit2.http.Query("force") Boolean force                ,     @retrofit2.http.Query("recursive") Boolean recursive                
  );

  /**
   * 
   * 
   * @param groupName  (required)
   * @param packageName  (required)
   * @param version  (required)
   * @param path  (required)
   * @param filter  (optional)
   * @param _charset_  (optional)
   * @return Call&lt;String&gt;
   */
  @POST("crx/packmgr/update.jsp")
  Call<String> postPackageUpdate(
        @retrofit2.http.Query("groupName") String groupName                ,     @retrofit2.http.Query("packageName") String packageName                ,     @retrofit2.http.Query("version") String version                ,     @retrofit2.http.Query("path") String path                ,     @retrofit2.http.Query("filter") String filter                ,     @retrofit2.http.Query("_charset_") String _charset_                
  );

  /**
   * 
   * 
   * @param old  (required)
   * @param plain  (required)
   * @param verify  (required)
   * @return Call&lt;String&gt;
   */
  @POST("crx/explorer/ui/setpassword.jsp")
  Call<String> postSetPassword(
        @retrofit2.http.Query("old") String old                ,     @retrofit2.http.Query("plain") String plain                ,     @retrofit2.http.Query("verify") String verify                
  );

}
