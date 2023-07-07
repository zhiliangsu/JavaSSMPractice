package com.hitech;

import com.hitech.dao.BookDao;
import com.hitech.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLiceCycle {
    public static void main(String[] args) {
        // ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        /* BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save(); */
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
        ctx.close();
        // ctx.registerShutdownHook();
    }
}
