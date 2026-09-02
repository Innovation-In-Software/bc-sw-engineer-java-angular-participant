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
class CustomerControllerMockMvcTest {
  @Autowired
  MockMvc mockMvc;

  @Test
  void getAmina_ok() throws Exception {
    // TODO: GET /api/customers/CUS-1001 → 200, id CUS-1001, name Amina Khan
    fail("TODO: getAmina_ok");
  }

  @Test
  void getMissing_notFound() throws Exception {
    // TODO: GET /api/customers/CUS-9999 → 404
    fail("TODO: getMissing_notFound");
  }

  @Test
  void createMaya_created() throws Exception {
    // TODO: POST Maya CUS-1003 → 201, Location /api/customers/CUS-1003
    fail("TODO: createMaya_created");
  }
}
