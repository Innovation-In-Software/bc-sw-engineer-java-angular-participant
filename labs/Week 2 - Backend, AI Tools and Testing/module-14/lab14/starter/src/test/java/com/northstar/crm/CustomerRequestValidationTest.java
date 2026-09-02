package com.northstar.crm;

import com.northstar.crm.dto.CustomerRequestDTO;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class CustomerRequestValidationTest {
    static Validator validator;

    @BeforeAll
    static void setUp() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    void validAminaRequestPasses() {
        // TODO: build valid DTO for CUS-1001; assert violations empty
        throw new UnsupportedOperationException("TODO: valid request");
    }

    @Test
    void invalidEmailFails() {
        // TODO: bad email → assert violations mention email
        throw new UnsupportedOperationException("TODO: invalid email");
    }

    @Test
    void blankNameFails() {
        // TODO: blank fullName → assert violation
        throw new UnsupportedOperationException("TODO: blank name");
    }
}
