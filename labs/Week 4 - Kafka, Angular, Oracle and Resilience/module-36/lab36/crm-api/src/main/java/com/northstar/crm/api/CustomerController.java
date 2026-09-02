package com.northstar.crm.api;

import com.northstar.crm.model.Customer;
import com.northstar.crm.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = {"Authorization", "Content-Type", "X-Correlation-Id"})
public class CustomerController {
  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping("/{id}")
  public ResponseEntity<Customer> getById(
      @PathVariable String id,
      @RequestHeader(value = "X-Correlation-Id", defaultValue = "lab-request-001") String correlationId) {
    return customerService.find(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
  }

  @PostMapping
  public ResponseEntity<Customer> create(
      @RequestBody Customer body,
      @RequestHeader(value = "X-Correlation-Id", defaultValue = "lab-request-001") String correlationId) {
    Customer saved = customerService.create(body, correlationId);
    URI location = URI.create("/api/customers/" + saved.getId());
    return ResponseEntity.created(location).body(saved);
  }

  @GetMapping
  public List<Customer> list(@RequestParam(required = false) String status) {
    return customerService.list(status);
  }
}
