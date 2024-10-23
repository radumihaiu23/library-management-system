package com.itschool.library.controllers;

import com.itschool.library.models.dtos.RequestCustomerDTO;
import com.itschool.library.models.dtos.ResponseCustomerDTO;
import com.itschool.library.services.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Operation(summary = "Create a new customer")
    @PostMapping("/api/customers")
    public ResponseEntity<ResponseCustomerDTO> createCustomer(@RequestBody RequestCustomerDTO requestCustomerDTO) {
        return ResponseEntity.ok(customerService.createCustomer(requestCustomerDTO));
    }
}