package com.minhw.controller;

import com.minhw.common.BaseController;
import com.minhw.common.annotation.Log;
import com.minhw.common.utils.ResultVo;
import com.minhw.common.utils.ResultVoUtil;
import com.minhw.common.utils.ServletUtils;
import com.minhw.common.utils.ip.IpUtils;
import com.minhw.entity.StuOutNotification;
import com.minhw.service.StuOutNotificationService;
import com.minhw.service.SysHomepageVisitLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @program: iminhw-zsb-front
 * @description:
 * @author: MinHw or mz
 * @create: 2022-07-15 13:37
 **/

@RestController()
@RequestMapping("/stu")
public class StuOutNotificationController extends BaseController {

    @Autowired
    private StuOutNotificationService stuOutNotificationService;

    @Autowired
    private SysHomepageVisitLogService sysHomepageVisitLogService;

    @Log(title = "查询通知书快递单号")
    @PostMapping("/outnotification")
    public String GetStuOutNotification(@Valid @RequestBody StuOutNotification stuOutNotification) {
//        final String ip = IpUtils.getIpAddr(ServletUtils.getRequest());
//        if (sysHomepageVisitLogService.selectByvisitIp(ip) > 20){
//            return aesStr(ResultVoUtil.error("你的行为异常！！!"));
//        }else {
            return aesStr(ResultVoUtil.success("成功", stuOutNotificationService.selectStuOutNotification(stuOutNotification)));
//        }
    }

    @GetMapping("/outnotification")
    public ResultVo GetMatriculate() {
        return ResultVoUtil.error("你的行为异常！！!");
    }


}
