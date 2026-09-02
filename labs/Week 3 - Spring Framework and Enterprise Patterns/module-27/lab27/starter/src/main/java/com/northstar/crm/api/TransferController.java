package com.northstar.crm.api;

import com.northstar.crm.service.TransferService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Map;

@RestController
@RequestMapping("/api/transfers")
public class TransferController {
  private final TransferService transferService;

  public TransferController(TransferService transferService) {
    this.transferService = transferService;
  }

  @PostMapping
  public Map<String, String> transfer(@RequestBody Map<String, String> body) {
    transferService.transfer(
        body.get("fromAccountId"),
        body.get("toAccountId"),
        new BigDecimal(body.get("amount")));
    return Map.of("status", "OK");
  }
}
