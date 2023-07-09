package com.hitech.dao.impl;

import com.hitech.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository("bookDao2")
//@Scope设置bean的作用范围: 默认值singleton（单例），可选值prototype（非单例）
// @Scope("singleton")
public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save...2");
    }
}
