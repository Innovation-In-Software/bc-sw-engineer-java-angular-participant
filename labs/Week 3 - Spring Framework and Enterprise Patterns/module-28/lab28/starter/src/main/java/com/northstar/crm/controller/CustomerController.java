package com.northstar.crm.controller;

import com.northstar.crm.model.Customer;
import com.northstar.crm.service.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping("/{id}")
  public Customer get(@PathVariable String id) {
    return customerService.get(id);
  }
}
