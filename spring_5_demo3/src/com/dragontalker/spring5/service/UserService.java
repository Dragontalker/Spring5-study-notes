package com.dragontalker.spring5.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//在注解里面value属性值可以省略不写
//默认值是类名称, 首字母小写
//UserService --> userService
@Repository //等同于<bean id="userService" class="..."/>
public class UserService {

    public void add() {
        System.out.println("service add...");
    }
}