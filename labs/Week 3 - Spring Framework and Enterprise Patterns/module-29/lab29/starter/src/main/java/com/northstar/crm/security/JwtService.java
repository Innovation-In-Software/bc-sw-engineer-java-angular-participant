package com.northstar.crm.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class JwtService {
  private final String secret;

  public JwtService(@Value("${northstar.security.jwt-secret}") String secret) {
    this.secret = secret;
  }

  public String issueToken(String subject, String role) {
    // Timed-path lab stub — pin jjwt (or similar) for production-like HS256 signing.
    // Secret is retained for future signing; do not log raw tokens.
    if (subject == null || subject.isBlank() || role == null || role.isBlank()) {
      throw new IllegalArgumentException("subject and role required");
    }
    return "lab." + subject + "." + role + "." + Integer.toHexString(secret.hashCode());
  }

  public String parseSubject(String token) {
    String[] parts = requireLabToken(token);
    return parts[1];
  }

  public String parseRole(String token) {
    String[] parts = requireLabToken(token);
    return parts[2];
  }

  private String[] requireLabToken(String token) {
    if (token == null || token.isBlank()) {
      throw new IllegalArgumentException("missing token");
    }
    String[] parts = token.split("\\.");
    if (parts.length < 4 || !"lab".equals(parts[0])) {
      throw new IllegalArgumentException("invalid token");
    }
    String expectedSig = Integer.toHexString(secret.hashCode());
    if (!expectedSig.equals(parts[3])) {
      throw new IllegalArgumentException("invalid token signature");
    }
    return parts;
  }
}
