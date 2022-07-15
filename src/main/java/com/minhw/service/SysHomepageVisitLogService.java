package com.minhw.service;

import com.minhw.entity.SysHomepageVisitLog;

/**
 * @program: iminhw-zsb-front
 * @description:
 * @author: MinHw
 * @create: 2022-07-15 11:00
 **/
public interface SysHomepageVisitLogService {
    int deleteByPrimaryKey(Long visitId);

    int insert(SysHomepageVisitLog record);

    int insertSelective(SysHomepageVisitLog record);

    SysHomepageVisitLog selectByPrimaryKey(Long visitId);

    int updateByPrimaryKeySelective(SysHomepageVisitLog record);

    int updateByPrimaryKey(SysHomepageVisitLog record);
}
