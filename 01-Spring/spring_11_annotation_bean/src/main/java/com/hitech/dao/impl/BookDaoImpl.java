package com.hitech.dao.impl;

import com.hitech.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// @Component
// @Component("bookDao")
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save...");
    }
}
