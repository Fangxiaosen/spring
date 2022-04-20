package com.ynnz.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Title: student
 * @Description:
 * @PACKAGE_NAME：com.ynnz.entity
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/20 9:28
 */

/**
 * @Component：实例化对象到spring容器中（创建Javabean对象）
 */
@Component
public class Student {
    //@value设置Javabean的属性值
    @Value("1001")
    private int id;
    @Value("邹华友")
    private String name;
    @Value("女")
    private String sex;

    @Autowired
    //@Autowired：在当前类中去引用其他类
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
                ", major=" + major +
                '}';
    }
}
