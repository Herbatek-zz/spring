package com.piotrek.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:info.properties")
@ComponentScan(basePackages = "com.piotrek")
public class Config {

}
