package com.dragontalker.spring5.service;

import com.dragontalker.spring5.dao.UserDao;
import com.dragontalker.spring5.dao.UserDaoImpl;

public class UserService {

    public void add() {
        System.out.println("service add...");

        //创建UserDao对象
        UserDao userDao = new UserDaoImpl();
        userDao.update();
    }
}
