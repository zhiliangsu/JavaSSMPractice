package com.hitech.service.impl;

import com.hitech.dao.BookDao;
import com.hitech.dao.UserDao;
import com.hitech.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
        userDao.save();
    }
}
