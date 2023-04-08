package com.example.crm.customer;

import org.springframework.stereotype.Service;

import com.example.crm.exception.DuplicateResourceException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerService {

    private CustomerRepository customerRepository;

    public void addCustomer(CustomerCreateRequest customerCreateRequest) {

        if (customerRepository.existsCustomerByEmail(customerCreateRequest.getEmail()))
            throw new DuplicateResourceException("Email is already taken");

        new Customer();
        Customer customer = Customer.builder()
            .firstname(customerCreateRequest.getFirstname())
            .lastname(customerCreateRequest.getLastname())
            .email(customerCreateRequest.getEmail())
            .build();

        customerRepository.save(customer);
    }
}
