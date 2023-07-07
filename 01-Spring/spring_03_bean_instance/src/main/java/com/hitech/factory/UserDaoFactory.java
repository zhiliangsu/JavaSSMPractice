package com.hitech.factory;

import com.hitech.dao.UserDao;
import com.hitech.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
