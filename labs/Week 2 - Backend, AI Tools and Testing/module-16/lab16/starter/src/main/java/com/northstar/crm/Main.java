package com.northstar.crm;

import com.northstar.crm.api.ApiResult;
import com.northstar.crm.api.CustomerApiFacade;
import com.northstar.crm.dto.CustomerRequestDTO;
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
        CustomerValidator validator = new CustomerValidator(repo);
        CustomerService service = new DefaultCustomerService(repo, validator);
        CustomerApiFacade api = new CustomerApiFacade(service);

        service.addCustomer(Customer.amina());
        service.addCustomer(Customer.ravi());

        // TODO: print Fail JSON for invalid email (400), CUS-9999 (404), ACTIVE→PROSPECT (409)
        // TODO: after Lab 16 refactor, validator/service throw BusinessException
        throw new UnsupportedOperationException("TODO: demo 400/404/409 with lab-request-001");
    }
}
