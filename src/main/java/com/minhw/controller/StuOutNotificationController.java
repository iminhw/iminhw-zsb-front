package com.minhw.controller;

import com.minhw.common.IminhwRuntimeException;
import com.minhw.common.annotation.Log;
import com.minhw.common.utils.ResultVo;
import com.minhw.common.utils.ResultVoUtil;
import com.minhw.common.utils.StringUtils;
import com.minhw.entity.StuOutNotification;
import com.minhw.service.StuOutNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: iminhw-zsb-front
 * @description:
 * @author: MinHw or mz
 * @create: 2022-07-15 13:37
 **/

@RestController()
@RequestMapping("/stu")
public class StuOutNotificationController {

    @Autowired
    private StuOutNotificationService stuOutNotificationService;

    @Log(title = "查询通知书快递单号")
    @PostMapping("/outnotification")
    public ResultVo GetStuOutNotification(String ksh) {
        if (StringUtils.isEmpty(ksh)) {
            throw new IminhwRuntimeException("考生号不能为空");
        }
        return ResultVoUtil.success("操作成功", stuOutNotificationService.selectByPrimaryKey(ksh));
    }

    @GetMapping("/outnotification")
    public ResultVo StuOutNotification() {
        return ResultVoUtil.ERROR;
    }
}
