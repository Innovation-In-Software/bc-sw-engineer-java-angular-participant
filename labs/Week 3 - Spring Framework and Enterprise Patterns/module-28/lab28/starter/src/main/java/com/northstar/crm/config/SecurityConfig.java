package com.northstar.crm.config;

import com.northstar.crm.security.JwtAuthenticationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Bean
  PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  SecurityFilterChain securityFilterChain(HttpSecurity http, JwtAuthenticationFilter jwtFilter) throws Exception {
    http.csrf(csrf -> csrf.disable());
    // TODO: sessionManagement STATELESS
    // TODO: authorizeHttpRequests:
    //   /api/auth/login, /actuator/health, /error permitAll
    //   /api/customers/** hasAnyRole("AGENT","ADMIN")
    //   /api/admin/** hasRole("ADMIN")
    //   anyRequest authenticated
    //   (permit /error so live Tomcat does not rewrite 403 → 401)
    // TODO: addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
    http.httpBasic(Customizer.withDefaults()); // temporary — replace with JWT filter chain
    return http.build();
  }
}
