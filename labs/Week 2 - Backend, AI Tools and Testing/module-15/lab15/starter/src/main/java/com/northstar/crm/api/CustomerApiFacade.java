package com.northstar.crm.api;

import com.northstar.crm.dto.CustomerMapper;
import com.northstar.crm.dto.CustomerRequestDTO;
import com.northstar.crm.dto.CustomerResponseDTO;
import com.northstar.crm.service.CustomerService;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import java.util.Set;
import java.util.stream.Collectors;

/** Lab 14 facade adapted to Lab 15 CustomerService interface. */
public class CustomerApiFacade {
    private final CustomerService service;
    private final Validator validator;

    public CustomerApiFacade(CustomerService service) {
        this.service = service;
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    public CustomerResponseDTO create(CustomerRequestDTO request, String correlationId) {
        validateOrThrow(request, correlationId);
        var saved = service.addCustomer(CustomerMapper.toEntity(request));
        return CustomerMapper.toResponse(saved);
    }

    public CustomerResponseDTO get(String customerId, String correlationId) {
        return service.findById(customerId)
                .map(CustomerMapper::toResponse)
                .orElseThrow(() -> new IllegalArgumentException(
                        "[" + correlationId + "] Customer not found: " + customerId));
    }

    private void validateOrThrow(CustomerRequestDTO request, String correlationId) {
        Set<ConstraintViolation<CustomerRequestDTO>> violations = validator.validate(request);
        if (!violations.isEmpty()) {
            String msg = violations.stream()
                    .map(v -> v.getPropertyPath() + ": " + v.getMessage())
                    .collect(Collectors.joining("; "));
            throw new IllegalArgumentException("[" + correlationId + "] " + msg);
        }
    }
}
