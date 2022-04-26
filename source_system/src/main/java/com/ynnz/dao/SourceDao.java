package com.ynnz.dao;

import com.ynnz.pojo.Source;

import java.util.List;

public interface SourceDao {
    /**
     * 查询所有
     *
     * @return
     */
    List<Source> querySource();

    /**
     * 删除
     *
     * @param id
     * @return
     */
    int deleteSource(int id);

    int deleteSource(Source source);
}
