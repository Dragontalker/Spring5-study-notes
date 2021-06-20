package com.dragontalker.spring5.testdemo;

/**
 * 演示使用set方法进行注入属性
 */
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
}
