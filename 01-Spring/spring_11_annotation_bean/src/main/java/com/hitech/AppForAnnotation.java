package com.hitech;

import com.hitech.config.SpringConfig;
import com.hitech.dao.BookDao;
import com.hitech.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        //加载配置文件初始化容器
        // ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //加载配置类初始化容器
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
        // BookService bookService = ctx.getBean(BookServiceImpl.class);
        BookService bookService = (BookService) ctx.getBean("bookServiceImpl");
        System.out.println(bookService);
    }
}
