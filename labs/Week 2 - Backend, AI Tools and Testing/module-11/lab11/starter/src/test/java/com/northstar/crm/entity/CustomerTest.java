package com.northstar.crm.entity;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    void equalsIsBasedOnCustomerIdOnly() {
        // TODO: two customers same id different names → assertEquals; different ids → assertNotEquals
        throw new UnsupportedOperationException("TODO: Customer equality test");
    }

    @Test
    void toStringIncludesCustomerId() {
        // TODO: assertTrue(ravi.toString().contains("CUS-1002"))
        throw new UnsupportedOperationException("TODO: toString includes id");
    }
}
