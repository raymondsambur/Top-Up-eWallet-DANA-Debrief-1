package demo.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "phone_number",
        "email"
})
public class VerificationRequest {

    @JsonProperty("phone_number")
    private String phone_number;
    @JsonProperty("email")
    private String email;

    @JsonProperty("phone_number")
    public String getPhoneNumber() {
        return phone_number;
    }

    @JsonProperty("phone_number")
    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

}
