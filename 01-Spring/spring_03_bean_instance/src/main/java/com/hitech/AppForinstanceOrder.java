package com.hitech;

import com.hitech.dao.BookDao;
import com.hitech.dao.OrderDao;
import com.hitech.factory.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForinstanceOrder {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // OrderDao orderDao = OrderDaoFactory.getOrderDao();
        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");
        orderDao.save();
    }
}
