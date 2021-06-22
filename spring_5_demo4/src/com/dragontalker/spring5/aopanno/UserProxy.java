package com.dragontalker.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//增强的类
@Component
@Aspect //生成代理对象
public class UserProxy {

    //前置通知
    //@Before注解表示作为前置通知
    @Before(value = "execution(* com.dragontalker.spring5.aopanno.User.add())")
    public void before() {
        System.out.println("before...");
    }

    @AfterReturning(value = "execution(* com.dragontalker.spring5.aopanno.User.add())")
    public void afterReturning() {
        System.out.println("afterReturning...");
    }

    @AfterThrowing(value = "execution(* com.dragontalker.spring5.aopanno.User.add())")
    public void afterThrowing() {
        System.out.println("afterThrowing...");
    }

    @After(value = "execution(* com.dragontalker.spring5.aopanno.User.add())")
    public void after() {
        System.out.println("after...");
    }

    //环绕通知
    @Around(value = "execution(* com.dragontalker.spring5.aopanno.User.add())")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("before around...");

        //被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("after around...");
    }
}
