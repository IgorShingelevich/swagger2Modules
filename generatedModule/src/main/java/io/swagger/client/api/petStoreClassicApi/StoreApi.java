package io.swagger.client.api.petStoreClassicApi;

import io.swagger.client.service.petStoreService.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.petStoreClassicModel.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StoreApi {
  /**
   * Delete purchase order by ID
   * For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors
   * @param orderId ID of the order that needs to be deleted (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("store/order/{orderId}")
  Call<Void> deleteOrder(
            @retrofit2.http.Path("orderId") Long orderId            
  );

  /**
   * Returns pet inventories by status
   * Returns a map of status codes to quantities
   * @return Call&lt;Map&lt;String, Integer&gt;&gt;
   */
  @GET("store/inventory")
  Call<Map<String, Integer>> getInventory();
    

  /**
   * Find purchase order by ID
   * For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10. Other values will generated exceptions
   * @param orderId ID of pet that needs to be fetched (required)
   * @return Call&lt;Order&gt;
   */
  @GET("store/order/{orderId}")
  Call<Order> getOrderById(
            @retrofit2.http.Path("orderId") Long orderId            
  );

  /**
   * Place an order for a pet
   * 
   * @param body order placed for purchasing the pet (required)
   * @return Call&lt;Order&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("store/order")
  Call<Order> placeOrder(
                    @retrofit2.http.Body Order body    
  );

}
