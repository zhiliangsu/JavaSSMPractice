package com.hitech.dao.impl;

import com.hitech.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("book dao save..." + name);
    }
}
