package com.northstar.crm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO: add @Service (or @Component) stereotype
public class NotificationService {
  private static final Logger log = LoggerFactory.getLogger(NotificationService.class);

  public void notifyCreated(String customerId, String correlationId) {
    log.info("customer.created id={} correlationId={}", customerId, correlationId);
  }
}
