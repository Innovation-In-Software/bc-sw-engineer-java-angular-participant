package com.northstar.crm.exception;

public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(String customerId) {
        // TODO: call super("Customer not found: " + customerId)
        super("TODO: Customer not found message for " + customerId);
    }
}
