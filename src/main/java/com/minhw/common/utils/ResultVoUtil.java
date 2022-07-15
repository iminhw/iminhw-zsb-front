package com.minhw.common.utils;


import com.minhw.common.enums.ResultEnum;

/**
 * 响应数据(结果)最外层对象工具
 * @author minhw
 */
public class ResultVoUtil {

    public static ResultVo SUCCESS = success("操作成功");
    public static ResultVo ERROR = success("操作失败");


    /**
     *
     * @param code
     * @param msg
     * @param object
     * @return
     */
    public static ResultVo success(Integer code, String msg, Object object){
        ResultVo<Object> resultVo = new ResultVo<>();
        resultVo.setMessage(msg);
        resultVo.setStatus(code);
        resultVo.setData(object);
        return resultVo;
    }

    public static ResultVo success(Integer code, String msg){
        ResultVo<Object> resultVo = new ResultVo<>();
        resultVo.setMessage(msg);
        resultVo.setStatus(code);
        return resultVo;
    }



    /**
     * 操作成功 (默认状态
     * @param msg 提示信息
     * @param object 对象
     */
    public static ResultVo success(String msg, Object object){
        ResultVo<Object> resultVo = new ResultVo<>();
        resultVo.setMessage(msg);
        resultVo.setStatus(ResultEnum.SUCCESS.getStatus());
        resultVo.setData(object);
        return resultVo;
    }

    /**
     * 操作成功，使用默认的提示信息
     * @param object 对象
     */
    public static ResultVo success(Object object){
        String message = ResultEnum.SUCCESS.getMessage();
        return success(message, object);
    }

    /**
     * 操作成功，返回提示信息，不返回数据
     */
    public static ResultVo success(String msg){
        Object object = null;
        return success(msg, object);
    }

    /**
     * 操作成功，不返回数据
     */
    public static ResultVo success(){
        return success(null);
    }


    /**
     * 操作有误
     * @param code 错误码
     * @param msg 提示信息
     */
    public static ResultVo error(Integer code, String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setMessage(msg);
        resultVo.setStatus(code);
        return resultVo;
    }

    /**
     * 操作有误，使用默认 400 错误码
     * @param msg 提示信息
     */
    public static ResultVo error(String msg){
        Integer code = ResultEnum.ERROR.getStatus();
        return error(code, msg);
    }

    /**
     * 操作有误，只返回默认错误状态码
     */
    public static ResultVo error(){
        return error(null);
    }

}
