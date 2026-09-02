package com.northstar.crm.mapper;

import com.northstar.crm.dto.CustomerRequestDTO;
import com.northstar.crm.dto.CustomerResponseDTO;
import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;

public final class CustomerMapper {
    private CustomerMapper() {}

    public static Customer toEntity(CustomerRequestDTO dto) {
        // TODO: map DTO → Customer (parse status with CustomerStatus.valueOf)
        throw new UnsupportedOperationException("TODO: toEntity");
    }

    public static CustomerResponseDTO toResponse(Customer entity) {
        // TODO: map entity → response DTO (never return entity from API)
        throw new UnsupportedOperationException("TODO: toResponse");
    }
}
