package com.northstar.crm;

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
  void list_containsAminaAndRavi() throws Exception {
    mockMvc.perform(get("/api/customers")
            .header("X-Correlation-Id", "lab-request-001"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$[*].id", org.hamcrest.Matchers.hasItems("CUS-1001", "CUS-1002")))
        .andExpect(jsonPath("$[*].name", org.hamcrest.Matchers.hasItems("Amina Khan", "Ravi Singh")));
  }

  @Test
  void getAmina_ok() throws Exception {
    mockMvc.perform(get("/api/customers/CUS-1001")
            .header("X-Correlation-Id", "lab-request-001"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.id").value("CUS-1001"))
        .andExpect(jsonPath("$.name").value("Amina Khan"));
  }

  @Test
  void getMissing_notFound() throws Exception {
    mockMvc.perform(get("/api/customers/CUS-9999")
            .header("X-Correlation-Id", "lab-request-001"))
        .andExpect(status().isNotFound());
  }

  @Test
  void createMaya_created() throws Exception {
    mockMvc.perform(post("/api/customers")
            .contentType(MediaType.APPLICATION_JSON)
            .header("X-Correlation-Id", "lab-request-001")
            .content("""
                {"id":"CUS-1003","name":"Maya Chen","email":"maya@example.com","status":"PROSPECT"}
                """))
        .andExpect(status().isCreated())
        .andExpect(header().string("Location", "/api/customers/CUS-1003"))
        .andExpect(jsonPath("$.id").value("CUS-1003"))
        .andExpect(jsonPath("$.name").value("Maya Chen"));
  }
}
