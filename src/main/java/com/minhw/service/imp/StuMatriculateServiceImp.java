package com.minhw.service.imp;

import com.minhw.entity.StuMatriculate;
import com.minhw.mapper.StuMatriculateMapper;
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


    @Override
    public StuMatriculate selectByPrimaryKey(String ksh) {
        return stuMatriculateMapper.selectByPrimaryKey(ksh);
    }
}
