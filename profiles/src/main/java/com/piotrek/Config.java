package com.piotrek;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class Config {

    @Bean
    @Profile("dev")
    public Dev dev() {
        return new Dev();
    }

    @Bean
    public WithoutProfile withoutProfile() {
        return new WithoutProfile();
    }

    @Bean
    @Profile("prod")
    public Prod prod() {
        return new Prod();
    }
}
