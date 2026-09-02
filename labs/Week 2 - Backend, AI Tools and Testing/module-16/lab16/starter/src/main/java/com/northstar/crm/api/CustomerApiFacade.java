package com.northstar.crm.api;

import com.northstar.crm.dto.CustomerMapper;
import com.northstar.crm.dto.CustomerRequestDTO;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.exception.BusinessException;
import com.northstar.crm.exception.GlobalExceptionHandler;
import com.northstar.crm.service.CustomerService;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import java.util.Set;

public class CustomerApiFacade {
    private final CustomerService service;
    private final Validator validator;
    private final GlobalExceptionHandler handler = new GlobalExceptionHandler();

    public CustomerApiFacade(CustomerService service) {
        this.service = service;
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    public ApiResult create(CustomerRequestDTO request, String correlationId) {
        // TODO: validate → Fail fromValidation; else addCustomer → Ok; catch BusinessException before Exception
        throw new UnsupportedOperationException("TODO: create → ApiResult");
    }

    public ApiResult getById(String customerId, String correlationId) {
        // TODO: findById → Ok DTO or BusinessException.notFound → Fail
        throw new UnsupportedOperationException("TODO: getById → ApiResult");
    }

    public ApiResult changeStatus(String customerId, CustomerStatus newStatus, String correlationId) {
        // TODO: service.changeStatus → Ok; catch BusinessException → Fail
        throw new UnsupportedOperationException("TODO: changeStatus → ApiResult");
    }
}
