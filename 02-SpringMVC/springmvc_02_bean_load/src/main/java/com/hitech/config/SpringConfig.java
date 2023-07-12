package com.hitech.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;


@Configuration
// @ComponentScan("com.hitech")
@ComponentScan({"com.hitech.service", "com.hitech.dao"}) // 方式一:修改Spring配置类，设定扫描范围为精准范围
/* @ComponentScan(value = "com.hitech",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = Controller.class
        )
)
// 方式二:修改Spring配置类，设定扫描范围为com.itheima,排除掉controller包中的bean
// 测试的时候，需要把SpringMvcConfig配置类上的@ComponentScan注解注释掉，否则不会报错*/
public class SpringConfig {
}
