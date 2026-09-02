package com.northstar.crm.event;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

/**
 * Timed-path producer: publish a keyed CRM event with acks=all + idempotence.
 */
public class CustomerEventProducer {

  public static void main(String[] args) throws Exception {
    String bootstrap = System.getenv().getOrDefault("KAFKA_BOOTSTRAP_SERVERS", "localhost:9092");
    String topic = System.getenv().getOrDefault("CRM_EVENTS_TOPIC", "crm.customer-events.v1");

    Properties props = new Properties();
    props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrap);
    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
    props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
    // TODO: set ACKS_CONFIG to "all"
    // TODO: set ENABLE_IDEMPOTENCE_CONFIG to true
    // TODO: set CLIENT_ID_CONFIG to something like "lab30-customer-producer"

    String key = "CUS-1001";
    Path payloadPath = Path.of("events/customer-created-amina.json");
    String value = Files.readString(payloadPath);

    try (KafkaProducer<String, String> producer = new KafkaProducer<>(props)) {
      // TODO: build ProducerRecord<>(topic, key, value) and send(); print metadata (partition, offset)
      ProducerRecord<String, String> record = null; // TODO
      throw new UnsupportedOperationException("TODO: send keyed record and print RecordMetadata");
    }
  }
}
