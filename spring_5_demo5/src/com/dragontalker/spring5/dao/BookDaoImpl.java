package com.dragontalker.spring5.dao;

import com.dragontalker.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao{

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        //1. 创建sql语句
        String sql = "insert into `t_book` (`bookName`, `bookStatus`) values (?, ?)";

        //2. 调用方法实现
        Object[] args = {book.getBookName(), book.getBookStatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("影响的行数: " + update + "行");
    }
}
