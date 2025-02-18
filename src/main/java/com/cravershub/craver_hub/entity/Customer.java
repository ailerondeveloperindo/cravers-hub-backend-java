package com.cravershub.craver_hub.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "\"firstname\"", nullable = false, length = Integer.MAX_VALUE)
    private String firstName;

    @Column(name = "\"lastname\"", length = Integer.MAX_VALUE)
    private String lastName;

    @Column(name = "\"password\"", length = Integer.MAX_VALUE)
    private String password;

    @Column(name = "\"email\"", length = Integer.MAX_VALUE)
    private String email;

    @Column(name = "\"phone_number\"", length = Integer.MAX_VALUE)
    private String phoneNumber;

    @Column(name = "\"firebase_token\"", length = Integer.MAX_VALUE)
    private String firebaseToken;

    @Column(name = "xenditcustomerid", length = Integer.MAX_VALUE)
    private String xenditcustomerid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirebaseToken() {
        return firebaseToken;
    }

    public void setFirebaseToken(String firebaseToken) {
        this.firebaseToken = firebaseToken;
    }

    public String getXenditcustomerid() {
        return xenditcustomerid;
    }

    public void setXenditcustomerid(String xenditcustomerid) {
        this.xenditcustomerid = xenditcustomerid;
    }

}