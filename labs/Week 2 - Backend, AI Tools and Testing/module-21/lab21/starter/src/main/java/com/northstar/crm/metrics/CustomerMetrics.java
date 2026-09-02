package com.northstar.crm.metrics;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

@Component
public class CustomerMetrics {
    private final MeterRegistry registry;

    public CustomerMetrics(MeterRegistry registry) {
        this.registry = registry;
    }

    public void recordCreate(String result) {
        // TODO: Counter.builder("crm.customer.create").tag("result", result).register(registry).increment();
        // Never tag customerId or correlationId (cardinality)
    }

    public void recordGet(String result) {
        // TODO: Counter.builder("crm.customer.get").tag("result", result).register(registry).increment();
    }
}
