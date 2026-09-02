package com.northstar.crm.repository;

import com.northstar.crm.entity.Customer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/** Map must stay private — anti-leak rule for Lab 15. */
public class InMemoryCustomerRepository implements CustomerRepository {
    // TODO: private final Map<String, Customer> store = new HashMap<>();

    @Override
    public Customer save(Customer customer) {
        // TODO: put by customerId; return customer
        throw new UnsupportedOperationException("TODO: save");
    }

    @Override
    public Optional<Customer> findById(String customerId) {
        // TODO: Optional.ofNullable(store.get(customerId))
        throw new UnsupportedOperationException("TODO: findById");
    }

    @Override
    public boolean existsById(String customerId) {
        // TODO: store.containsKey
        throw new UnsupportedOperationException("TODO: existsById");
    }

    @Override
    public boolean existsByEmail(String email) {
        // TODO: scan values for matching email (case-insensitive OK)
        throw new UnsupportedOperationException("TODO: existsByEmail");
    }

    @Override
    public List<Customer> findAll() {
        // TODO: return new ArrayList<>(store.values()) — never return the Map itself
        throw new UnsupportedOperationException("TODO: findAll");
    }
}
