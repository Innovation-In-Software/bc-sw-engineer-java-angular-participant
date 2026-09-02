package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;
import static org.mockito.BDDMockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CustomerServiceBddMockTest {

    @Mock
    CustomerRepository repository;

    DefaultCustomerService service;

    @BeforeEach
    void setUp() {
        // TODO: wire real CustomerValidator + DefaultCustomerService
        throw new UnsupportedOperationException("TODO: BDD setup");
    }

    @Test
    void givenProspectWhenActivateThenSavedActive() {
        // TODO: given(repository.findById(...)).willReturn(...);
        // then(repository).should().save(...);
        throw new UnsupportedOperationException("TODO: BDDMockito given/then/should");
    }
}
