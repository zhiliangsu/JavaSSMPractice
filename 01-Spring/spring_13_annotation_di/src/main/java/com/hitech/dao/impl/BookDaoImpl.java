package com.hitech.dao.impl;

import com.hitech.dao.BookDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("bookDao")
//@Scope设置bean的作用范围: 默认值singleton（单例），可选值prototype（非单例）
// @Scope("singleton")
public class BookDaoImpl implements BookDao {
    @Value("${name}")
    private String name;

    @Override
    public void save() {
        System.out.println("book dao save..." + name);
    }
}
