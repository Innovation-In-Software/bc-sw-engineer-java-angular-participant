package com.northstar.crm.service;

import com.northstar.crm.model.Customer;
import com.northstar.crm.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
  private final CustomerRepository customerRepository;

  public CustomerService(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  public Customer create(Customer customer, String correlationId) {
    // TODO: if existsById → throw IllegalStateException("Duplicate customer")
    // TODO: otherwise save and return (correlation for evidence/logs)
    throw new UnsupportedOperationException("TODO: service-layer create rules");
  }

  public Customer get(String id) {
    // TODO: findById or throw IllegalArgumentException("Customer not found: " + id)
    throw new UnsupportedOperationException("TODO: service-layer get");
  }

  public List<Customer> list() {
    // TODO: return customerRepository.findAll()
    throw new UnsupportedOperationException("TODO: list");
  }
}
