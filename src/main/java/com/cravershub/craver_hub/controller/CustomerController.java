package com.cravershub.craver_hub.controller;

import com.cravershub.craver_hub.POJOrandom;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @GetMapping(value = "/getCustomerData")
    public POJOrandom getCustomerData() {
        return new POJOrandom(1, "asu");
    }

    @PostMapping(value = "/signUp")
    public void signUp() {

    }

    @PostMapping(value = "/login")
    public void login(){

    }
}
