package com.dragontalker.spring5.testdemo;

/**
 * 演示使用set方法进行注入属性
 */
public class Book {

    private String bookName;
    private String bookAuthor;

    //set方法注入
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
