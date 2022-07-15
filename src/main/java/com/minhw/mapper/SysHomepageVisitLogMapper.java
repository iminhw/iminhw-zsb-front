package com.minhw.mapper;

import com.minhw.entity.SysHomepageVisitLog;

public interface SysHomepageVisitLogMapper {
    int deleteByPrimaryKey(Long visitId);

    int insert(SysHomepageVisitLog record);

    int insertSelective(SysHomepageVisitLog record);

    SysHomepageVisitLog selectByPrimaryKey(Long visitId);

    int updateByPrimaryKeySelective(SysHomepageVisitLog record);

    int updateByPrimaryKey(SysHomepageVisitLog record);
}