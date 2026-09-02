package com.northstar.crm.api;

import com.northstar.crm.api.dto.CreateInteractionRequest;
import com.northstar.crm.api.dto.InteractionResponse;
import com.northstar.crm.service.InteractionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/interactions")
public class InteractionController {

  private final InteractionService interactionService;

  public InteractionController(InteractionService interactionService) {
    this.interactionService = interactionService;
  }

  @PostMapping
  public ResponseEntity<InteractionResponse> create(
      @Valid @RequestBody CreateInteractionRequest request,
      @RequestHeader(value = "X-Correlation-ID", required = false) String correlationHeader) {
    // TODO: prefer header correlation when present; default lab-request-001 for session demos
    InteractionResponse body = interactionService.create(request, correlationHeader);
    return ResponseEntity.status(HttpStatus.CREATED).body(body);
  }
}
