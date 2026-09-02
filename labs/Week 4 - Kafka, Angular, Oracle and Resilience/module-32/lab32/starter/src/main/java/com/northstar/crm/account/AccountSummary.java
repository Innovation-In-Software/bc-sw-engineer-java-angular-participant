package com.northstar.crm.account;

public record AccountSummary(String customerId, boolean available, String note) {

  public static AccountSummary unavailable(String customerId) {
    return new AccountSummary(customerId, false, "account-profile-unavailable");
  }
}
