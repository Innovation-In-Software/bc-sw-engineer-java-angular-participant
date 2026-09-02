package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.exception.BusinessException;
import com.northstar.crm.repository.InMemoryCustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** Lab 17 real-repo baseline — keep green alongside Mockito isolation tests. */
class CustomerServiceTests {
    DefaultCustomerService service;
    InMemoryCustomerRepository repo;

    @BeforeEach
    void setUp() {
        repo = new InMemoryCustomerRepository();
        service = new DefaultCustomerService(repo, new CustomerValidator(repo));
    }

    @Test
    void addAndActivateRaviHappyPath() {
        service.addCustomer(Customer.amina());
        service.addCustomer(Customer.ravi());
        var activated = service.changeStatus("CUS-1002", CustomerStatus.ACTIVE, "lab-request-001");
        assertEquals(CustomerStatus.ACTIVE, activated.getStatus());
    }

    @Test
    void illegalTransitionThrowsConflict() {
        service.addCustomer(Customer.amina());
        assertThrows(BusinessException.class,
                () -> service.changeStatus("CUS-1001", CustomerStatus.PROSPECT, "lab-request-001"));
        assertEquals(CustomerStatus.ACTIVE, service.findById("CUS-1001").orElseThrow().getStatus());
    }
}
