package com.minhw.service;

import com.minhw.entity.StuOutNotification;

/**
 * @program: iminhw-zsb-front
 * @description:
 * @author: MinHw
 * @create: 2022-07-15 13:34
 **/
public interface StuOutNotificationService {

//    StuOutNotification selectByPrimaryKey(String ksh);

    StuOutNotification selectStuOutNotification(StuOutNotification stuOutNotification);
}
