package com.northstar.crm.repository;

import com.northstar.crm.entity.Customer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class InMemoryCustomerRepository implements CustomerRepository {
    private final Map<String, Customer> store = new HashMap<>();

    @Override
    public Customer save(Customer customer) {
        store.put(customer.getCustomerId(), customer);
        return customer;
    }

    @Override
    public Optional<Customer> findById(String customerId) {
        return Optional.ofNullable(store.get(customerId));
    }

    @Override
    public boolean existsById(String customerId) {
        return store.containsKey(customerId);
    }

    @Override
    public boolean existsByEmail(String email) {
        if (email == null) return false;
        return store.values().stream().anyMatch(c -> email.equalsIgnoreCase(c.getEmail()));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(store.values());
    }
}
