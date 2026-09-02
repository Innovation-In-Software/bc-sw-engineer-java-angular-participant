package com.northstar.crm.dto;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import java.time.LocalDateTime;

public final class CustomerMapper {
    private CustomerMapper() {}

    public static Customer toEntity(CustomerRequestDTO dto) {
        CustomerStatus status = CustomerStatus.valueOf(dto.getStatus().trim().toUpperCase());
        return new Customer(dto.getCustomerId(), dto.getFullName(), dto.getEmail(), null,
                status, LocalDateTime.now());
    }

    public static CustomerResponseDTO toResponse(Customer entity) {
        return CustomerResponseDTO.of(
                entity.getCustomerId(),
                entity.getFullName(),
                entity.getEmail(),
                entity.getStatus().name(),
                entity.getCreatedAt());
    }
}
