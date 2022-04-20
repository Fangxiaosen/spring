package com.ynnz.service;

import com.mysql.jdbc.Connection;
import com.ynnz.pojo.DataSource;

import java.sql.DriverManager;


public class JdbcService {
    private DataSource dataSource;

    public Connection getConnection() throws Exception {
        Connection connection = null;
        Class.forName(dataSource.getProperties().getProperty("driverClassName"));
        String url = (String) dataSource.getProperties().get("url");
        String username = (String) dataSource.getProperties().get("username");
        String password = (String) dataSource.getProperties().get("password");
        connection = (Connection) DriverManager.getConnection(url, username, password);
        return connection;
    }

    public void close(Connection connection) throws Exception {
        if (connection != null) {
            connection.close();
            System.out.println("连接释放成功");
        }
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
