package com.northstar.crm.api;

import com.northstar.crm.dto.CustomerRequest;
import com.northstar.crm.model.Customer;
import com.northstar.crm.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Customer create(
      // TODO: add @Valid before CustomerRequest
      @RequestBody CustomerRequest request,
      @RequestHeader(value = "X-Correlation-Id", defaultValue = "lab-request-001") String correlationId) {
    return customerService.create(request, correlationId);
  }

  @GetMapping("/{id}")
  public Customer get(@PathVariable String id) {
    return customerService.get(id);
  }
}
