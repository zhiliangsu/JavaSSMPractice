package com.hitech.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
//MybatisConfig配置类
public class MybatisConfig {
    // 定义bean，SqlSessionFactoryBean，用于产生SqlSessionFactory对象
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        // 设置模型类的别名扫描
        ssfb.setTypeAliasesPackage("com.hitech.domain");
        // 设置数据源
        ssfb.setDataSource(dataSource);
        return ssfb;
    }

    // 定义bean，返回MapperScannerConfigurer对象
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.hitech.dao");
        return msc;
    }
}
