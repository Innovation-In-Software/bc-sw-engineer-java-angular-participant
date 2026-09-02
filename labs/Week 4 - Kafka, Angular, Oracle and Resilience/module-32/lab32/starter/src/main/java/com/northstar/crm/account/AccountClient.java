package com.northstar.crm.account;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class AccountClient {

  private final RestClient restClient;

  public AccountClient(@Value("${account.api.base-url}") String baseUrl) {
    this.restClient = RestClient.builder().baseUrl(baseUrl).build();
  }

  public AccountSummary fetch(String customerId) {
    // TODO: GET /accounts/{customerId}/summary — map 5xx to TemporaryAccountException
    throw new UnsupportedOperationException("TODO: call account API for " + customerId);
  }
}
