package com.dragontalker.spring5.dao;

import com.dragontalker.spring5.entity.Book;

import java.util.List;

public interface BookDao {
    void add(Book book);
    void update(Book book);
    void delete(Book book);
    int selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBook();

    void batchAddBook(List<Object[]> batchArgs);

    void batchUpdateBook(List<Object[]> batchArgs);
}
