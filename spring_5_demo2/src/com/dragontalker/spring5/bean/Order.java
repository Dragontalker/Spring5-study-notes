package com.dragontalker.spring5.bean;

public class Order {

    private String orderName;

    //无参数构造器
    public Order() {
        System.out.println("Step 1: 执行无参数构造器创建bean实例");
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
        System.out.println("Step 2: 调用set方法设置属性的值");
    }

    //创建执行的初始化的方法
    public void initMethod() {
        System.out.println("Step 4: 执行初始化的方法");
    }

    //创建执行的销毁的方法
    public void destroyMethod() {
        System.out.println("Step 7: 执行销毁的方法");
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                '}';
    }
}
