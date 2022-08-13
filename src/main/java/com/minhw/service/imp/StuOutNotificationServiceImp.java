package com.minhw.service.imp;

import com.minhw.entity.StuOutNotification;
import com.minhw.mapper.StuMatriculateMapper;
import com.minhw.mapper.StuOutNotificationMapper;
import com.minhw.service.StuOutNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: iminhw-zsb-front
 * @description:
 * @author: MinHw or mz
 * @create: 2022-07-15 13:34
 **/
@Service
public class StuOutNotificationServiceImp implements StuOutNotificationService {

    @Autowired
    private StuOutNotificationMapper stuOutNotificationMapper;


//    @Override
//    public StuOutNotification selectByPrimaryKey(String ksh) {
//        return stuOutNotificationMapper.selectByPrimaryKey(ksh);
//    }

    @Override
    public StuOutNotification selectStuOutNotification(StuOutNotification stuOutNotification) {
        return stuOutNotificationMapper.selectStuOutNotification(stuOutNotification);
    }

}
