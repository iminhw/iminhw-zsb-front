package com.minhw.service;

import com.minhw.entity.StuMatriculate;

/**
 * @program: iminhw-zsb-front
 * @description:
 * @author: MinHw
 * @create: 2022-07-15 11:22
 **/
public interface StuMatriculateService {

    StuMatriculate selectByPrimaryKey(String ksh);

    StuMatriculate selectStuMatriculate(StuMatriculate stuMatriculate);
}
