package rest_assured;

import com.jayway.restassured.filter.log.ResponseLoggingFilter;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GitHubTest {
    @Test
    public void testRepositories() {
        String title = "Hello, Nata";
        given()
                .filter(new ResponseLoggingFilter())
                .header("Authorization", "token 5b337fbf3bc64d9f8f654435200a12c1953b04fa")
                .body("{\"title\":\"" + title + "\"}")
                .baseUri("https://api.github.com")
                .when()
                .get("/user/orgs")
                .then()
                .statusCode(200)
                .body("title", equalTo(title))
                .body("user.login", equalTo("natagolovkina"));
    }
}
