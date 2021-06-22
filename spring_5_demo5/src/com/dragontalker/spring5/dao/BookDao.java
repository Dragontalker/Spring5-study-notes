package com.dragontalker.spring5.dao;

import com.dragontalker.spring5.entity.Book;

public interface BookDao {
    void add(Book book);
    void update(Book book);
    void delete(Book book);
    int selectCount();
}
