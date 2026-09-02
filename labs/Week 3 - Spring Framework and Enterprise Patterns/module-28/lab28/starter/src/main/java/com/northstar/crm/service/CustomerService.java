package com.northstar.crm.service;

import com.northstar.crm.model.Customer;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CustomerService {
  private final Map<String, Customer> store = new ConcurrentHashMap<>();

  public CustomerService() {
    store.put("CUS-1001", Customer.amina());
    store.put("CUS-1002", Customer.ravi());
  }

  public Customer create(Customer customer, String correlationId) {
    store.put(customer.getId(), customer);
    return customer;
  }

  public Customer get(String id) {
    Customer c = store.get(id);
    if (c == null) throw new IllegalArgumentException("Customer not found: " + id);
    return c;
  }
}
