package com.northstar.crm.event;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@EmbeddedKafka(partitions = 1, topics = {"crm.customer-events.v1"})
@TestPropertySource(properties = {
    "spring.kafka.bootstrap-servers=${spring.embedded.kafka.brokers}",
    "crm.kafka.customer-events-topic=crm.customer-events.v1"
})
class CustomerEventIntegrationTest {

  @Test
  void contextLoads() {
    // TODO timed path: publish Amina event and await listener / store mark
  }
}
