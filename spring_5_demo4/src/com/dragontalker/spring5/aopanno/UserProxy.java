package com.dragontalker.spring5.aopanno;

import org.springframework.stereotype.Component;

//增强的类
@Component
public class UserProxy {

    //前置通知
    public void before() {
        System.out.println("before...");
    }
}
