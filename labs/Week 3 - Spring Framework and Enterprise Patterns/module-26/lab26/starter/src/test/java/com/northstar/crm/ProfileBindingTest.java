package com.northstar.crm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * Timed path: replace with {@code @SpringBootTest} + {@code @ActiveProfiles("test")}
 * after YAML + {@code @ConfigurationProperties} TODOs (see LAB-26-GUIDE).
 */
class ProfileBindingTest {
  @Test
  void testProfileBindsTimeoutAndCustomerSeed() {
    fail("TODO: bind connectTimeoutMs=100, apiBaseUrl=http://localhost:9090, seed CUS-1001");
  }
}
