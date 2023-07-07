package com.hitech;

import com.hitech.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        // bookDao.save();
        BookService bookService1 = (BookService) ctx.getBean("bookService");
        BookService bookService2 = (BookService) ctx.getBean("service4");
        System.out.println(bookService1);
        System.out.println(bookService2);
        bookService1.save();
    }
}
