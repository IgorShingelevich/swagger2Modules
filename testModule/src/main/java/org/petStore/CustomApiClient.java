package org.petStore;

import io.swagger.client.service.petStoreService.ApiClient;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import java.io.IOException;

/**
 * Custom interceptor for logging requests and responses.
 */
class CustomLoggingInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        // Log detailed request information
        System.out.println("Sending request to URL: " + request.url());
        System.out.println("Method: " + request.method());
        System.out.println("Headers: " + request.headers());
        if (request.body() != null) {
            // Optionally, log request body (be aware of sensitive data)
            System.out.println("Body: " + request.body());
        }

        Response response = chain.proceed(request);

        // Log detailed response information
        System.out.println("Received response for URL: " + response.request().url());
        System.out.println("Response Code: " + response.code());
        System.out.println("Headers: " + response.headers());
        ResponseBody responseBody = response.peekBody(Long.MAX_VALUE);
        System.out.println("Body: " + responseBody.string());

        return response;
    }
}

/**
 * Custom API client that uses composition to include an instance of ApiClient.
 */
public class CustomApiClient {
    private ApiClient apiClient;

    public CustomApiClient() {
        this.apiClient = new ApiClient(); // Initialize the Swagger-generated ApiClient
        configureApiClient();
    }

    private void configureApiClient() {
        // Get the OkHttpClient.Builder from the ApiClient
        OkHttpClient.Builder builder = apiClient.getOkBuilder();

        // Add custom logging interceptor
        builder.addInterceptor(new CustomLoggingInterceptor());

        // Optionally, you can add the built-in HttpLoggingInterceptor for additional logging
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.addInterceptor(loggingInterceptor);

        // Apply any other OkHttpClient configurations here
    }

    /**
     * Delegates the creation of service to the underlying ApiClient.
     * @param serviceClass Class of the service to be created.
     * @param <S> Type parameter for the service class.
     * @return An instance of the requested service.
     */
    public <S> S createService(Class<S> serviceClass) {
        return apiClient.createService(serviceClass);
    }

    // Add additional methods to expose other functionalities of ApiClient as needed
    // For example, methods to set authentication details, set base URL, etc.

    // You can also expose the underlying ApiClient if you need direct access to it
    public ApiClient getApiClient() {
        return apiClient;
    }
}
