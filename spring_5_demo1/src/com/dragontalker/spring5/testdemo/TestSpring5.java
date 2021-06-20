package com.dragontalker.spring5.testdemo;

import com.dragontalker.spring5.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testAdd() {
        //1. 加载spring配置文件
        //BeanFactory是Spring内部的使用接口, 不提供开发人员使用
        //BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");

        //ApplicationContext是BeanFactory的子接口
        //提供更多更强大的功能, 一般由开发人员进行使用
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2. 获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);

        user.add();
    }

}
