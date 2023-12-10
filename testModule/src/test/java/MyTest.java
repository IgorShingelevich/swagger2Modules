import io.swagger.client.ApiClient;
import io.swagger.client.api.PetApi;
import io.swagger.client.model.Pet;
import org.junit.jupiter.api.Test;
import retrofit2.Call;

public class MyTest {
   private final  ApiClient apiClient = new ApiClient();


    @Test
    public void test() {
        System.out.println("Hello, World!");
        PetApi service = apiClient.createService(PetApi.class);
        Call<Pet> petById = service.getPetById(1L);
        System.out.println(petById);

    }
}
