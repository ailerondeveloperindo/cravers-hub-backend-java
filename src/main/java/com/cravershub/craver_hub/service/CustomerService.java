package com.cravershub.craver_hub.service;

import com.cravershub.craver_hub.dto.UserSigningUpRequestDTO;
import com.cravershub.craver_hub.dto.UserSigningUpResponse;
import com.cravershub.craver_hub.entity.Customer;
import com.cravershub.craver_hub.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements BaseService{

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public UserSigningUpResponse signingUp(UserSigningUpRequestDTO userSignUp) {
        Customer customer = new Customer();
        UserSigningUpResponse userSigningUpResponse = new UserSigningUpResponse();
        if( userSignUp.getRegistrationType() == "BY_EMAIL" ) // TODO: Interface
        {
            customer.setEmail(userSignUp.getEmail());
        }
        else if( userSignUp.getRegistrationType() == "BY_PHONE" )
        {
            // Still requires recovery email
            customer.setPhoneNumber(userSignUp.getPhoneNumber());
        }
        customer.setFirstName(userSignUp.getFirstName());
        customer.setLastName(userSignUp.getLastName());

        customer.setPassword(userSignUp.getPassword());
        customer.setFirebaseToken(userSignUp.getFirebaseToken());
        customer.setPhoneAreaCode(userSignUp.getPhoneAreaCode());
        customerRepository.save(customer);
        userSigningUpResponse.setCustomerId(customer.getId());
        return userSigningUpResponse;
    }

}
