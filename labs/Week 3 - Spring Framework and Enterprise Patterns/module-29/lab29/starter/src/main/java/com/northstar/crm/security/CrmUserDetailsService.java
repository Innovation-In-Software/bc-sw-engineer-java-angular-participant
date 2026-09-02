package com.northstar.crm.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CrmUserDetailsService implements UserDetailsService {
  private final PasswordEncoder encoder;

  public CrmUserDetailsService(PasswordEncoder encoder) {
    this.encoder = encoder;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    if ("agent1".equals(username)) {
      return User.withUsername("agent1").password(encoder.encode("agent1")).roles("AGENT").build();
    }
    if ("admin1".equals(username)) {
      return User.withUsername("admin1").password(encoder.encode("admin1")).roles("ADMIN").build();
    }
    throw new UsernameNotFoundException(username);
  }
}
