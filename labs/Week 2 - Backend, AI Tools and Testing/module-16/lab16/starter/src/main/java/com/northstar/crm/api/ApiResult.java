package com.northstar.crm.api;

import com.northstar.crm.dto.CustomerResponseDTO;
import com.northstar.crm.exception.ErrorResponse;

public sealed interface ApiResult {
    record Ok(CustomerResponseDTO body) implements ApiResult {}
    record Fail(ErrorResponse error) implements ApiResult {}
}
