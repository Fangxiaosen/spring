package com.ynnz.entity;

/**
 * @Title: Student
 * @Description:
 * @PACKAGE_NAME：com.ynnz.entity
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/22 9:34
 */
public class Student {
    private String stuId;
    private String stuName;

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", stuName='" + stuName + '\'' +
                '}';
    }

    public Student(String stuId, String stuName) {
        this.stuId = stuId;
        this.stuName = stuName;
    }

    public Student() {
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}
