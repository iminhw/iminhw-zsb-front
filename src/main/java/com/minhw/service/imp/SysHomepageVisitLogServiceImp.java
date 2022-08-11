package com.minhw.service.imp;

import com.minhw.entity.SysHomepageVisitLog;
import com.minhw.mapper.SysHomepageVisitLogMapper;
import com.minhw.service.SysHomepageVisitLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: iminhw-zsb-front
 * @description:
 * @author: MinHw or mz
 * @create: 2022-07-15 11:00
 **/
@Service
public class SysHomepageVisitLogServiceImp implements SysHomepageVisitLogService {

    @Autowired
    private SysHomepageVisitLogMapper sysHomepageVisitLogMapper;

    @Override
    public int deleteByPrimaryKey(Long visitId) {
//        return sysHomepageVisitLogMapper.deleteByPrimaryKey(visitId);
        return 0;
    }

    @Override
    public int insert(SysHomepageVisitLog record) {
        return sysHomepageVisitLogMapper.insert(record);
    }

    @Override
    public int insertSelective(SysHomepageVisitLog record) {
        return sysHomepageVisitLogMapper.insertSelective(record);
    }

    @Override
    public SysHomepageVisitLog selectByPrimaryKey(Long visitId) {
//        return sysHomepageVisitLogMapper.selectByPrimaryKey(visitId);
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SysHomepageVisitLog record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SysHomepageVisitLog record) {
        return 0;
    }

    @Override
    public int selectByvisitIp(String visitIp) {
        return sysHomepageVisitLogMapper.selectByvisitIp(visitIp);
    }
}
