package com.northstar.crm.service;

import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.exception.BusinessException;
import com.northstar.crm.repository.InMemoryCustomerRepository;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Timed path target: 6 legal + 5 illegal = 11 parameterized invocations.
 * Fill assert bodies; keep all CSV rows (do not delete rows to "pass early").
 */
class CustomerValidatorParameterizedTest {
    CustomerValidator validator = new CustomerValidator(new InMemoryCustomerRepository());

    @ParameterizedTest
    @CsvSource({
            "PROSPECT,ACTIVE",
            "PROSPECT,CLOSED",
            "ACTIVE,SUSPENDED",
            "ACTIVE,CLOSED",
            "SUSPENDED,ACTIVE",
            "SUSPENDED,CLOSED"
    })
    void legalTransitions(CustomerStatus from, CustomerStatus to) {
        // TODO: assertDoesNotThrow(() -> validator.validateTransition(from, to, "lab-request-001"));
        throw new UnsupportedOperationException("TODO: legal parameterized");
    }

    @ParameterizedTest
    @CsvSource({
            "ACTIVE,PROSPECT",
            "CLOSED,ACTIVE",
            "CLOSED,PROSPECT",
            "PROSPECT,SUSPENDED",
            "ACTIVE,ACTIVE"
    })
    void illegalTransitions(CustomerStatus from, CustomerStatus to) {
        // TODO: assertThrows(BusinessException.class, () -> validator.validateTransition(from, to, "lab-request-001"));
        throw new UnsupportedOperationException("TODO: illegal parameterized");
    }
}
