package com.northstar.crm.service;

import com.northstar.crm.model.Customer;

// TODO: add @Service
public class CustomerService {

  // TODO: declare final CustomerRepository and NotificationService fields
  // TODO: constructor-inject both collaborators (no field @Autowired, no `new`)

  public Customer create(Customer customer, String correlationId) {
    // TODO: save via repository, then notifyCreated(customer.getId(), correlationId)
    throw new UnsupportedOperationException("TODO: implement create with injected collaborators");
  }

  public Customer get(String id) {
    // TODO: findById or throw IllegalArgumentException("Customer not found: " + id)
    throw new UnsupportedOperationException("TODO: implement get via repository");
  }

  // TODO: @PostConstruct method logging "CustomerService ready"
  // TODO: @PreDestroy method logging "CustomerService shutting down"
}
