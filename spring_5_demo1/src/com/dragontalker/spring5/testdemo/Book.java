package com.dragontalker.spring5.testdemo;

public class Book {

    private String bookName;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    //原始方式
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("abc");
    }
}
