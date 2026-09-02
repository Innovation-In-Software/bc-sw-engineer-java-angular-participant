package com.northstar.crm.controller;

import com.northstar.crm.dto.CustomerRequest;
import com.northstar.crm.dto.CustomerResponse;
import com.northstar.crm.service.CustomerService;

/**
 * Presentation/API boundary. Lab 8: stub only (no HTTP framework yet).
 * Later: Spring MVC maps HTTP onto these methods.
 */
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    public CustomerResponse createCustomer(CustomerRequest request) {
        // TODO: delegate to customerService.create(request) — no SQL / files here
        throw new UnsupportedOperationException("TODO: delegate createCustomer");
    }

    public CustomerResponse getCustomer(String customerId) {
        // TODO: delegate to customerService.getById(customerId)
        throw new UnsupportedOperationException("TODO: delegate getCustomer");
    }
}
