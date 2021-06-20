package com.dragontalker.spring5.testdemo;

/**
 * 演示使用set方法进行注入属性
 */
public class Book {

    private String bookName;

    //set方法注入
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
