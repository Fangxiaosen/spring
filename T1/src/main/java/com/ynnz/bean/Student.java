package com.ynnz.bean;

/**
 * @Title: Student
 * @Description:
 * @PACKAGE_NAME：com.ynnz.baen
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/19 18:45
 */
public class Student {
    private String stuid;
    private String name;
    private Phone phone;

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid='" + stuid + '\'' +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
