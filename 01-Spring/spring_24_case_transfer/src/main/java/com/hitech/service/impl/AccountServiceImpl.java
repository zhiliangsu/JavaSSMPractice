package com.hitech.service.impl;

import com.hitech.dao.AccountDao;
import com.hitech.domain.Account;
import com.hitech.service.AccountService;
import com.hitech.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private LogService logService;

    @Transactional(rollbackFor = {IOException.class}, timeout = -1)
    public void transfer(String out, String in, Double money) throws IOException {
        try {
            accountDao.outMoney(out, money);
            int i = 1 / 0; // 这个异常事务会回滚
            // if (true) throw new IOException(); // 这个异常事务就不会回滚
            accountDao.inMoney(in, money);
        } finally {
            logService.log(out, in, money);
        }
    }
}
