package com.hitech;

import com.hitech.config.SpringConfig;
import com.hitech.dao.BookDao;
import com.hitech.service.BookService;
import com.hitech.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean(BookServiceImpl.class);
        bookService.save();
    }
}
