package com.cravershub.craver_hub.service;

import com.cravershub.craver_hub.dto.UserSigningUpRequest;
import com.cravershub.craver_hub.entity.Customer;
import com.cravershub.craver_hub.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements BaseService{

    private CustomerRepository customerRepository;

    @Autowired
    CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Integer signingUp(UserSigningUpRequest userSignUp) {

        return 1;
    }
}
