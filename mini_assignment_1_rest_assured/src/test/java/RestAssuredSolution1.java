import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredSolution1 {
    @Test
    public void test_get_calll()
    {
        given().
               baseUri("https://jsonplaceholder.typicode.com/posts").
                header("Content-Type", "application/json").

        when().
                get("https://jsonplaceholder.typicode.com/posts").
        then().
                body("title[39]",equalTo("enim quo cumque")).
                body("userId[39]",equalTo(4)).
                statusCode(200);

    }



}
