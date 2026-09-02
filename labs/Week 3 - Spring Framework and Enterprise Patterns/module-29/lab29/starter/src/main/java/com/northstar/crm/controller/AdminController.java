package com.northstar.crm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
  @GetMapping("/ping")
  public Map<String, String> ping() {
    return Map.of("role", "ADMIN", "ok", "true");
  }
}
