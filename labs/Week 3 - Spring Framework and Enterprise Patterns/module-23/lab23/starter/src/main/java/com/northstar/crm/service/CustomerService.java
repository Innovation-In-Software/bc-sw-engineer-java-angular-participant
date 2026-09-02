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
    // TODO: reject blank id; put into store; return customer (correlation for logs/evidence)
    throw new UnsupportedOperationException("TODO: create");
  }

  public Customer get(String id) {
    // TODO: return store.get or throw not-found for CUS-MISSING path
    throw new UnsupportedOperationException("TODO: get");
  }
}
