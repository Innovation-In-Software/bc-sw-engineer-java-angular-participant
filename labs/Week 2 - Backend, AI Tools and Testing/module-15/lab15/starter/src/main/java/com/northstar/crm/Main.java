package com.northstar.crm;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.repository.CustomerRepository;
import com.northstar.crm.repository.InMemoryCustomerRepository;
import com.northstar.crm.service.CustomerService;
import com.northstar.crm.service.CustomerValidator;
import com.northstar.crm.service.DefaultCustomerService;

public class Main {
    public static void main(String[] args) {
        // TODO: one shared InMemoryCustomerRepository for validator + service
        CustomerRepository repo = new InMemoryCustomerRepository();
        CustomerValidator validator = new CustomerValidator(repo);
        CustomerService service = new DefaultCustomerService(repo, validator);

        // TODO: addCustomer Amina (ACTIVE) and Ravi (PROSPECT)
        // TODO: changeStatus CUS-1002 → ACTIVE with correlation lab-request-001
        // TODO: catch illegal ACTIVE → PROSPECT on CUS-1001; print message; prove still ACTIVE
        throw new UnsupportedOperationException("TODO: service-layer demo (activate + illegal transition)");
    }
}
