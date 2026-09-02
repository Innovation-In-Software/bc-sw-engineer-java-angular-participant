package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer addCustomer(Customer customer);
    Optional<Customer> findById(String customerId);
    List<Customer> listAll();
    Customer changeStatus(String customerId, CustomerStatus newStatus, String correlationId);
}
