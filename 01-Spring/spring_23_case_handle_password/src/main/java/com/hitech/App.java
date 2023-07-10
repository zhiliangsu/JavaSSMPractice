package com.hitech;

import com.hitech.config.SpringConfig;
import com.hitech.service.ResourcesServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourcesServices resourcesServices = ctx.getBean(ResourcesServices.class);
        boolean flag = resourcesServices.openUrl("http://pan.baidu.com/haha", "  root ");
        System.out.println(flag);
    }
}
