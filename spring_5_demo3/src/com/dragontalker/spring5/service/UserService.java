package com.dragontalker.spring5.service;

import com.dragontalker.spring5.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//在注解里面value属性值可以省略不写
//默认值是类名称, 首字母小写
//UserService --> userService
@Service //等同于<bean id="userService" class="..."/>
public class UserService {

    //定义dao类型属性
    private UserDao userDao;

    public void add() {
        System.out.println("service add...");
    }
}