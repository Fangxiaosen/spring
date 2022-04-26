package com.ynnz.pojo;

import org.springframework.stereotype.Component;

/**
 * @Title: Source
 * @Description:
 * @PACKAGE_NAME：com.ynnz.pojo
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/8 16:18
 */
@Component
public class Source {
    private int id;
    private String name;
    private String type;
    private String uploadDate;

    public Source() {
        super();
    }

    public Source(int id, String name, String type, String uploadDate) {
        super();
        this.id = id;
        this.name = name;
        this.type = type;
        this.uploadDate = uploadDate;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    @Override
    public String toString() {
        return "Source{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", uploadDate='" + uploadDate + '\'' +
                '}';
    }
}
