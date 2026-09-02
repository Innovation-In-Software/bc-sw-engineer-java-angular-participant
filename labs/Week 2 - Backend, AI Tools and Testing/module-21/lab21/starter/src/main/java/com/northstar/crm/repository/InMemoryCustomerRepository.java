package com.northstar.crm.repository;

import com.northstar.crm.model.Customer;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
    private final Map<String, Customer> store = new ConcurrentHashMap<>();

    public InMemoryCustomerRepository() {
        store.put("CUS-1001", Customer.amina());
        store.put("CUS-1002", Customer.ravi());
    }

    @Override
    public Customer save(Customer customer) {
        store.put(customer.getCustomerId(), customer);
        return customer;
    }

    @Override
    public Optional<Customer> findById(String customerId) {
        return Optional.ofNullable(store.get(customerId));
    }
}
