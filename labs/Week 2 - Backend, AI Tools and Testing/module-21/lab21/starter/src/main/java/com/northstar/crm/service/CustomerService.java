package com.northstar.crm.service;

import com.northstar.crm.metrics.CustomerMetrics;
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
    private final CustomerMetrics metrics;

    public CustomerService(CustomerRepository repository, CustomerMetrics metrics) {
        this.repository = repository;
        this.metrics = metrics;
    }

    public Customer create(Customer customer, String correlationId) {
        MDC.put("cust", customer.getCustomerId());
        MDC.put("op", "create");
        log.info("create customer");
        try {
            Customer saved = repository.save(customer);
            // TODO: metrics.recordCreate("success");
            return saved;
        } catch (RuntimeException ex) {
            // TODO: metrics.recordCreate("failure");
            throw ex;
        }
    }

    public Optional<Customer> findById(String customerId) {
        MDC.put("cust", customerId);
        MDC.put("op", "get");
        log.info("get customer");
        Optional<Customer> found = repository.findById(customerId);
        // TODO: metrics.recordGet(found.isPresent() ? "success" : "not_found");
        return found;
    }
}
