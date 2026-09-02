package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** Characterization / target-API tests — fail until refactor completes. Suite target: 6 tests. */
class CustomerServiceTest {

    private CustomerService svc;

    @BeforeEach
    void setUp() {
        svc = new CustomerService();
        // TODO: after refactor, setCorrelationId("lab-request-001") so not-found messages include it
    }

    @Test
    void createAminaKhanThenGetById() {
        // TODO: svc.createCustomer("CUS-1001", "Amina Khan", "amina.khan@example.com", null, ACTIVE)
        // TODO: assert getCustomer returns same id (use new String("CUS-1001") to catch == bugs)
        throw new UnsupportedOperationException("TODO: target API test");
    }

    @Test
    void createRaviProspectThenActivate() {
        // TODO: create CUS-1002 PROSPECT; updateStatus → ACTIVE; assert statuses
        throw new UnsupportedOperationException("TODO: activate Ravi");
    }

    @Test
    void unknownIdThrows() {
        // TODO: getCustomer("CUS-9999") throws IllegalArgumentException containing id + correlation
        throw new UnsupportedOperationException("TODO: not-found test");
    }

    @Test
    void duplicateIdThrows() {
        // TODO: second create CUS-1001 throws IllegalStateException
        throw new UnsupportedOperationException("TODO: duplicate test");
    }

    @Test
    void blankCustomerIdThrows() {
        // TODO: createCustomer(" ", ...) throws IllegalArgumentException
        throw new UnsupportedOperationException("TODO: blank id");
    }

    @Test
    void updateUnknownThrowsWithCorrelation() {
        // TODO: updateStatus("CUS-9999", ACTIVE) message contains lab-request-001
        throw new UnsupportedOperationException("TODO: update unknown + correlation");
    }
}
