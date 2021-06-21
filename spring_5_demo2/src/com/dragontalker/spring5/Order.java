package com.dragontalker.spring5;


public class Order {
    //属性
    private String orderName;
    private String address;
    //有参数的构造方法
    public Order(String orderName, String address) {
        this.orderName = orderName;
        this.address = address;
    }

    public void orderTest() {
        System.out.println(orderName + "::" + address);
    }
}
