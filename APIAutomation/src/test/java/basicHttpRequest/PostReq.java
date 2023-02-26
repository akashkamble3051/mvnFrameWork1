package basicHttpRequest;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class PostReq {


	public static void main(String[] args) {
//		https://reqres.in/api/users

//		Specify the base URI to RestAssured
		RestAssured.baseURI = "https://reqres.in";

		given().log().all().header("Content-Type", "application/json")
				.body("{\r\n" + "    \"name\": \"Eric\",\r\n" + "    \"job\": \"Senior QA\"\r\n" + "}").when()
				.post("api/users").then().log().all().assertThat().statusCode(201);

}}
