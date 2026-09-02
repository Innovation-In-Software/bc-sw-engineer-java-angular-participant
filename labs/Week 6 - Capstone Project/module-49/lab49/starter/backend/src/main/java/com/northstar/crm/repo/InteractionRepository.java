package com.northstar.crm.repo;

import com.northstar.crm.domain.Interaction;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

/** Session stub store. Full path: Spring Data JPA + Flyway. */
@Repository
public class InteractionRepository {

  private final Map<UUID, Interaction> store = new ConcurrentHashMap<>();

  public Interaction save(Interaction interaction) {
    if (interaction.getId() == null) {
      interaction.setId(UUID.randomUUID());
    }
    store.put(interaction.getId(), interaction);
    return interaction;
  }

  public Optional<Interaction> findById(UUID id) {
    return Optional.ofNullable(store.get(id));
  }

  /** Known demo customers for session validation. Full path: CustomerRepository. */
  public boolean customerExists(String customerId) {
    return "CUS-1001".equals(customerId) || "CUS-1002".equals(customerId);
  }
}
