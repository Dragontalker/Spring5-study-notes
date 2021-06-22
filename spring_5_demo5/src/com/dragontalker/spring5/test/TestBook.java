package com.dragontalker.spring5.test;

import com.dragontalker.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

    @Test
    public void testAddBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        context.getBean("bookService", BookService.class);

    }
}
