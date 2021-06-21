package com.dragontalker.spring5.testdemo;

import com.dragontalker.spring5.User;
import com.dragontalker.spring5.bean.Employee;
import com.dragontalker.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void testAdd() {
        //1. 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        //2. 获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        System.out.println(userService);

        userService.add();
    }

    @Test
    public void testInfo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
        employee.info();
    }
}
