package com.minhw.controller;

import com.minhw.common.BaseController;
import com.minhw.common.annotation.Log;
import com.minhw.common.utils.ResultVo;
import com.minhw.common.utils.ResultVoUtil;
import com.minhw.entity.StuOutNotification;
import com.minhw.service.StuOutNotificationService;
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

    @Log(title = "查询通知书快递单号")
    @GetMapping("/outnotification/{ksh}")
    public String GetStuOutNotification(@PathVariable("ksh") String ksh) {
        return aesStr(ResultVoUtil.success("成功", stuOutNotificationService.selectByPrimaryKey(ksh)));
    }

//    @PostMapping("/outnotification")
//    public ResultVo StuOutNotification(@RequestBody @Valid StuOutNotification stuOutNotification) {
//        System.out.println(stuOutNotification);
//        return ResultVoUtil.ERROR;
//    }
}
