package com.northstar.crm.api;

import com.northstar.crm.api.dto.CreateInteractionRequest;
import com.northstar.crm.api.dto.InteractionResponse;
import com.northstar.crm.service.InteractionService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/interactions")
@CrossOrigin(
    origins = "http://localhost:4200",
    allowedHeaders = {"Authorization", "Content-Type", "X-Correlation-ID", "X-Correlation-Id"})
public class InteractionController {

  private final InteractionService interactionService;

  public InteractionController(InteractionService interactionService) {
    this.interactionService = interactionService;
  }

  @GetMapping
  public List<InteractionResponse> list(@RequestParam String customerId) {
    return interactionService.list(customerId);
  }

  @PostMapping
  public ResponseEntity<InteractionResponse> create(
      @Valid @RequestBody CreateInteractionRequest request,
      @RequestHeader(value = "X-Correlation-ID", required = false) String correlationHeader) {
    InteractionResponse body = interactionService.create(request, correlationHeader);
    return ResponseEntity.status(HttpStatus.CREATED).body(body);
  }
}
