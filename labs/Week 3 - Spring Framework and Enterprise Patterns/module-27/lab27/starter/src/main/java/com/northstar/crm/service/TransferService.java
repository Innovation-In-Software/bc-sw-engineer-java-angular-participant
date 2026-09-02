package com.northstar.crm.service;

import com.northstar.crm.account.Account;
import com.northstar.crm.account.AccountRepository;
import com.northstar.crm.account.TransactionLogRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TransferService {
  private final AccountRepository accountRepository;
  private final TransactionLogRepository transactionLogRepository;

  public TransferService(AccountRepository accountRepository,
                         TransactionLogRepository transactionLogRepository) {
    this.accountRepository = accountRepository;
    this.transactionLogRepository = transactionLogRepository;
  }

  // TODO: add @Transactional on this method (service-layer boundary)
  public void transfer(String fromAccountId, String toAccountId, BigDecimal amount) {
    Account from = accountRepository.findById(fromAccountId)
        .orElseThrow(() -> new IllegalArgumentException("Unknown from account"));
    // TODO: if toAccountId equals "ACC-FORCE-FAIL" → throw IllegalStateException to force rollback
    Account to = accountRepository.findById(toAccountId)
        .orElseThrow(() -> new IllegalArgumentException("Unknown to account"));

    // TODO: debit from, credit to, save both
    // TODO: write TransactionLog row
    throw new UnsupportedOperationException("TODO: implement transactional transfer");
  }
}
