package com.dragontalker.spring5.collectiontype;

import java.util.List;

public class Student {
    //1. 数组类型的属性
    private String[] courses;

    //2. list集合类型的属性
    private List<String> list;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
