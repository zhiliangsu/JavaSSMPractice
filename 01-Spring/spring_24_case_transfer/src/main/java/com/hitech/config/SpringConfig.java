package com.hitech.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// Spring配置类：SpringConfig
@Configuration
@ComponentScan("com.hitech")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
// @EnableAspectJAutoProxy // 开启切面自动代理
@EnableTransactionManagement// 开启注解式事务驱动
public class SpringConfig {
}
