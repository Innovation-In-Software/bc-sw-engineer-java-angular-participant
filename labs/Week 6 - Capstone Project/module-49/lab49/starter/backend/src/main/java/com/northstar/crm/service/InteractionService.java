package com.northstar.crm.service;

import com.northstar.crm.api.dto.CreateInteractionRequest;
import com.northstar.crm.api.dto.InteractionResponse;
import com.northstar.crm.domain.Interaction;
import com.northstar.crm.messaging.InteractionEventPublisher;
import com.northstar.crm.repo.InteractionRepository;
import org.springframework.stereotype.Service;

@Service
public class InteractionService {

  private final InteractionRepository interactionRepository;
  private final InteractionEventPublisher eventPublisher;

  public InteractionService(
      InteractionRepository interactionRepository, InteractionEventPublisher eventPublisher) {
    this.interactionRepository = interactionRepository;
    this.eventPublisher = eventPublisher;
  }

  /**
   * Session block: implement create flow. Full path: @Transactional + Kafka + Problem Details.
   */
  public InteractionResponse create(CreateInteractionRequest request, String correlationHeader) {
    // TODO 1: resolve correlationId (header > request > "lab-request-001")
    // TODO 2: reject unknown customer (CUS-9999 / missing) — throw domain exception
    // TODO 3: map request → Interaction, set createdAt = Instant.now()
    // TODO 4: save via repository
    // TODO 5: publish event
    // TODO 6: return InteractionResponse
    throw new UnsupportedOperationException("TODO: implement InteractionService.create");
  }
}
