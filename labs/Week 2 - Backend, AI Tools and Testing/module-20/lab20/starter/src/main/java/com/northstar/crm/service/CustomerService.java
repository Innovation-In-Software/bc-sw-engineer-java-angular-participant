package com.northstar.crm.service;

import com.northstar.crm.model.Customer;
import com.northstar.crm.repository.CustomerRepository;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer create(Customer customer, String correlationId) {
        // TODO: MDC.put("cust", customer.getCustomerId()); MDC.put("op", "create"); INFO log without fullName/email
        if (customer.getCustomerId() == null || customer.getCustomerId().isBlank()) {
            throw new IllegalArgumentException("customerId required [" + correlationId + "]");
        }
        return repository.save(customer);
    }

    public Optional<Customer> findById(String customerId) {
        // TODO: MDC.put("cust", customerId); MDC.put("op", "get"); INFO log; never log PII
        return repository.findById(customerId);
    }
}
