package com.ynnz.bean;

/**
 * @Title: Car
 * @Description:
 * @PACKAGE_NAME：com.ynnz.bean
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/19 18:55
 */
public class Car {
    private String brand;
    private String carNo;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", carNo='" + carNo + '\'' +
                '}';
    }
}
