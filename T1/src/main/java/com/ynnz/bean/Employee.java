package com.ynnz.bean;

/**
 * @Title: Employee
 * @Description:
 * @PACKAGE_NAME：com.ynnz.bean
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/19 18:57
 */
public class Employee {

    private String name;
    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
