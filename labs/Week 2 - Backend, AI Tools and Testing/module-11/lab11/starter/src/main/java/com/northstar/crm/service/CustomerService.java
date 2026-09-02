package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Lab 10 baseline. Lab 11 TODOs: inject CustomerNotifier; call notifyStatusChange
 * from updateStatus; extract validateCustomerId; keep behavior for CUS-1001 / CUS-1002.
 */
public class CustomerService {
    private final List<Customer> customers = new ArrayList<>();
    // TODO: private final CustomerNotifier notifier; + no-arg (no-op) and injectable ctors

    public Customer addCustomer(Customer customer) {
        // TODO: extract duplicated validation into a private helper (Lab 11)
        if (customer == null || customer.getCustomerId() == null || customer.getCustomerId().isBlank()) {
            throw new IllegalArgumentException("customerId is required");
        }
        if (findByCustomerId(customer.getCustomerId()).isPresent()) {
            throw new IllegalStateException("Duplicate customerId: " + customer.getCustomerId());
        }
        if (customer.getCreatedAt() == null) {
            customer.setCreatedAt(LocalDateTime.now());
        }
        if (customer.getStatus() == null) {
            customer.setStatus(CustomerStatus.PROSPECT);
        }
        customers.add(customer);
        return customer;
    }

    public Optional<Customer> findByCustomerId(String customerId) {
        return customers.stream()
                .filter(c -> c.getCustomerId().equals(customerId))
                .findFirst();
    }

    public Customer updateStatus(String customerId, CustomerStatus newStatus) {
        Customer c = findByCustomerId(customerId)
                .orElseThrow(() -> new IllegalArgumentException("Customer not found: " + customerId));
        // TODO: capture oldStatus, set newStatus, then notifier.notifyStatusChange(...)
        c.setStatus(newStatus);
        return c;
    }

    // TODO (required for Tests run: 8): findByStatus(CustomerStatus) and listAll()
}
