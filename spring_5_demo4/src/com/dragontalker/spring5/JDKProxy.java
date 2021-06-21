package com.dragontalker.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {

    public static void main(String[] args) {
        //创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};
        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy());
    }
}

//创建代理对象代码
class UserDaoProxy implements InvocationHandler {
    //1. 把创建的是谁的代理对象, 把谁传递过来
    private Object obj;

    //有参数构造进行传递
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前
        System.out.println("方法之前执行..." + method.getName() + ": 传递的参数..." + Arrays.toString(args));

        //被增强的方法执行
        method.invoke(obj, args);

        //方法之后
        return null;
    }
}
