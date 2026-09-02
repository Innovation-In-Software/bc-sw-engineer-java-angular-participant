package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {
    @Test
    void addCustomerStoresNewCustomer() {
        // TODO: add CUS-1001 ACTIVE; assert findByCustomerId present (and listAll size if added)
        throw new UnsupportedOperationException("TODO: service happy path");
    }

    @Test
    void addCustomerRejectsDuplicateId() {
        // TODO: second add with CUS-1001 throws IllegalStateException
        throw new UnsupportedOperationException("TODO: duplicate rejection");
    }

    @Test
    void updateStatusChangesExistingCustomer() {
        // TODO: add CUS-1002 PROSPECT; updateStatus → ACTIVE; assert status
        throw new UnsupportedOperationException("TODO: updateStatus happy path");
    }

    @Test
    void updateStatusThrowsForUnknownCustomer() {
        // TODO: updateStatus("CUS-9999", ...) throws IllegalArgumentException
        throw new UnsupportedOperationException("TODO: unknown customer");
    }

    @Test
    void findByStatusReturnsOnlyMatchingCustomers() {
        // TODO: add ACTIVE CUS-1001 + PROSPECT CUS-1002; assert findByStatus(PROSPECT) size 1 / id CUS-1002
        // Requires listAll() + findByStatus(CustomerStatus) on CustomerService (timed path — required)
        throw new UnsupportedOperationException("TODO: findByStatus filter");
    }
}
