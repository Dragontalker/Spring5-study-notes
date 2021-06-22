package com.dragontalker.spring5.dao;

import com.dragontalker.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

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

    @Override
    public void update(Book book) {
        String sql = "update `t_book` set `bookName` = ?, `bookStatus` = ? where book_id = ?";
        Object[] args = {book.getBookName(), book.getBookStatus(), book.getBookId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("影响的行数: " + update + "行");
    }

    @Override
    public void delete(Book book) {
        String sql = "delete from `t_book` where book_id = ?";
        Object[] args = {book.getBookId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("影响的行数: " + update + "行");
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from `t_book`";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Book findBookInfo(String id) {
        String sql = "select * from `t_book` where `book_id` = ?";
        //调用方法
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
    }

    @Override
    public List<Book> findAllBook() {
        String sql = "select * from `t_book`";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
    }

    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into `t_book` (`bookName`, `bookStatus`) values (?, ?)";
        int[] batchUpdate = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(batchUpdate));
    }
}
