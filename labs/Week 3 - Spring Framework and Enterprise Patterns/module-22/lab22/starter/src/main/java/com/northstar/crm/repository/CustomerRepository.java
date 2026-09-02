package com.northstar.crm.repository;

import com.northstar.crm.model.Customer;
import java.util.Optional;

public interface CustomerRepository {
  Customer save(Customer customer);
  Optional<Customer> findById(String id);
}
