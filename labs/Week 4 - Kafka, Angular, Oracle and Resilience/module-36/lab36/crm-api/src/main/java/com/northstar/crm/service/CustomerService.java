package com.northstar.crm.service;

import com.northstar.crm.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CustomerService {
  private static final Logger log = LoggerFactory.getLogger(CustomerService.class);
  private final Map<String, Customer> store = new ConcurrentHashMap<>();

  public CustomerService() {
    store.put("CUS-1001", Customer.amina());
    store.put("CUS-1002", Customer.ravi());
  }

  public Customer create(Customer customer, String correlationId) {
    if (customer == null || customer.getId() == null || customer.getId().isBlank()) {
      throw new IllegalArgumentException("Customer id must not be blank");
    }
    if (store.containsKey(customer.getId())) {
      throw new IllegalStateException("Duplicate customer");
    }
    store.put(customer.getId(), customer);
    log.info("customer.created id={} correlationId={}", customer.getId(), correlationId);
    return customer;
  }

  public Optional<Customer> find(String id) {
    return Optional.ofNullable(store.get(id));
  }

  public Customer get(String id) {
    return find(id).orElseThrow(() -> new IllegalArgumentException("Customer not found: " + id));
  }

  public List<Customer> list(String status) {
    return store.values().stream()
        .filter(c -> status == null || status.isBlank() || status.equalsIgnoreCase(c.getStatus()))
        .toList();
  }
}
