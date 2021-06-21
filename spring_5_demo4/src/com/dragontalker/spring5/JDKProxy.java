package com.dragontalker.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {

    public static void main(String[] args) {
        //创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};
        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy());
    }
}

//创建代理对象代码
class UserDaoProxy implements InvocationHandler {

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
