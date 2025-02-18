package com.cravershub.craver_hub.service;

import com.cravershub.craver_hub.dto.UserSigningUpRequest;
import com.cravershub.craver_hub.dto.UserSigningUpResponse;
import com.cravershub.craver_hub.entity.Customer;
import com.cravershub.craver_hub.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements BaseService{

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public UserSigningUpResponse signingUp(UserSigningUpRequest userSignUp) {
        Customer customer = new Customer();
        UserSigningUpResponse userSigningUpResponse = new UserSigningUpResponse();
        customer.setFirstName(userSignUp.getFirstName());
        customer.setLastName(userSignUp.getLastName());
        customer.setEmail(userSignUp.getEmail());
        customer.setPassword(userSignUp.getPassword());
        customerRepository.save(customer);
        userSigningUpResponse.setCustomerId(customer.getId());
        return userSigningUpResponse;
    }

}
