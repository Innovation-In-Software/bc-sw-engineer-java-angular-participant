package com.northstar.crm.service;

/** Domain failure when customer fixture / id is not known to the session store. */
public class UnknownCustomerException extends RuntimeException {
  public UnknownCustomerException(String message) {
    super(message);
  }
}
