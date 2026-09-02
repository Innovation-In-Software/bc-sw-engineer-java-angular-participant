package com.northstar.crm.service;

import com.northstar.crm.model.Customer;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CustomerService {
  private final Map<String, Customer> store = new ConcurrentHashMap<>();

  public CustomerService() {
    store.put("CUS-1001", Customer.amina());
    store.put("CUS-1002", Customer.ravi());
  }

  public Customer create(Customer customer) {
    if (customer == null || customer.getId() == null || customer.getId().isBlank()) {
      throw new IllegalArgumentException("Customer id must not be blank");
    }
    if (store.containsKey(customer.getId())) {
      throw new IllegalStateException("Duplicate customer");
    }
    store.put(customer.getId(), customer);
    return customer;
  }

  public Optional<Customer> find(String id) {
    return Optional.ofNullable(store.get(id));
  }
}
