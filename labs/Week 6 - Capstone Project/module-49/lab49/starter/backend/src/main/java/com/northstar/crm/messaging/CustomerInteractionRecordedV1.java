package com.northstar.crm.messaging;

import java.time.Instant;
import java.util.UUID;

/**
 * Versioned event contract stub.
 * TODO: freeze field names with Lab 48 ADR; add schema version constant.
 */
public record CustomerInteractionRecordedV1(
    String eventType,
    String eventVersion,
    UUID interactionId,
    String customerId,
    String interactionType,
    String correlationId,
    Instant occurredAt
) {
  public static final String TYPE = "CustomerInteractionRecorded";
  public static final String VERSION = "1";
}
