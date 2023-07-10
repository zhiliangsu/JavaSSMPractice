package com.hitech.dao.impl;

import com.hitech.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void update() {
        System.out.println("book dao update ...");
    }

    @Override
    public int select() {
        System.out.println("book dao select is running...");
        int i = 1 / 0;
        return 100;
    }
}
