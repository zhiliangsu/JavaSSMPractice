package com.hitech.factory;

import com.hitech.dao.OrderDao;
import com.hitech.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
        // System.out.println("factory setup...");// 模拟必要的业务操作
        return new OrderDaoImpl();
    }
}
