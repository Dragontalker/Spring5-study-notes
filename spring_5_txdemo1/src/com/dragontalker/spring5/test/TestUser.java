package com.dragontalker.spring5.test;

import com.dragontalker.spring5.config.TxConfig;
import com.dragontalker.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class TestUser {

    @Test
    public void testTxAnnotation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testTxXML() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testAnnotationConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    //函数式风格创建对象, 交给spring进行管理
    @Test
    public void testLambda() {
        //1. 创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        //2. 调用context的方法对象注册
        context.refresh();
        context.registerBean("user1", User.class, User::new);
        //3. 获取在spring注册的对象
        User user = (User) context.getBean("user1");
        System.out.println(user);
    }
}
