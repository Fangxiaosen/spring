package com.ynnz.role.pojo;

/**
 * @Title: role
 * @Description:
 * @PACKAGE_NAME：com.ynnz.role.pojo
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/20 8:39
 */
public class Role {
    private String roleKey;
    private String roleName;

    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "role{" +
                "roleKey='" + roleKey + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
