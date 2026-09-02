package com.northstar.crm;

import com.northstar.crm.api.CustomerApiFacade;
import com.northstar.crm.dto.CustomerRequestDTO;
import com.northstar.crm.dto.CustomerResponseDTO;
import com.northstar.crm.service.CustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerApiFacade api = new CustomerApiFacade(new CustomerService());
        // TODO: create CUS-1001 / CUS-1002 via DTOs; print CustomerResponseDTO only
        // TODO: attempt invalid email; show correlation lab-request-001 in failure
        throw new UnsupportedOperationException("TODO: DTO facade demo");
    }
}
