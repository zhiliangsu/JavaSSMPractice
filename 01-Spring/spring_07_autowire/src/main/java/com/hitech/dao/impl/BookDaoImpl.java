package com.hitech.dao.impl;

import com.hitech.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private String databaseName;
    private int connectionNum;
    @Override
    public void save() {
        System.out.println("book dao save...");
    }
}
