package com.boraji.tutorial.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.boraji.tutorial.spring.service",
      "com.boraji.tutorial.spring.dao" })
public class AppConfig {
   
}
