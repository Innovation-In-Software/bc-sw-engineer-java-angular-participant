package com.northstar.crm.event;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Component;

@Component
public class ProcessedEventStore {

  private final Set<String> seen = ConcurrentHashMap.newKeySet();

  /** @return true if this is the first time seeing eventId */
  public boolean markIfNew(String eventId) {
    // TODO: return seen.add(eventId)
    throw new UnsupportedOperationException("TODO: idempotent markIfNew");
  }
}
