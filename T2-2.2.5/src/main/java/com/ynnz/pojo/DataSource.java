package com.ynnz.pojo;

import java.util.Properties;

/**
 * @Title: DataSource
 * @Description:
 * @PACKAGE_NAME：com.ynnz.pojo
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/20 11:13
 */
public class DataSource {
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "properties=" + properties +
                '}';
    }
}
