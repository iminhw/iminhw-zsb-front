package com.minhw.controller;

import com.alibaba.fastjson2.JSONObject;
import com.minhw.common.BaseController;
import com.minhw.common.annotation.Log;
import com.minhw.common.enums.ResultEnum;
import com.minhw.common.exception.IminhwRuntimeException;
import com.minhw.common.utils.AESUtils;
import com.minhw.common.utils.ResultVo;
import com.minhw.common.utils.ResultVoUtil;
import com.minhw.common.utils.ServletUtils;
import com.minhw.common.utils.ip.IpUtils;
import com.minhw.entity.StuMatriculate;
import com.minhw.mapper.SysHomepageVisitLogMapper;
import com.minhw.service.StuMatriculateService;
import com.minhw.service.SysHomepageVisitLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @program: iminhw-zsb-front
 * @description:
 * @author: MinHw or mz
 * @create: 2022-07-14 20:04
 **/
@RestController()
@RequestMapping("/stu")
public class StuMatriculateController extends BaseController {

    @Autowired
    private StuMatriculateService stuMatriculateService;

    @Autowired
    private SysHomepageVisitLogService sysHomepageVisitLogService;

    @Log(title="查询录取专业")
    @GetMapping("/matriculate/{ksh}")
    public String GetMatriculate(@PathVariable("ksh") String ksh){
        final String ip = IpUtils.getIpAddr(ServletUtils.getRequest());
        if (sysHomepageVisitLogService.selectByvisitIp(ip) > 20){
            return aesStr(ResultVoUtil.error("你的行为异常！！!"));
        } else {
            ResultVo resultVo = ResultVoUtil.success("成功", stuMatriculateService.selectByPrimaryKey(ksh));
            return aesStr(resultVo);
        }
    }

    /**
     * @Valid
     * @param stuMatriculate
     * @return
     */
//    @Log(title="测试查询录取专业")
//    @PostMapping("/test")
//    public ResultVo stuTest(@Valid StuMatriculate stuMatriculate) {
//        System.out.println(stuMatriculate.toString());
//        try {
////            System.out.println(RsaUtils.decrypt(stuMatriculate.getKsh()));
//        } catch (Exception e) {
//            throw new IminhwRuntimeException(e);
//        }
//        return ResultVoUtil.ERROR;
//    }
}
