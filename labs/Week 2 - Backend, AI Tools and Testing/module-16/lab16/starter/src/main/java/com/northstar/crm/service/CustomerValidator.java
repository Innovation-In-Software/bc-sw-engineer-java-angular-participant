package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.repository.CustomerRepository;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/** Lab 15 baseline — Lab 16 TODO: throw BusinessException instead of IllegalStateException. */
public class CustomerValidator {
    private static final Map<CustomerStatus, Set<CustomerStatus>> ALLOWED =
            new EnumMap<>(CustomerStatus.class);

    static {
        ALLOWED.put(CustomerStatus.PROSPECT, EnumSet.of(CustomerStatus.ACTIVE, CustomerStatus.CLOSED));
        ALLOWED.put(CustomerStatus.ACTIVE, EnumSet.of(CustomerStatus.SUSPENDED, CustomerStatus.CLOSED));
        ALLOWED.put(CustomerStatus.SUSPENDED, EnumSet.of(CustomerStatus.ACTIVE, CustomerStatus.CLOSED));
        ALLOWED.put(CustomerStatus.CLOSED, EnumSet.noneOf(CustomerStatus.class));
    }

    private final CustomerRepository repository;

    public CustomerValidator(CustomerRepository repository) {
        this.repository = repository;
    }

    public void validateNew(Customer customer) {
        if (customer.getCustomerId() == null || customer.getCustomerId().isBlank()) {
            throw new IllegalArgumentException("customerId is required");
        }
        if (repository.existsById(customer.getCustomerId())) {
            // TODO Lab 16: replace with BusinessException.conflict(..., correlationId) — need corr on API
            throw new IllegalStateException("duplicate customerId: " + customer.getCustomerId());
        }
        if (customer.getEmail() != null && repository.existsByEmail(customer.getEmail())) {
            // TODO Lab 16: BusinessException.conflict for duplicate email
            throw new IllegalStateException("duplicate email: " + customer.getEmail());
        }
    }

    public void validateTransition(CustomerStatus from, CustomerStatus to, String correlationId) {
        Set<CustomerStatus> allowed = ALLOWED.getOrDefault(from, Set.of());
        if (!allowed.contains(to)) {
            // TODO Lab 16: BusinessException.conflict(message, correlationId) instead of IllegalStateException
            throw new IllegalStateException(
                    "illegal status transition " + from + " -> " + to
                            + " [" + correlationId + "]");
        }
    }
}
