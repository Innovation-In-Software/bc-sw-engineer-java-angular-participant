package com.northstar.crm.controller;

import com.northstar.crm.dto.CustomerRequest;
import com.northstar.crm.dto.CustomerResponse;
import com.northstar.crm.service.CustomerService;

public class CustomerController {
    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    public CustomerResponse createCustomer(CustomerRequest request) {
        return customerService.create(request);
    }
    public CustomerResponse getCustomer(String customerId) {
        return customerService.getById(customerId);
    }
}
