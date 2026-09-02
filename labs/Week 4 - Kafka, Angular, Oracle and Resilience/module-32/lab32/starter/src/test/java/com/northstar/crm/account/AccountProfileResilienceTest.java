package com.northstar.crm.account;

import org.junit.jupiter.api.Test;

class AccountProfileResilienceTest {

  @Test
  void healthyCall_returnsAvailable() {
    // TODO: WireMock OK stub for CUS-1001 → available=true
  }

  @Test
  void openCircuit_failsFastWithoutHittingStub() {
    // TODO: force OPEN then assert fast failure / no extra WireMock traffic
  }

  @Test
  void timeout_returnsUnavailableFallback() {
    // TODO: slow stub > time limiter → fallback available=false
  }
}
