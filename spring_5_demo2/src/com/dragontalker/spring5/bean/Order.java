package com.dragontalker.spring5.bean;

public class Order {

    private String orderName;

    //无参数构造器
    public Order() {
        System.out.println("Step 1: 执行无参数构造器创建bean实例");
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
