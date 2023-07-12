package com.hitech.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    // 加载springmvc配置类
    protected WebApplicationContext createServletApplicationContext() {
        // 初始化WebApplicationContext对象
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        // 加载指定配置类
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    protected String[] getServletMappings() {
        // 设置由springmvc控制器处理的请求映射路径
        return new String[]{"/"};
    }

    protected WebApplicationContext createRootApplicationContext() {
        // 加载spring配置类
        return null;
    }
}
