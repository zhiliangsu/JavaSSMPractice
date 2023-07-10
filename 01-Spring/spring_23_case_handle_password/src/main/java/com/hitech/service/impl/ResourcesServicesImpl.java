package com.hitech.service.impl;

import com.hitech.dao.ResourceDao;
import com.hitech.service.ResourcesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourcesServicesImpl implements ResourcesServices {
    @Autowired
    private ResourceDao resourceDao;

    @Override
    public boolean openUrl(String url, String password) {
        return resourceDao.readResources(url, password);
    }
}
