package com.db;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.db")
@PropertySource(value = "classpath:test.properties")
public class AppConfig {

}
