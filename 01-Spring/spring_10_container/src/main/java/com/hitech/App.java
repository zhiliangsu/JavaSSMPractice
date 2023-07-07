package com.hitech;

import com.hitech.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //1.类路径下加载xml配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.文件系统下加载xml文件
        // ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\szl\\IdeaProjects\\JavaSSMPractice\\01-Spring\\spring_10_container\\src\\main\\resources\\applicationContext.xml");

        //1.通过beanID获取bean
        // BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        //2.通过beanID和类型获取bean
        // BookDao bookDao = (BookDao) ctx.getBean("bookDao", BookDao.class);
        //3.通过类型获取
        /* BookDao bookDao = (BookDao) ctx.getBean(BookDao.class);
        bookDao.save(); */
    }
}
