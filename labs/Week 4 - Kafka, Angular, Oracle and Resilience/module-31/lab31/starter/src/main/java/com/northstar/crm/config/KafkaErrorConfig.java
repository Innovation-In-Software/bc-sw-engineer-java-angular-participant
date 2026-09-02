package com.northstar.crm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.listener.CommonErrorHandler;
import org.springframework.kafka.listener.DeadLetterPublishingRecoverer;
import org.springframework.kafka.listener.DefaultErrorHandler;
import org.springframework.util.backoff.FixedBackOff;

@Configuration
public class KafkaErrorConfig {

  @Bean
  public CommonErrorHandler kafkaErrorHandler(KafkaTemplate<Object, Object> template) {
    // TODO: DeadLetterPublishingRecoverer + DefaultErrorHandler with bounded FixedBackOff
    // TODO: classify non-retryable contract errors (optional for timed path)
    DeadLetterPublishingRecoverer recoverer = new DeadLetterPublishingRecoverer(template);
    return new DefaultErrorHandler(recoverer, new FixedBackOff(500L, 2L));
  }
}
