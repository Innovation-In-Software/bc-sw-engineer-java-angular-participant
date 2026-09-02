package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.repository.CustomerRepository;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class CustomerValidator {
    private static final Map<CustomerStatus, Set<CustomerStatus>> ALLOWED =
            new EnumMap<>(CustomerStatus.class);

    static {
        // TODO: ALLOWED.put(PROSPECT, EnumSet.of(ACTIVE, CLOSED));
        // TODO: ALLOWED.put(ACTIVE, EnumSet.of(SUSPENDED, CLOSED));
        // TODO: ALLOWED.put(SUSPENDED, EnumSet.of(ACTIVE, CLOSED));
        // TODO: ALLOWED.put(CLOSED, EnumSet.noneOf(CustomerStatus.class));
    }

    private final CustomerRepository repository;

    public CustomerValidator(CustomerRepository repository) {
        this.repository = repository;
    }

    public void validateNew(Customer customer) {
        // TODO: require customerId; reject duplicate id / email via repository
        throw new UnsupportedOperationException("TODO: validateNew");
    }

    public void validateTransition(CustomerStatus from, CustomerStatus to, String correlationId) {
        // TODO: reject when `to` not in ALLOWED.get(from); message must include correlationId
        throw new UnsupportedOperationException("TODO: validateTransition");
    }
}
