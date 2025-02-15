package com.cravershub.craver_hub.dto;

public class UserSigningUpRequest {
    private String firstName;
    private String lastName;
    private String email = "";
    private String firebaseToken = "";
    private String password = "";
    private String phoneNumber = "";
    private int phoneAreaCode = 0;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirebaseToken() {
        return firebaseToken;
    }

    public void setFirebaseToken(String firebaseToken) {
        this.firebaseToken = firebaseToken;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneAreaCode() {
        return phoneAreaCode;
    }

    public void setPhoneAreaCode(int phoneAreaCode) {
        this.phoneAreaCode = phoneAreaCode;
    }
}
