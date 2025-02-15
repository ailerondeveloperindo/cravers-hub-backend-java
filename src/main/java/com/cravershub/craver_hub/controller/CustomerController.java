package com.cravershub.craver_hub.controller;

import com.cravershub.craver_hub.dto.UserSigningUpRequest;
import com.cravershub.craver_hub.service.CustomerService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        customerService = customerService;
    }

    @GetMapping(value = "/getCustomerData")
    public Integer getCustomerData(@RequestBody Integer customerId, HttpServletResponse response) {
        return customerId;
    }

    @PostMapping(value = "/signUp")
    public ResponseEntity<Integer> signUp(@RequestBody UserSigningUpRequest userSigningUpRequest) {
        Integer response = customerService.signingUp(userSigningUpRequest);
        return ResponseEntity.ok(response);
    }

    @PostMapping(value = "/login")
    public void login(){

    }

}
