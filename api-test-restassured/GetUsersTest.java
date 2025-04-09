import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUsersTest {
    public static void main(String[] args) {
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/users");

        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
