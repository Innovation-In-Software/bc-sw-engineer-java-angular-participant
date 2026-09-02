package com.northstar.crm.service;

import com.northstar.crm.dto.CustomerRequest;
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

  public Customer create(CustomerRequest request, String correlationId) {
    if (store.containsKey(request.getId())) {
      throw new IllegalStateException("Duplicate customer: " + request.getId());
    }
    Customer c = new Customer(request.getId(), request.getName(), request.getEmail(), request.getStatus());
    store.put(c.getId(), c);
    return c;
  }

  public Customer get(String id) {
    Customer c = store.get(id);
    if (c == null) throw new IllegalArgumentException("Customer not found: " + id);
    return c;
  }
}
