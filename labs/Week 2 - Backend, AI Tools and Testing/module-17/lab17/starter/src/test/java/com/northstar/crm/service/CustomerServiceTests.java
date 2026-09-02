package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.exception.BusinessException;
import com.northstar.crm.repository.InMemoryCustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTests {
    DefaultCustomerService service;

    @BeforeEach
    void setUp() {
        // TODO: fresh InMemoryCustomerRepository + CustomerValidator + DefaultCustomerService each test
        throw new UnsupportedOperationException("TODO: wire @BeforeEach");
    }

    @Test
    void addAndActivateRaviHappyPath() {
        // TODO: add Amina ACTIVE + Ravi PROSPECT; changeStatus CUS-1002 → ACTIVE; assert ACTIVE
        throw new UnsupportedOperationException("TODO: happy path");
    }

    @Test
    void duplicateIdThrowsConflict() {
        // TODO: add Amina twice → assertThrows BusinessException
        throw new UnsupportedOperationException("TODO: duplicate");
    }

    @Test
    void illegalTransitionThrowsConflict() {
        // TODO: ACTIVE → PROSPECT on CUS-1001 → BusinessException; status still ACTIVE
        throw new UnsupportedOperationException("TODO: illegal transition");
    }

    @Test
    void missingCustomerThrowsNotFound() {
        // TODO: changeStatus CUS-9999 → BusinessException with CUSTOMER_NOT_FOUND
        throw new UnsupportedOperationException("TODO: not found");
    }

    @Test
    void duplicateEmailThrowsConflict() {
        // TODO: add Amina; add other id with same email → BusinessException
        throw new UnsupportedOperationException("TODO: duplicate email");
    }

    @Test
    void closedToActiveRejected() {
        // TODO: add CLOSED CUS-1001; changeStatus → ACTIVE throws BusinessException
        throw new UnsupportedOperationException("TODO: closed to active");
    }
}
