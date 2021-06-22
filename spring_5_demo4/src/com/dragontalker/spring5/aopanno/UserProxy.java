package com.dragontalker.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//增强的类
@Component
@Aspect //生成代理对象
public class UserProxy {

    //前置通知
    public void before() {
        System.out.println("before...");
    }
}
