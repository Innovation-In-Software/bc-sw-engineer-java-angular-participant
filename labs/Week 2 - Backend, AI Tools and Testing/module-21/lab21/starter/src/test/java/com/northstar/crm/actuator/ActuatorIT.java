package com.northstar.crm.actuator;

import com.northstar.crm.health.CrmReadinessIndicator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ActuatorIT {

    @LocalServerPort
    int port;

    @Autowired
    TestRestTemplate rest;

    @Autowired
    CrmReadinessIndicator readiness;

    @Test
    void healthAndProbesAreUp() {
        // TODO: GET /actuator/health, /actuator/health/liveness, /actuator/health/readiness → 200
        throw new UnsupportedOperationException("TODO: probe checks");
    }

    @Test
    void readinessCanGoDownWhileLivenessStaysUp() {
        // TODO: readiness.setReady(false); assert readiness down / liveness up; restore true
        throw new UnsupportedOperationException("TODO: readiness toggle");
    }

    @Test
    void createMetricAppearsAfterTraffic() {
        // TODO: POST/GET traffic then GET /actuator/metrics/crm.customer.create
        throw new UnsupportedOperationException("TODO: metrics smoke");
    }
}
