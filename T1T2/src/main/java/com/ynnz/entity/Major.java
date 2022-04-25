package com.ynnz.entity;

import org.springframework.stereotype.Component;

/**
 * @Title: Major
 * @Description:
 * @PACKAGE_NAME：com.ynnz.entity
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/22 9:03
 */
@Component
public class Major {
    private int id;
    private String name;

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

    @Override
    public String toString() {
        return "Major{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Major(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Major() {
    }
}
