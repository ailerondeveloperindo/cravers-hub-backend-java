package com.cravershub.craver_hub.controller;

import com.cravershub.craver_hub.POJOrandom;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @GetMapping(value = "/getCustomerData")
    public Integer getCustomerData(@RequestBody Integer customerId, HttpServletResponse response) {
        return customerId;
    }

    @PostMapping(value = "/signUp")
    public void signUp() {

    }

    @PostMapping(value = "/login")
    public void login(){

    }
}
