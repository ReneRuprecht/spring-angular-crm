package com.example.crm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf()
            .disable()
            .authorizeHttpRequests()
            .requestMatchers("/api/v1/**")
            .permitAll()
            .and()
            .authorizeHttpRequests()
            .requestMatchers("/error")
            .permitAll()
            .anyRequest()
            .authenticated();
        return httpSecurity.build();
    }

}
