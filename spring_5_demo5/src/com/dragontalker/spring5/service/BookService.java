package com.dragontalker.spring5.service;

import com.dragontalker.spring5.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    //注入dao
    @Autowired
    private BookDao bookDao;
}
