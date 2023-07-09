package com.hitech;

import com.hitech.dao.BookDao;
import com.hitech.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
        // BookService bookService = ctx.getBean(BookServiceImpl.class);
        BookService bookService = (BookService) ctx.getBean("bookServiceImpl");
        System.out.println(bookService);
    }
}
