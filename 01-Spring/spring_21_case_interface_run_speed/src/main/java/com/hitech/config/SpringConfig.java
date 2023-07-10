package com.hitech.config;

import org.springframework.context.annotation.*;

//Spring配置类：SpringConfig
@Configuration
@ComponentScan("com.hitech")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
