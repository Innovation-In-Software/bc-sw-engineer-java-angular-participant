package com.northstar.crm.entity;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    void equalsIsBasedOnCustomerIdOnly() {
        // TODO: two Customer with same id, different name/status → assertEquals
        throw new UnsupportedOperationException("TODO: equals by customerId");
    }

    @Test
    void toStringIncludesCustomerId() {
        // TODO: Customer CUS-1002 → toString contains CUS-1002
        throw new UnsupportedOperationException("TODO: toString includes id");
    }
}
