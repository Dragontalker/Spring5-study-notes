package com.dragontalker.spring5;

/**
 * 演示使用set方法进行注入属性
 */
public class Book {

    private String bookName;
    private String bookAuthor;
    private String bookPublisher;
    private String bookLabel;

    //set方法注入
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public void setBookLabel(String bookLabel) {
        this.bookLabel = bookLabel;
    }

    public void testDemo() {
        System.out.println(bookName + "::" + bookAuthor + "::" + bookPublisher + "::" + bookLabel);
    }
}
