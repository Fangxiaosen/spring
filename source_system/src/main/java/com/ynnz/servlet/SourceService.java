package com.ynnz.servlet;

import com.ynnz.pojo.Source;

import java.util.List;

public interface SourceService {
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
