package com.ynnz.user.pojo;

/**
 * @Title: User
 * @Description:
 * @PACKAGE_NAME：com.ynnz.pojo
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/20 8:34
 */
public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
