package com.minhw.common.exception;

import com.minhw.common.utils.AESUtils;
import com.minhw.common.utils.ResultVoUtil;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: iminhw-zsb-front
 * @description: 定义valid验证错误返回
 * @author: MinHw or mz
 * @create: 2022-07-26 21:48
 **/

@ControllerAdvice
public class ValidatedExceptionHandler {

    @ResponseBody
    @ExceptionHandler(BindException.class)
    public String exceptionHandler2(BindException exception) {
        BindingResult result = exception.getBindingResult();
        if (result.hasErrors()) {
            return AESUtils.aesStr(ResultVoUtil.error(result.getAllErrors().get(0).getDefaultMessage()));
        }
        return AESUtils.aesStr(ResultVoUtil.error("参数不可为空！"));
    }
    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String exceptionHandler2(MethodArgumentNotValidException exception) {
        BindingResult result = exception.getBindingResult();
        if (result.hasErrors()) {
            return AESUtils.aesStr(ResultVoUtil.error(result.getAllErrors().get(0).getDefaultMessage()));
        }
        return AESUtils.aesStr(ResultVoUtil.error("参数不可为空！"));
    }
}


