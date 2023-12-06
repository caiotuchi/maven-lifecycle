package com.project;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.containsString;

class HelloIntegrationTest {

    @BeforeEach
    void setUp() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
    }

    @Test
    void testHelloEndpoint() {
        when()
            .get("/webapp-project/hello")
        .then()
            .statusCode(200)
            .body(containsString("Hello from JSP!"));
    }
}
