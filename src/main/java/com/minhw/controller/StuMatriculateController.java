package com.minhw.controller;

import com.minhw.common.BaseController;
import com.minhw.common.annotation.Log;
import com.minhw.common.utils.ResultVo;
import com.minhw.common.utils.ResultVoUtil;
import com.minhw.common.utils.ServletUtils;
import com.minhw.common.utils.ip.IpUtils;
import com.minhw.entity.StuMatriculate;
import com.minhw.service.StuMatriculateService;
import com.minhw.service.SysHomepageVisitLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
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
//@Validated
public class StuMatriculateController extends BaseController {

    @Autowired
    private StuMatriculateService stuMatriculateService;

    @Autowired
    private SysHomepageVisitLogService sysHomepageVisitLogService;

    @Log(title = "查询录取专业")
    @PostMapping("/matriculate")
    public String PostMatriculate(@Valid @RequestBody StuMatriculate stuMatriculate) {
        final String ip = IpUtils.getIpAddr(ServletUtils.getRequest());
        System.out.println(stuMatriculate);
        if (sysHomepageVisitLogService.selectByvisitIp(ip) > 20) {
            return aesStr(ResultVoUtil.error("你的行为异常！！!"));
        } else {
            ResultVo resultVo = ResultVoUtil.success("成功", stuMatriculateService.selectStuMatriculate(stuMatriculate));
            return aesStr(resultVo);
        }
    }

    @GetMapping("/matriculate")
    public ResultVo GetMatriculate() {
        return ResultVoUtil.error("你的行为异常！！!");
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
