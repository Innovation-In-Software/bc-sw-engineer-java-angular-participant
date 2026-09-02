package com.northstar.crm.account;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class AccountSeed {
  @Bean
  CommandLineRunner seedAccounts(AccountRepository accounts) {
    return args -> {
      accounts.save(new Account("ACC-MAIN-1001", "CUS-1001", "MAIN", new BigDecimal("1000.00")));
      accounts.save(new Account("ACC-LOYALTY-1001", "CUS-1001", "LOYALTY", new BigDecimal("50.00")));
      // ACC-FORCE-FAIL is intentionally NOT persisted — used to trigger rollback demos
    };
  }
}
