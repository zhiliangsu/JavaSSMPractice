package com.hitech.service.impl;

import com.hitech.dao.BookDao;
import com.hitech.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        System.out.println("set...");
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }
}
