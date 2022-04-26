package com.ynnz.servlet.impl;

import com.ynnz.dao.SourceDao;
import com.ynnz.pojo.Source;
import com.ynnz.servlet.SourceService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Title: SourceServiceImpl
 * @Description:
 * @PACKAGE_NAME：com.ynnz.servlet.impl
 * @Author: 94358 fangjinsen
 * CreateDate: 2022/4/27 9:47
 */
@Component("sourceService")
public class SourceServiceImpl implements SourceService {
    @Resource(name = "sourceDao")
    private SourceDao sourceDao;

    @Override
    public List<Source> querySource() {
        return sourceDao.querySource();
    }

    @Override
    public int deleteSource(int id) {
        return sourceDao.deleteSource(id);
    }

    @Override
    public int deleteSource(Source source) {
        return sourceDao.deleteSource(source);
    }
}
