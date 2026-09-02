package com.northstar.crm.controller;

import com.northstar.crm.security.JwtService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
  private final JwtService jwtService;

  public AuthController(JwtService jwtService) {
    this.jwtService = jwtService;
  }

  @PostMapping("/login")
  public Map<String, String> login(@RequestBody Map<String, String> body) {
    String username = body.getOrDefault("username", "");
    // Lab users: agent1/agent1 → AGENT; admin1/admin1 → ADMIN
    // TODO: validate credentials via CrmUserDetailsService / PasswordEncoder
    String token = jwtService.issueToken(username, username.startsWith("admin") ? "ADMIN" : "AGENT");
    return Map.of("accessToken", token, "tokenType", "Bearer");
  }
}
