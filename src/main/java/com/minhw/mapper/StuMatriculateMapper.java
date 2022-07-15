package com.minhw.mapper;

import com.minhw.entity.StuMatriculate;

public interface StuMatriculateMapper {
//    int deleteByPrimaryKey(String ksh);
//
//    int insert(StuMatriculate record);
//
//    int insertSelective(StuMatriculate record);
//
//    StuMatriculate selectByPrimaryKey(String ksh);

    StuMatriculate selectByKshOrSfzh(StuMatriculate stuMatriculate);

//    int updateByPrimaryKeySelective(StuMatriculate record);
//
//    int updateByPrimaryKey(StuMatriculate record);
}