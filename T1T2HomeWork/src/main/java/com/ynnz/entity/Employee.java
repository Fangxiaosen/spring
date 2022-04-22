package com.ynnz.entity;

/**
 * @Title: com.ynnz.entity.Employee
 * @Description:
 * @PACKAGE_NAME：PACKAGE_NAME
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/22 9:27
 */
public class Employee {
    private String name;
    private Car car;

    public Employee(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "com.ynnz.entity.Employee{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }

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
}
