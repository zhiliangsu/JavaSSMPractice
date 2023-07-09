package com.hitech.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.hitech")
@Import({JdbcConfig.class})
public class SpringConfig {
}
