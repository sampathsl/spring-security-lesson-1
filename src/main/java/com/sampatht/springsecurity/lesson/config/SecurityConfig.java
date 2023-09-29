package com.sampatht.springsecurity.lesson.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
  @Bean
  @Order(SecurityProperties.BASIC_AUTH_ORDER)
  SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
    return http.authorizeHttpRequests((requests) -> requests.requestMatchers("/account", "/balance", "/loan", "/card").authenticated()
                    .requestMatchers("/notice", "/contact").permitAll())
            .csrf(csrf -> csrf.disable())
            .formLogin(Customizer.withDefaults())
            .httpBasic(Customizer.withDefaults()).build();
  }
}
