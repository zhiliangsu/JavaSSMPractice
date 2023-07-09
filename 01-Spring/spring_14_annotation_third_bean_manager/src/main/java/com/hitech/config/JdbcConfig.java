package com.hitech.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.hitech.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// @Configuration //不推荐使用
@PropertySource("classpath:jdbc.properties")
public class JdbcConfig {
    @Value("${driver}")
    private String driver;
    @Value("${url}")
    private String url;
    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;

    @Bean
    public DruidDataSource dataSource(BookDao bookDao) {
        System.out.println(bookDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
}
