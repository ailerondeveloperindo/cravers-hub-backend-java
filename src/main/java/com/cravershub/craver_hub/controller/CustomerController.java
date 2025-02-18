package com.cravershub.craver_hub.controller;

import com.cravershub.craver_hub.dto.UserSigningUpRequest;
import com.cravershub.craver_hub.dto.UserSigningUpResponse;
import com.cravershub.craver_hub.service.CustomerService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/customer")
@Validated
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService _customerService) {
        customerService = _customerService;
    }

    @GetMapping(value = "/getCustomerData")
    public Integer getCustomerData( @RequestBody Integer customerId, HttpServletResponse response) {
        return customerId;
    }

    @PostMapping(value = "/signUp")
    public ResponseEntity<UserSigningUpResponse> signUp(@Valid @RequestBody UserSigningUpRequest userSigningUpRequest, BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        UserSigningUpResponse response = customerService.signingUp(userSigningUpRequest);
        return ResponseEntity.ok(response);
    }

    @PostMapping(value = "/login")
    public void login(){

    }

}
