package com.northstar.crm.repository;

import com.northstar.crm.entity.Customer;
import java.util.Optional;

/**
 * Persistence boundary. Lab 8: stub only.
 * Later: in-memory List, then JPA/PostgreSQL.
 *
 * TODO: do NOT import controller or dto — only entity (+ JDK).
 */
public class CustomerRepository {

    public Optional<Customer> findById(String customerId) {
        // TODO: throw UnsupportedOperationException("Lab 8 stub — implement later")
        throw new UnsupportedOperationException("TODO: Lab 8 stub findById");
    }

    public Customer save(Customer customer) {
        // TODO: throw UnsupportedOperationException("Lab 8 stub — implement later")
        throw new UnsupportedOperationException("TODO: Lab 8 stub save");
    }
}
