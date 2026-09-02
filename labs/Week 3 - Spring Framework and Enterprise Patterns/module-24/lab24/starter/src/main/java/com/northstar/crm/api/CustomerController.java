package com.northstar.crm.api;

import com.northstar.crm.model.Customer;
import com.northstar.crm.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
// TODO: add @CrossOrigin(origins = "http://localhost:4200") for local Angular
public class CustomerController {
  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping("/{id}")
  public ResponseEntity<Customer> getById(
      @PathVariable String id,
      @RequestHeader(value = "X-Correlation-Id", defaultValue = "lab-request-001") String correlationId) {
    // TODO: map customerService.find(id) to 200 OK or 404 Not Found
    throw new UnsupportedOperationException("TODO: GET by id with ResponseEntity");
  }

  @PostMapping
  public ResponseEntity<Customer> create(
      @RequestBody Customer body,
      @RequestHeader(value = "X-Correlation-Id", defaultValue = "lab-request-001") String correlationId) {
    // TODO: create, then 201 Created with Location /api/customers/{id}
    throw new UnsupportedOperationException("TODO: POST create with ResponseEntity.created");
  }

  @GetMapping
  public List<Customer> list(@RequestParam(required = false) String status) {
    // TODO (timed or homework): return customerService.list(status)
    throw new UnsupportedOperationException("TODO: GET collection with optional status filter");
  }
}
