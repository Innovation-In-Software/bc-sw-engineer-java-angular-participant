package com.northstar.crm.api;

import com.northstar.crm.model.Customer;
import com.northstar.crm.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customers;

    public CustomerController(CustomerService customers) {
        this.customers = customers;
    }

    @PostMapping
    public ResponseEntity<Customer> create(
            @RequestHeader(value = "X-Correlation-Id", required = false) String correlationId,
            @RequestBody Customer body) {
        String corr = (correlationId == null || correlationId.isBlank()) ? "lab-request-001" : correlationId;
        if (body.getFullName() == null || body.getFullName().isBlank()) {
            return ResponseEntity.badRequest().header("X-Correlation-Id", corr).build();
        }
        Customer created = customers.create(body, corr);
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("X-Correlation-Id", corr)
                .body(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> get(
            @PathVariable String id,
            @RequestHeader(value = "X-Correlation-Id", required = false) String correlationId) {
        String corr = (correlationId == null || correlationId.isBlank()) ? "lab-request-001" : correlationId;
        return customers.findById(id)
                .map(c -> ResponseEntity.ok().header("X-Correlation-Id", corr).body(c))
                .orElseGet(() -> ResponseEntity.notFound().header("X-Correlation-Id", corr).build());
    }
}
