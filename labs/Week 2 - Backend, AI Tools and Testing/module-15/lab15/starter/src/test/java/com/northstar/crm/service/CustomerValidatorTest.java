package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.repository.InMemoryCustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerValidatorTest {
    CustomerValidator validator;
    InMemoryCustomerRepository repo;

    @BeforeEach
    void setUp() {
        repo = new InMemoryCustomerRepository();
        validator = new CustomerValidator(repo);
    }

    @Test
    void prospectToActiveAllowed() {
        // TODO: validateTransition(PROSPECT, ACTIVE, "lab-request-001") does not throw
        throw new UnsupportedOperationException("TODO: legal transition");
    }

    @Test
    void activeToProspectRejected() {
        // TODO: assertThrows IllegalStateException; message contains lab-request-001
        throw new UnsupportedOperationException("TODO: illegal transition");
    }

    @Test
    void duplicateIdRejected() {
        // TODO: seed via repo.save(Customer.amina()); validateNew duplicate → throws
        throw new UnsupportedOperationException("TODO: duplicate id");
    }
}
