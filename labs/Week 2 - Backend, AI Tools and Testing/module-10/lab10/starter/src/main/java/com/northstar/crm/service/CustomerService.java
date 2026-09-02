package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * TODO (Copilot Chat): in-memory list store.
 * addCustomer: reject null/blank id; reject duplicate; store and return.
 * findByCustomerId; updateStatus.
 * No Spring / JPA.
 */
public class CustomerService {
    private final List<Customer> customers = new ArrayList<>();

    public Customer addCustomer(Customer customer) {
        // TODO: implement with guard clauses
        throw new UnsupportedOperationException("TODO: addCustomer");
    }

    public Optional<Customer> findByCustomerId(String customerId) {
        // TODO: implement
        throw new UnsupportedOperationException("TODO: findByCustomerId");
    }

    public Customer updateStatus(String customerId, CustomerStatus status) {
        // TODO: implement
        throw new UnsupportedOperationException("TODO: updateStatus");
    }
}
