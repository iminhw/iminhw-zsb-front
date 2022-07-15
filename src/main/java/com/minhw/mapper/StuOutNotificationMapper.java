package com.minhw.mapper;

import com.minhw.entity.StuOutNotification;

public interface StuOutNotificationMapper {
//    int deleteByPrimaryKey(String ksh);
//
//    int insert(StuOutNotification record);
//
//    int insertSelective(StuOutNotification record);

    StuOutNotification selectByPrimaryKey(String ksh);
//
//    int updateByPrimaryKeySelective(StuOutNotification record);
//
//    int updateByPrimaryKey(StuOutNotification record);
}