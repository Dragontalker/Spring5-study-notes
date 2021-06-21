package com.dragontalker.spring5.aopanno;

//增强的类
public class UserProxy {

    //前置通知
    public void before() {
        System.out.println("before...");
    }
}
