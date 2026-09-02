package com.northstar.crm.service;

import com.northstar.crm.api.dto.CreateInteractionRequest;
import com.northstar.crm.api.dto.InteractionResponse;
import com.northstar.crm.repo.CustomerRepository;
import com.northstar.crm.repo.InteractionRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InteractionService {

  public static final String DEFAULT_CORRELATION = "lab-request-001";

  private final CustomerRepository customerRepository;
  private final InteractionRepository interactionRepository;

  public InteractionService(
      CustomerRepository customerRepository, InteractionRepository interactionRepository) {
    this.customerRepository = customerRepository;
    this.interactionRepository = interactionRepository;
  }

  @Transactional(readOnly = true)
  public List<InteractionResponse> list(String customerId) {
    // TODO: reject unknown customer; return interactions for public id newest-first
    throw new UnsupportedOperationException("TODO: implement InteractionService.list");
  }

  @Transactional
  public InteractionResponse create(CreateInteractionRequest request, String correlationHeader) {
    // TODO: resolve customer CUS-1001; persist; return DTO (not the entity)
    throw new UnsupportedOperationException("TODO: implement InteractionService.create");
  }
}
