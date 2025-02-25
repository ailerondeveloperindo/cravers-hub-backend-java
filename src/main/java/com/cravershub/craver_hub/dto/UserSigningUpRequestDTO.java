package com.cravershub.craver_hub.dto;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

public class UserSigningUpRequestDTO implements DTO, Serializable {

    @NotNull(message = "firstname is required")
    @NotEmpty
    private String firstName;
    @NotNull(message = "{\"lastname is required\"}")
    private String lastName;
    @Email(message = "Incorrect Email Format")
    @NotNull(message = "Email is required")
    @NotEmpty
    private String email = "";
    private String firebaseToken = "";
    private String password = "";
    @NotNull(message = "phoneNumber is required")
    private String phoneNumber = "";
    private Integer phoneAreaCode = 0;
    private String registrationType = "";

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Nullable
    public String getFirebaseToken() {
        return firebaseToken;
    }

    public void setFirebaseToken(String firebaseToken) {
        this.firebaseToken = firebaseToken;
    }

    @Nullable
    public String getPassword() {
        return password;
    }

    public void setPassword(@Nullable String password) {
        this.password = password;
    }

    @Nullable
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(@Nullable String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneAreaCode() {
        return phoneAreaCode;
    }

    @Nullable
    public void setPhoneAreaCode(int phoneAreaCode) {
        this.phoneAreaCode = phoneAreaCode;
    }

    public String getRegistrationType() {
        return registrationType;
    }

    public void setRegistrationType(String registrationType) {
        this.registrationType = registrationType;
    }
}
