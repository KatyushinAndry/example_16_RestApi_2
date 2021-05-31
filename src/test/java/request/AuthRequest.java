package request;

import static io.restassured.RestAssured.given;

public class AuthRequest {

    public static String authorization() {

                return given()
                        .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                        .formParam("Email", "a.katyushin@gmail.com")
                        .formParam("Password", "qwaszx@1")
                        .when()
                        .post("http://demowebshop.tricentis.com/login")
                        .then()
                        .statusCode(302)
                        .log().body()
                        .extract()
                        .cookie("NOPCOMMERCE.AUTH");


    }


}
