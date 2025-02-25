package com.cravershub.craver_hub.configurations;

import com.cravershub.craver_hub.filter.IdempotentFilter;
import com.cravershub.craver_hub.filter.JWTValidationFilter;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
@ComponentScan("com.cravershub.craver_hub")
@EnableWebSecurity
@EnableCaching
public class AppConfig {

    // TODO: Customer Security Provider
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable).httpBasic(AbstractHttpConfigurer::disable)
                .addFilterBefore(new JWTValidationFilter(), BasicAuthenticationFilter.class)
                .addFilterBefore(new IdempotentFilter(), JWTValidationFilter.class);
        return http.build();
    }

    @Bean
    public InMemoryHttpExchangeRepository createTraceRepository() {
        return new InMemoryHttpExchangeRepository();
    }
}
