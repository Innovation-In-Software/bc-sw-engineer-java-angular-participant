package com.northstar.crm.repo;

import com.northstar.crm.domain.InteractionEntity;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InteractionRepository extends JpaRepository<InteractionEntity, UUID> {
  List<InteractionEntity> findByCustomer_PublicIdOrderByCreatedAtDesc(String publicId);
}
