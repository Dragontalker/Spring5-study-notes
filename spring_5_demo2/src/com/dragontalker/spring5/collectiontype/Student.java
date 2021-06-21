package com.dragontalker.spring5.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    //1. 数组类型的属性
    private String[] courses;

    //2. list集合类型的属性
    private List<String> list;

    //3. map集合类型的属性
    private Map<String, String> map;

    //4. set集合类型的属性
    private Set<String> set;

    //学生所学的多门课程的集合
    private List<Course> courseList;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void test(){
        System.out.println(Arrays.toString(courses));
        System.out.println("**********");
        System.out.println(list);
        System.out.println("**********");
        System.out.println(map);
        System.out.println("**********");
        System.out.println(set);
    }
}
