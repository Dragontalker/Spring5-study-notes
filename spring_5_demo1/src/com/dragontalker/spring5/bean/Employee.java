package com.dragontalker.spring5.bean;

public class Employee {
    private String employeeName;
    private String gender;

    //员工属于某一个部门, 使用对象形式标识
    private Department department;

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
