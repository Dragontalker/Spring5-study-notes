package com.dragontalker.spring5.service;

import com.dragontalker.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    //注入dao
    @Autowired
    private UserDao userDao;

    //转账的方法
    public void accountMoney() {
        userDao.reduceMoney();
        userDao.addMoney();
    }
}
