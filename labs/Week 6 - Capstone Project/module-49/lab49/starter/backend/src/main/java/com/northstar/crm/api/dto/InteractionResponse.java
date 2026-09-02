package com.northstar.crm.api.dto;

import java.time.Instant;
import java.util.UUID;

public record InteractionResponse(
    UUID id,
    String customerId,
    String interactionType,
    String summary,
    String correlationId,
    Instant createdAt
) {}
