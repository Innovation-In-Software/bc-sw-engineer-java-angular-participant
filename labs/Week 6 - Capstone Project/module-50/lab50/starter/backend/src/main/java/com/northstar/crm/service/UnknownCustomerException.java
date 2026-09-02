package com.northstar.crm.service;

public class UnknownCustomerException extends RuntimeException {
  public UnknownCustomerException(String customerId) {
    super("Unknown customer: " + customerId);
  }
}
