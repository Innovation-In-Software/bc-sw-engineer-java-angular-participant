package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.exception.BusinessException;
import com.northstar.crm.repository.CustomerRepository;
import java.util.List;
import java.util.Optional;

public class DefaultCustomerService implements CustomerService {
    private final CustomerRepository repository;
    private final CustomerValidator validator;

    public DefaultCustomerService(CustomerRepository repository, CustomerValidator validator) {
        this.repository = repository;
        this.validator = validator;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        validator.validateNew(customer);
        return repository.save(customer);
    }

    @Override
    public Optional<Customer> findById(String customerId) {
        return repository.findById(customerId);
    }

    @Override
    public List<Customer> listAll() {
        return List.copyOf(repository.findAll());
    }

    @Override
    public Customer changeStatus(String customerId, CustomerStatus newStatus, String correlationId) {
        Customer existing = repository.findById(customerId)
                .orElseThrow(() -> BusinessException.notFound(customerId, correlationId));
        validator.validateTransition(existing.getStatus(), newStatus, correlationId);
        existing.setStatus(newStatus);
        existing.touchUpdatedAt();
        return repository.save(existing);
    }
}
