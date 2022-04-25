package com.ynnz.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Title: Test
 * @Description:
 * @PACKAGE_NAME：com.ynnz.test
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/26 18:12
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //创建数据库连接池对象来设置数据库连接的信息
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/jw?characterEncoding=utf-8&useSSL=false");
        dataSource.setUser("root");
        dataSource.setPassword("woaijxy0628");
        //获取JdbcTemplate模板对象
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(dataSource);
        //编写sql语句并执行
        String sql = "insert into student values(1001,'zhangsan','男',21)";
        int update = template.update(sql);
        if (update > 0) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }

    }
}
