package com.hitech.dao.impl;

import com.hitech.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(int id, String password) {
        System.out.println("id:" + id);
        if (true) throw new NullPointerException();
        return "itcast";
    }
}
