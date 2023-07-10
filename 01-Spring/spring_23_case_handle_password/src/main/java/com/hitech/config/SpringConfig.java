package com.hitech.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.hitech")
@EnableAspectJAutoProxy
public class SpringConfig {
}
