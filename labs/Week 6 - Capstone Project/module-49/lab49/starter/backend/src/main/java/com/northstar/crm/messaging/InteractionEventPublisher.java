package com.northstar.crm.messaging;

import com.northstar.crm.domain.Interaction;
import org.springframework.stereotype.Component;

@Component
public class InteractionEventPublisher {

  /**
   * Session stub: log or no-op. Full path: KafkaTemplate + topic from ADR-002.
   */
  public void publish(Interaction interaction) {
    // TODO: build CustomerInteractionRecordedV1 and publish to Kafka
    System.out.println(
        "TODO publish event for customer="
            + interaction.getCustomerId()
            + " correlation="
            + interaction.getCorrelationId());
  }
}
