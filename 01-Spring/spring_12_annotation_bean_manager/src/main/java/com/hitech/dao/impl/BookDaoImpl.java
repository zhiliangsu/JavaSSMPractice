package com.hitech.dao.impl;

import com.hitech.dao.BookDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
//@Scope设置bean的作用范围: 默认值singleton（单例），可选值prototype（非单例）
// @Scope("singleton")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save...");
    }

    @PostConstruct // 在构造方法之后执行，替换 init-method
    public void init() {
        System.out.println("int...");
    }

    @PreDestroy // 在销毁方法之前执行,替换 destroy-method
    public void destroy() {
        System.out.println("destroy...");
    }

}
