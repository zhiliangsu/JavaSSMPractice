package com.hitech.dao.impl;

import com.hitech.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {
    }

    private BookDaoImpl(int i) {
        // System.out.println("book dao constructor is running..." + i);
    }

    @Override
    public void save() {
        System.out.println("book dao save...");
    }
}
