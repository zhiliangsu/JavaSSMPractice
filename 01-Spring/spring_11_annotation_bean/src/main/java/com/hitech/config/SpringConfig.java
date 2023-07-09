package com.hitech.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.hitech.service", "com.hitech.dao"})
public class SpringConfig {
}
