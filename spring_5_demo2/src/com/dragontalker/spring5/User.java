package com.dragontalker.spring5;

public class User {

    private String userName;

    public User() {}

    public User(String userName) {
        this.userName = userName;
    }

    public void add() {
        System.out.println("add...");
    }
}
