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
    // TODO: build JWT or lab stub "lab."+subject+"."+role — do not log raw tokens
    throw new UnsupportedOperationException("TODO: issueToken");
  }

  public String parseSubject(String token) {
    // TODO: validate signature/expiry; return subject
    throw new UnsupportedOperationException("TODO: parseSubject");
  }

  public String parseRole(String token) {
    // TODO: return AGENT or ADMIN claim
    throw new UnsupportedOperationException("TODO: parseRole");
  }
}
