package com.hitech.service.impl;

import com.hitech.dao.BookDao;
import com.hitech.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// @Component
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    @Qualifier("bookDao")
    private BookDao bookDao;

    // public void setBookDao(BookDao bookDao) {
    //     this.bookDao = bookDao;
    // }

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }
}
