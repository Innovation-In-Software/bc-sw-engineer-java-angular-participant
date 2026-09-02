package com.northstar.crm.api.dto;

/**
 * TODO: Align field names with Lab 48 contracts. Session block: add Bean Validation
 * ({@code @NotBlank}, {@code @Size}) on customerId / summary / interactionType.
 */
public record CreateInteractionRequest(
    // TODO: @NotBlank on customerId
    String customerId,
    // TODO: constrain interactionType (e.g. CALL, EMAIL, NOTE)
    String interactionType,
    // TODO: @NotBlank @Size(max = ...)
    String summary,
    String correlationId
) {}
