package com.northstar.crm.event;

import java.time.Instant;

/** Immutable CRM customer domain event. */
public record CustomerEvent(
    String eventId,
    String eventType,
    int eventVersion,
    Instant occurredAt,
    String customerId,
    String correlationId,
    String source,
    CustomerData data
) {
  public record CustomerData(String fullName, String status) {}
}
