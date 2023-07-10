package com.hitech.dao.impl;

import com.hitech.dao.ResourceDao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceDaoImpl implements ResourceDao {
    @Override
    public boolean readResources(String url, String password) {
        System.out.println(password.length());
        return password.equals("root");
    }
}
