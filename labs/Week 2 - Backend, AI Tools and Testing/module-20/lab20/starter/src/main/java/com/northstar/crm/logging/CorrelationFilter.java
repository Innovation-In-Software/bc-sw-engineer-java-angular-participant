package com.northstar.crm.logging;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class CorrelationFilter extends OncePerRequestFilter {
    public static final String HEADER = "X-Correlation-Id";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        // TODO: read X-Correlation-Id (default lab-request-001); MDC.put("corr", ...); echo response header
        // TODO: call filterChain.doFilter ONLY inside try; always MDC.clear() in finally
        // Do NOT leave a bare doFilter call outside try/finally (double-invoke / skipped MDC).
        throw new UnsupportedOperationException("TODO: wire MDC + doFilter in try/finally");
    }
}
