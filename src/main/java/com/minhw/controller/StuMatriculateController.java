package com.minhw.controller;

import com.minhw.common.IminhwRuntimeException;
import com.minhw.common.annotation.Log;
import com.minhw.common.utils.ResultVo;
import com.minhw.common.utils.ResultVoUtil;
import com.minhw.common.utils.StringUtils;
import com.minhw.service.StuMatriculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: iminhw-zsb-front
 * @description:
 * @author: MinHw or mz
 * @create: 2022-07-14 20:04
 **/

@RestController()
@RequestMapping("/stu")
public class StuMatriculateController {

    @Autowired
    private StuMatriculateService stuMatriculateService;

    @Log(title="查询录取专业")
    @PostMapping("/matriculate")
    public ResultVo GetMatriculate(String ksh){
        if (StringUtils.isEmpty(ksh)) {
            throw new IminhwRuntimeException("考生号不能为空", 200);
        }
        return ResultVoUtil.success("操作成功",stuMatriculateService.selectByPrimaryKey(ksh));
    }

    @GetMapping ("/matriculate")
    public ResultVo Matriculate(){
        return ResultVoUtil.ERROR;
    }
}
