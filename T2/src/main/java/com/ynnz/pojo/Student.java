package com.ynnz.pojo;

/**
 * @Title: Student
 * @Description:
 * @PACKAGE_NAME：com.ynnz.pojo
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/20 8:28
 */
public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
