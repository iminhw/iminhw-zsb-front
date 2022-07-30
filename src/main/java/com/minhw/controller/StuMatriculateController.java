package com.minhw.controller;

import com.alibaba.fastjson2.JSONObject;
import com.minhw.common.BaseController;
import com.minhw.common.annotation.Log;
import com.minhw.common.enums.ResultEnum;
import com.minhw.common.exception.IminhwRuntimeException;
import com.minhw.common.utils.AESUtils;
import com.minhw.common.utils.ResultVo;
import com.minhw.common.utils.ResultVoUtil;
import com.minhw.entity.StuMatriculate;
import com.minhw.service.StuMatriculateService;
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

    @Log(title="查询录取专业")
    @GetMapping("/matriculate/{ksh}")
    public String GetMatriculate(@PathVariable("ksh") String ksh){
        ResultVo resultVo = ResultVoUtil.success("成功", stuMatriculateService.selectByPrimaryKey(ksh));
        return aesStr(resultVo);
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
