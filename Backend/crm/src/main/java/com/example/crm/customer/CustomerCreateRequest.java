package com.example.crm.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerCreateRequest {
    private String firstname;
    private String lastname;
    private String email;
}
