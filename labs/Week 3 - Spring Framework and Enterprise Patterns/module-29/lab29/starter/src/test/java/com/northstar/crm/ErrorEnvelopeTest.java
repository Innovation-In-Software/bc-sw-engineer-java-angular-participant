package com.northstar.crm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
@AutoConfigureMockMvc
class ErrorEnvelopeTest {
  @Test
  void validationReturns400Envelope() {
    // TODO: login agent1 → Bearer POST invalid email → 400 + violations + correlationId
    fail("TODO: validationReturns400Envelope");
  }

  @Test
  void missingCustomerReturns404Envelope() {
    // TODO: Bearer GET /api/customers/CUS-9999 → 404 envelope
    fail("TODO: missingCustomerReturns404Envelope");
  }

  @Test
  void duplicateReturns409Envelope() {
    // TODO: Bearer POST duplicate CUS-1001 → 409
    fail("TODO: duplicateReturns409Envelope");
  }

  @Test
  void securityStillRequiresToken() {
    // TODO: GET /api/customers/CUS-1001 with no Authorization → 401
    fail("TODO: securityStillRequiresToken");
  }
}
