package com.minhw.service.imp;

import com.minhw.common.exception.IminhwRuntimeException;
import com.minhw.common.utils.ServletUtils;
import com.minhw.common.utils.ip.IpUtils;
import com.minhw.entity.StuMatriculate;
import com.minhw.mapper.StuMatriculateMapper;
import com.minhw.mapper.SysHomepageVisitLogMapper;
import com.minhw.service.StuMatriculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: iminhw-zsb-front
 * @description:
 * @author: MinHw or mz
 * @create: 2022-07-15 11:22
 **/
@Service
public class StuMatriculateServiceImp implements StuMatriculateService {

    @Autowired
    private StuMatriculateMapper stuMatriculateMapper;

    @Autowired
    private SysHomepageVisitLogMapper sysHomepageVisitLogMapper;


    @Override
    public StuMatriculate selectByPrimaryKey(String ksh) {
//        String ip = IpUtils.getIpAddr(ServletUtils.getRequest());
//        if (sysHomepageVisitLogMapper.selectByvisitIp(ip) > 30) {
//            throw new IminhwRuntimeException();
//        }
        return stuMatriculateMapper.selectByPrimaryKey(ksh);
    }

    @Override
    public StuMatriculate selectStuMatriculate(StuMatriculate stuMatriculate) {
        return stuMatriculateMapper.selectStuMatriculate(stuMatriculate);
    }
}
