package com.northstar.crm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
@AutoConfigureMockMvc
class SecurityPathTest {
  @Test
  void missingTokenIs401() {
    // TODO: MockMvc GET /api/customers/CUS-1001 → 401
    fail("TODO: missingTokenIs401");
  }

  @Test
  void agentCanReadCustomerButNotAdmin() {
    // TODO: login agent1/agent1 → Bearer GET customer 200; GET /api/admin/ping 403
    fail("TODO: agentCanReadCustomerButNotAdmin");
  }

  @Test
  void adminCanPing() {
    // TODO: login admin1/admin1 → Bearer GET /api/admin/ping 200 role ADMIN
    fail("TODO: adminCanPing");
  }
}
