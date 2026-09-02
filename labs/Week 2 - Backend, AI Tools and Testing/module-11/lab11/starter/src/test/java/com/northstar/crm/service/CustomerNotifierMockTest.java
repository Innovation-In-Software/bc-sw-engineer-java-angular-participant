package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class CustomerNotifierMockTest {

    @Mock
    private CustomerNotifier notifier;

    @Test
    void updateStatusInvokesNotifierWithOldAndNewStatus() {
        // TODO: new CustomerService(notifier); add CUS-1002 PROSPECT; updateStatus → ACTIVE;
        // verify(notifier).notifyStatusChange("CUS-1002", PROSPECT, ACTIVE);
        throw new UnsupportedOperationException("TODO: Mockito verify notifyStatusChange");
    }
}
