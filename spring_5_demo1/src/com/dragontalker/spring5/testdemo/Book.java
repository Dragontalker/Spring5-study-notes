package com.dragontalker.spring5.testdemo;

public class Book {

    private String bookName;

    public Book() {}

    //有参数构造注入
    public Book(String bookName) {
        this.bookName = bookName;
    }

    //set方法注入
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    //原始方式
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("abc");

        Book book1 = new Book("def");
    }
}
