package com.ynnz.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Title: Student
 * @Description:
 * @PACKAGE_NAME：com.ynnz.entity
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/22 8:30
 */
@Component
public class Student {
    @Value("1001")
    private int id ;
    @Value("sb")
    private String name;
    @Value("nihao")
    private String sex ;
    @Value("66")
    private int age;
    @Autowired
    private Major major;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", major=" + major +
                '}';
    }

    public Student(int id, String name, String sex, int age, Major major) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.major = major;
    }

    public Student() {
    }
}
