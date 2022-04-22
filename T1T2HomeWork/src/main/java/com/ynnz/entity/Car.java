package com.ynnz.entity;

/**
 * @Title: com.ynnz.entity.Car
 * @Description:
 * @PACKAGE_NAME：PACKAGE_NAME
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/22 9:26
 */
public class Car {
    private String brand;
    private String color;

    public Car() {
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "com.ynnz.entity.Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
