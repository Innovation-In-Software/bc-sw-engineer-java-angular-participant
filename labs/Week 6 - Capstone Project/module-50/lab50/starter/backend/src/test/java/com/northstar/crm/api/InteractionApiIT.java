package com.northstar.crm.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
class InteractionApiIT {

  @DynamicPropertySource
  static void postgres(DynamicPropertyRegistry registry) {
    registry.add("spring.datasource.url", () -> "jdbc:postgresql://localhost:5432/crm");
    registry.add("spring.datasource.username", () -> "crm");
    registry.add("spring.datasource.password", () -> "change-me");
  }

  @Autowired MockMvc mockMvc;

  @Test
  void list_withoutBearer_unauthorized() throws Exception {
    mockMvc
        .perform(get("/api/v1/interactions").param("customerId", "CUS-1001"))
        .andExpect(status().isUnauthorized());
  }

  @Test
  void createAndList_forAmina() throws Exception {
    String body =
        """
        {"customerId":"CUS-1001","interactionType":"NOTE","summary":"Follow-up on billing question","correlationId":"lab-request-001"}
        """;

    mockMvc
        .perform(
            post("/api/v1/interactions")
                .contentType(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer lab-demo-token")
                .header("X-Correlation-ID", "lab-request-001")
                .content(body))
        .andExpect(status().isCreated())
        .andExpect(jsonPath("$.customerId").value("CUS-1001"))
        .andExpect(jsonPath("$.correlationId").value("lab-request-001"));

    mockMvc
        .perform(
            get("/api/v1/interactions")
                .param("customerId", "CUS-1001")
                .header("Authorization", "Bearer lab-demo-token"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$[0].customerId").value("CUS-1001"));
  }

  @Test
  void create_unknownCustomer_notFound() throws Exception {
    String body =
        """
        {"customerId":"CUS-9999","interactionType":"NOTE","summary":"Should fail"}
        """;

    mockMvc
        .perform(
            post("/api/v1/interactions")
                .contentType(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer lab-demo-token")
                .content(body))
        .andExpect(status().isNotFound());
  }
}
