package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.exception.BusinessException;
import com.northstar.crm.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CustomerServiceMockitoTest {

    @Mock
    CustomerRepository repository;

    CustomerValidator validator;
    DefaultCustomerService service;

    @BeforeEach
    void setUp() {
        // TODO: real validator + service = new DefaultCustomerService(repository, validator)
        // Prefer manual ctor wiring over @InjectMocks for clarity
        throw new UnsupportedOperationException("TODO: wire mock repo + real validator");
    }

    @Test
    void activateRaviUsesFindAndSave() {
        // TODO: stub findById(CUS-1002) → ravi PROSPECT; changeStatus ACTIVE; verify save once
        throw new UnsupportedOperationException("TODO: stub + verify activate");
    }

    @Test
    void notFoundNeverCallsSave() {
        // TODO: stub empty Optional; assertThrows; verify(repository, never()).save(any())
        throw new UnsupportedOperationException("TODO: never save on not-found");
    }

    @Test
    void addCustomerCapturesSavedEntity() {
        // TODO: ArgumentCaptor<Customer>; add Amina; assert captored id CUS-1001
        throw new UnsupportedOperationException("TODO: ArgumentCaptor");
    }
}
