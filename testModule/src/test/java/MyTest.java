import io.swagger.client.api.petStoreClassicApi.PetApi;
import io.swagger.client.model.petStoreClassicModel.Pet;
import io.swagger.client.service.petStoreService.ApiClient;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.petStore.CustomApiClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

import static org.junit.Assert.*;

public class MyTest {

    @Test
    public void test() {
        System.out.println("test");
    }

    @Test
    public void getPetByIdTest() throws IOException {
        // Create an instance of CustomApiClient instead of ApiClient
        CustomApiClient customApiClient = new CustomApiClient();
        PetApi petApi = customApiClient.createService(PetApi.class);

        // Execute the API call
        Response<Pet> petResponse = petApi.getPetById(1L)
                .execute();

        // Print the response
        System.out.println("Pet received: " + petResponse.body());
    }

//    @Test
//    public void addNewPetTest() throws IOException {
//        CustomApiClient customApiClient = new CustomApiClient();
//        PetApi petApi = customApiClient.createService(PetApi.class);
//
//        Pet newPet = new Pet()
//                .id(123L)
//                .name("Doggie")
//                .addPhotoUrlsItem("url-to-dog-photo")
//                .status(Pet.StatusEnum.AVAILABLE);
//
//        Response<Pet> response = petApi.addPet(newPet).execute();
//
//        assertTrue("Failed to add new pet", response.isSuccessful());
//        assertNotNull("Response body is null", response.body());
//        assertEquals("Pet name doesn't match", "Doggie", response.body().getName());
//    }

    @Test
    public void updatePetTest() throws IOException {
        CustomApiClient customApiClient = new CustomApiClient();
        PetApi petApi = customApiClient.createService(PetApi.class);

        Pet existingPet = new Pet()
                .id(123L)
                .name("Doggie Updated")
                .status(Pet.StatusEnum.AVAILABLE);

        // Perform the update operation
        Response<Void> updateResponse = petApi.updatePet(existingPet).execute();
        assertTrue("Failed to update the pet", updateResponse.isSuccessful());

        // Perform a GET request to verify the update
        Response<Pet> getResponse = petApi.getPetById(123L).execute();
        assertTrue("Failed to retrieve the updated pet", getResponse.isSuccessful());
        assertNotNull("Retrieved pet is null", getResponse.body());
        assertEquals("Pet name doesn't match", "Doggie Updated", getResponse.body().getName());
    }



    @Test
    public void deletePetTest() throws IOException {
        CustomApiClient customApiClient = new CustomApiClient();
        PetApi petApi = customApiClient.createService(PetApi.class);

        long petId = 123L; // ID of the pet to delete

        // Perform the delete operation
        Response<Void> deleteResponse = petApi.deletePet(petId, "apikeySMTH").execute();
        assertTrue("Failed to delete the pet", deleteResponse.isSuccessful());

        // Attempt to retrieve the deleted pet
        Response<Pet> getResponse = petApi.getPetById(petId).execute();

        // Assert that the response code is 404 Not Found
        assertEquals("Expected HTTP status code 404", 404, getResponse.code());
    }

}
