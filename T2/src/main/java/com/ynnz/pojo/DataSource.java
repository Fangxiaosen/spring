package com.ynnz.pojo;

import java.util.Map;
import java.util.Properties;

/**
 * @Title: DataSource
 * @Description:
 * @PACKAGE_NAME：com.ynnz.pojo
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/20 9:43
 */
public class DataSource {
    private Map<String, String> map;
    private Properties properties;

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "map=" + map +
                ", properties=" + properties +
                '}';
    }
}
