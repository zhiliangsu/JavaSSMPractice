package com.hitech;

import com.hitech.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Map;

public class App {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        // getEnv();
        /* DataSource dataSource1 = (DataSource) ctx.getBean("dataSource");
        DataSource dataSource2 = (DataSource) ctx.getBean("c3p0DataSource");
        System.out.println(dataSource1);
        System.out.println(dataSource2); */
    }

    public static void getEnv() {
        Map<String, String> env = System.getenv();
        env.forEach((key, value) -> {
            System.out.println(key + "=" + value);
        });
    }
}
