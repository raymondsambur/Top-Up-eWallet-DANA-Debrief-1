package demo.controller;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIController {

    public Response resendOTPCode(VerificationRequest verificationRequest){
        return RestAssured
                .given()
                .baseUri("http://336f1b2a.ngrok.io")
                .log()
                .all()
                .header("Content-type", "application/json")
                .header("Accept", "*/*")
                .body(verificationRequest)
                .post("/resend-otp");
    }

}
