import io.swagger.client.api.petStoreClassicApi.PetApi;
import io.swagger.client.model.petStoreClassicModel.Pet;
import io.swagger.client.service.petStoreService.ApiClient;
import org.junit.jupiter.api.Test;
import retrofit2.Call;

public class MyTest {
    private final ApiClient apiClient = new ApiClient();

    @Test
    public void test() {
        System.out.println("Hello, World!");
        PetApi service = apiClient.createService(PetApi.class);
        Call<Pet> petById = service.getPetById(1L);
        System.out.println(petById);

    }
}
