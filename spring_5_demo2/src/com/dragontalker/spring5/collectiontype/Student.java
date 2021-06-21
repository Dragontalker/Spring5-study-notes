package com.dragontalker.spring5.collectiontype;

import java.util.List;
import java.util.Map;

public class Student {
    //1. 数组类型的属性
    private String[] courses;

    //2. list集合类型的属性
    private List<String> list;

    //3. map集合类型的属性
    private Map<String, String> map;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
