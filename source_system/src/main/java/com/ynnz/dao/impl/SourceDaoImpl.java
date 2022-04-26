package com.ynnz.dao.impl;

import com.ynnz.dao.SourceDao;
import com.ynnz.pojo.Source;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Title: SourceDaoImpl
 * @Description:
 * @PACKAGE_NAME：com.ynnz.dao.impl
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/27 9:37
 */

@Component("sourceDao")
public class SourceDaoImpl implements SourceDao {
    @Resource(name = "template")
    private JdbcTemplate template;

    @Override
    public List<Source> querySource() {
        String sql = "select * from tb_source";
        return template.query(sql, new Object[]{}, new BeanPropertyRowMapper<Source>(Source.class));

    }

    @Override
    public int deleteSource(int id) {
        return 0;
    }

    @Override
    public int deleteSource(Source source) {
        String sql = "delete from tb_source where id = ?";
        return template.update(sql, source.getId());
    }
}
