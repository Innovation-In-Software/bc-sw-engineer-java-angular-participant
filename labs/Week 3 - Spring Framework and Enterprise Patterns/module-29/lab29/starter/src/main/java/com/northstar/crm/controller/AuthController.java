package com.northstar.crm.controller;

import com.northstar.crm.security.CrmUserDetailsService;
import com.northstar.crm.security.JwtService;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
  private final JwtService jwtService;
  private final CrmUserDetailsService userDetailsService;
  private final PasswordEncoder passwordEncoder;

  public AuthController(
      JwtService jwtService,
      CrmUserDetailsService userDetailsService,
      PasswordEncoder passwordEncoder) {
    this.jwtService = jwtService;
    this.userDetailsService = userDetailsService;
    this.passwordEncoder = passwordEncoder;
  }

  @PostMapping("/login")
  public Map<String, String> login(@RequestBody Map<String, String> body) {
    String username = body.getOrDefault("username", "");
    String password = body.getOrDefault("password", "");
    try {
      UserDetails user = userDetailsService.loadUserByUsername(username);
      if (!passwordEncoder.matches(password, user.getPassword())) {
        throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid credentials");
      }
      String role = user.getAuthorities().iterator().next().getAuthority().replace("ROLE_", "");
      String token = jwtService.issueToken(username, role);
      return Map.of("accessToken", token, "tokenType", "Bearer");
    } catch (ResponseStatusException ex) {
      throw ex;
    } catch (RuntimeException ex) {
      throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid credentials");
    }
  }
}
