package com.dragontalker.spring5.test;

import com.dragontalker.spring5.entity.Book;
import com.dragontalker.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testDeleteBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book();
        book.setBookId("1");

        bookService.deleteBook(book);
    }

    @Test
    public void testBookCount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println("数据库中共有图书: " + bookService.findCount() + "本");
    }

    @Test
    public void testFindOne() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = bookService.findOne("2");
        System.out.println(book);
    }

    @Test
    public void testFindAll() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Book> bookList = bookService.findAll();
        System.out.println(bookList);
    }

    @Test
    public void testBatchAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        List<Object[]> batchArgs = new ArrayList<>();
        Object[] obj1 = {"MongoDB", "Pre-ordered"};
        Object[] obj2 = {"PHP", "Out of stock"};
        Object[] obj3 = {"TypeScript", "In Stock"};
        batchArgs.add(obj1);
        batchArgs.add(obj2);
        batchArgs.add(obj3);

        //调用批量添加
        bookService.batchAdd(batchArgs);
    }

    @Test
    public void testBatchUpdate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        List<Object[]> batchArgs = new ArrayList<>();
        Object[] obj1 = {"Java8", "Out of Stock", "1"};
        Object[] obj2 = {"JavaScript", "Back Ordered", "6"};
        batchArgs.add(obj1);
        batchArgs.add(obj2);

        //调用批量添加
        bookService.batchUpdate(batchArgs);
    }
}
