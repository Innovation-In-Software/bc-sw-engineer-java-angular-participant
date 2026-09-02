package com.northstar.crm;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.service.CustomerService;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        CustomerService svc = new CustomerService();
        svc.addCustomer(new Customer("CUS-1001", "Amina Khan", "amina.khan@example.com",
                null, CustomerStatus.ACTIVE, LocalDateTime.now()));
        svc.addCustomer(new Customer("CUS-1002", "Ravi Singh", "ravi.singh@example.com",
                null, CustomerStatus.PROSPECT, LocalDateTime.now()));
        System.out.println(svc.findByCustomerId("CUS-1001").orElseThrow());
        System.out.println(svc.findByCustomerId("CUS-1002").orElseThrow());
    }
}
