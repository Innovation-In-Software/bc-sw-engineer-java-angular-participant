package com.northstar.crm.repository;

import com.northstar.crm.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
  private final Map<String, Customer> store = new ConcurrentHashMap<>();

  public InMemoryCustomerRepository() {
    // TODO: seed Customer.amina() and Customer.ravi() into store
  }

  @Override
  public Customer save(Customer customer) {
    // TODO: put and return
    throw new UnsupportedOperationException("TODO: save");
  }

  @Override
  public Optional<Customer> findById(String id) {
    // TODO: Optional.ofNullable(store.get(id))
    throw new UnsupportedOperationException("TODO: findById");
  }

  @Override
  public List<Customer> findAll() {
    // TODO: return new ArrayList<>(store.values())
    throw new UnsupportedOperationException("TODO: findAll");
  }

  @Override
  public boolean existsById(String id) {
    // TODO: store.containsKey(id)
    throw new UnsupportedOperationException("TODO: existsById");
  }
}
