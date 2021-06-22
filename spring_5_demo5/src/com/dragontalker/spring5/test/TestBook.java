package com.dragontalker.spring5.test;

import com.dragontalker.spring5.entity.Book;
import com.dragontalker.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

    @Test
    public void testAddBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book();
        book.setBookName("Java");
        book.setBookStatus("Available");

        bookService.addBook(book);
    }

    @Test
    public void testUpdateBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book();
        book.setBookId("1");
        book.setBookName("Spring 5");
        book.setBookStatus("Not Available");

        bookService.updateBook(book);
    }
}
