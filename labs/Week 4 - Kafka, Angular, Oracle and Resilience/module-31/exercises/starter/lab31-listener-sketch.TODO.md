# Listener sketch

```java
@KafkaListener(topics = "crm.customer-events.v1", groupId = "TODO")
void onEvent(/* TODO key, payload */) {
  // validate key == customerId
}
```
