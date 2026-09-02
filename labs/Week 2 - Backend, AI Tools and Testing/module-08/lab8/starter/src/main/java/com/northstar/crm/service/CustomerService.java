package com.northstar.crm.service;

import com.northstar.crm.dto.CustomerRequest;
import com.northstar.crm.dto.CustomerResponse;
import com.northstar.crm.repository.CustomerRepository;

/**
 * Business rules live here. Controllers must not bypass this layer.
 */
public class CustomerService {

    // TODO: keep a final CustomerRepository field + constructor injection (even if unused in Lab 8)
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public CustomerResponse create(CustomerRequest request) {
        // TODO: throw UnsupportedOperationException("Lab 8 stub — implement later")
        throw new UnsupportedOperationException("TODO: Lab 8 stub create");
    }

    public CustomerResponse getById(String customerId) {
        // TODO: throw UnsupportedOperationException("Lab 8 stub — implement later")
        throw new UnsupportedOperationException("TODO: Lab 8 stub getById");
    }
}
