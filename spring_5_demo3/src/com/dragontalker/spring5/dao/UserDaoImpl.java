package com.dragontalker.spring5.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("userDaoImpl add...");
    }
}
