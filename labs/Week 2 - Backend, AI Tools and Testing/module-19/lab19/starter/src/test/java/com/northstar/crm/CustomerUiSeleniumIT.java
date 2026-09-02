package com.northstar.crm;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerUiSeleniumIT {
  @LocalServerPort
  int port;

  @Test
  void aminaRowVisible() {
    // TODO: ChromeOptions --headless=new
    // TODO: open http://localhost:{port}/
    // TODO: WebDriverWait until [data-testid=customer-list] visible
    // TODO: assert [data-testid=customer-row-CUS-1001] contains Amina
    fail("TODO: aminaRowVisible");
  }
}
