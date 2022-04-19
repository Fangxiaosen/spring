package com.ynnz.bean;

/**
 * @Title: Classes
 * @Description:
 * @PACKAGE_NAME：com.ynnz.bean
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/19 20:12
 */
public class Classes {
    private String id;
    private String name;

    public Classes(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Classes() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
