package com.dragontalker.spring5.service;

import com.dragontalker.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    //注入dao
    @Autowired
    private UserDao userDao;

    //转账的方法
    public void accountMoney() {
        try {
            //1. 开始事务

            //2. 进行业务操作
            //lucy少100
            userDao.reduceMoney();

            //mary多100
            userDao.addMoney();

            //3. 没有发生异常, 提交事务
        } catch (Exception e) {
            e.printStackTrace();
            //4. 出现异常, 事务回滚
        }

    }
}
