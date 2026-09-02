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
        CustomerRepository repo = new InMemoryCustomerRepository();
        CustomerService service = new DefaultCustomerService(repo, new CustomerValidator(repo));
        service.addCustomer(Customer.amina());
        service.addCustomer(Customer.ravi());
        System.out.println(service.changeStatus("CUS-1002", CustomerStatus.ACTIVE, "lab-request-001"));
    }
}
