package com.itschool.library.models.dtos;

import lombok.Data;

@Data
public class ResponseCustomerDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}