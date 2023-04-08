package com.example.crm.customer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/customer")
public class CustomerController {

    private CustomerService customerService;

    @PostMapping()
    public void createUser(@RequestBody CustomerCreateRequest customerCreateRequest) {
        customerService.addCustomer(customerCreateRequest);
    }
}
