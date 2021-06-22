package com.dragontalker.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {

    }

    @Override
    public void reduceMoney() {
        String sql = "update `t_account` set money = money - ? where userName = ?";
        Object[] args = {100, "lucy"};
        jdbcTemplate.update(sql, args);
    }
}
