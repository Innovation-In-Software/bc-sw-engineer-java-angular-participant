package com.northstar.crm.account;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;
import java.util.concurrent.CompletableFuture;
import org.springframework.stereotype.Service;

@Service
public class AccountProfileService {

  private final AccountClient client;

  public AccountProfileService(AccountClient client) {
    this.client = client;
  }

  // TODO: add @CircuitBreaker(name = "accountProfile", fallbackMethod = "fallback")
  // TODO: add @Retry(name = "accountProfile")
  // TODO: add @TimeLimiter(name = "accountProfile")
  public CompletableFuture<AccountSummary> find(String customerId) {
    return CompletableFuture.supplyAsync(() -> client.fetch(customerId));
  }

  @SuppressWarnings("unused")
  private CompletableFuture<AccountSummary> fallback(String customerId, Throwable ex) {
    // TODO: return completed future of AccountSummary.unavailable(customerId)
    throw new UnsupportedOperationException("TODO: truthful fallback", ex);
  }
}
