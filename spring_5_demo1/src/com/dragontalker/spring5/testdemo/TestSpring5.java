package com.dragontalker.spring5.testdemo;

import com.dragontalker.spring5.Book;
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
        //加载配置文件的时候不会创建里面的对象, 而是在获取对象或使用的时候再创建对象, 类似于懒汉模式
        //BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");

        //ApplicationContext是BeanFactory的子接口
        //提供更多更强大的功能, 一般由开发人员进行使用
        //加载配置文件的时候就把在配置文件中的对象进行创建, 类似于饿汉模式
        //一般在Tomcat服务器启动时就加载所有的类, 更适用于Web Service
        //创建对象时, 默认调用无参的构造器
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2. 获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);

        user.add();
    }

    @Test
    public void testBook1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        book.testDemo();
    }

}
