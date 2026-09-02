package com.northstar.crm;

import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class CustomerApiIT {
  @Autowired
  MockMvc mockMvc;

  @Test
  void getAmina_returns200() throws Exception {
    // TODO: GET /api/customers/CUS-1001 with X-Correlation-Id lab-request-001
    // expect 200, $.id CUS-1001, $.name Amina Khan
    fail("TODO: getAmina_returns200");
  }

  @Test
  void getMissing_returns404() throws Exception {
    // TODO: GET /api/customers/CUS-9999 → 404
    fail("TODO: getMissing_returns404");
  }

  @Test
  void create_returns201() throws Exception {
    // TODO: POST CUS-1003 Maya Chen → 201 and Location /api/customers/CUS-1003
    fail("TODO: create_returns201");
  }
}
