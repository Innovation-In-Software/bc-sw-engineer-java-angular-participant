package com.northstar.crm.event;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class CustomerEventPublisher {

  private final KafkaTemplate<String, CustomerEvent> kafkaTemplate;
  private final String topic;

  public CustomerEventPublisher(
      KafkaTemplate<String, CustomerEvent> kafkaTemplate,
      @Value("${crm.kafka.customer-events-topic}") String topic) {
    this.kafkaTemplate = kafkaTemplate;
    this.topic = topic;
  }

  public void publish(CustomerEvent event) {
    // TODO: send with key = event.customerId() to topic; do not use null keys
    throw new UnsupportedOperationException("TODO: KafkaTemplate.send(topic, key, event)");
  }
}
