package com.northstar.crm.customer;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;

@SpringBootTest
class CustomerRepositoryIT {

  // Prefer Testcontainers PostgreSQL when available; otherwise point at local compose.
  // TODO: register datasource URL/user/password for real PostgreSQL (not H2).

  @Autowired CustomerRepository repository;

  @Test
  void saveAndFindByPublicId() {
    // TODO: persist CUS-1001 and assert findByPublicId
    assertThat(repository).isNotNull();
  }
}
