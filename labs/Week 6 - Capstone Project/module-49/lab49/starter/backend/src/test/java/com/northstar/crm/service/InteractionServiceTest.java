package com.northstar.crm.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.northstar.crm.api.dto.CreateInteractionRequest;
import com.northstar.crm.api.dto.InteractionResponse;
import com.northstar.crm.messaging.InteractionEventPublisher;
import com.northstar.crm.repo.InteractionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InteractionServiceTest {

  private InteractionService service;

  @BeforeEach
  void setUp() {
    service = new InteractionService(new InteractionRepository(), new InteractionEventPublisher());
  }

  @Test
  void create_forAmina_returnsCreatedShape() {
    CreateInteractionRequest request =
        new CreateInteractionRequest(
            "CUS-1001", "NOTE", "Follow-up on billing question", "lab-request-001");

    // Fails until service TODOs are filled — that is intentional for the session block.
    InteractionResponse response = service.create(request, "lab-request-001");

    assertNotNull(response.id());
    assertEquals("CUS-1001", response.customerId());
    assertEquals("lab-request-001", response.correlationId());
  }

  @Test
  void create_unknownCustomer_fails() {
    CreateInteractionRequest request =
        new CreateInteractionRequest("CUS-9999", "NOTE", "Should fail", "lab-request-001");

    assertThrows(UnknownCustomerException.class, () -> service.create(request, null));
  }
}
