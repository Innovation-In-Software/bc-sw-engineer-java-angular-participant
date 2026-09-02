package com.northstar.crm.customer;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
  Optional<CustomerEntity> findByPublicId(String publicId);

  Page<CustomerEntity> findByStatus(String status, Pageable pageable);

  // TODO: boolean existsByEmailIgnoreCase(String email);
}
