package com.ynnz.bean;

/**
 * @Title: ClassesFactory 静态工厂
 * @Description:
 * @PACKAGE_NAME：com.ynnz.bean
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/19 20:10
 */
public class ClassesFactory {
    public static Classes getClasses() {
        return new Classes();
    }
}
