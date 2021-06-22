package com.dragontalker.spring5.service;

import com.dragontalker.spring5.dao.BookDao;
import com.dragontalker.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加的方法
    public void addBook(Book book) {
        bookDao.add(book);
    }

    //修改的方法
    public void updateBook(Book book) {
        bookDao.update(book);
    }

    //删除的方法
    public void deleteBook(Book book) {
        bookDao.delete(book);
    }

    //查询表中的记录数
    public int findCount() {
        return bookDao.selectCount();
    }

    //查询返回对象
    public Book findOne(String id) {
        return bookDao.findBookInfo(id);
    }
}
