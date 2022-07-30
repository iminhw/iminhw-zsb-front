package com.minhw.common;

import com.alibaba.fastjson2.JSONObject;
import com.minhw.common.enums.ResultEnum;
import com.minhw.common.exception.IminhwRuntimeException;
import com.minhw.common.utils.AESUtils;
import com.minhw.common.utils.ResultVo;
import com.minhw.common.utils.ResultVoUtil;
import com.minhw.common.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: iminhw-zsb-front
 * @description: web层通用数据处理
 * @author: MinHw or mz
 * @create: 2022-07-14 20:04
 **/

public class BaseController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     * @param resultVo
     * @return
     */
    protected String aesStr(ResultVo resultVo) {
        String jsonAlias = JSONObject.toJSONString(resultVo);
        try {
            return AESUtils.encrypt(jsonAlias);
        } catch (Exception e) {
            throw new IminhwRuntimeException("加密异常", ResultEnum.ERROR.getCode());
        }
    }

    /**
     * 返回成功
     */
    public String success() {
        return aesStr(ResultVoUtil.SUCCESS);
    }



    /**
     * 返回失败消息
     */
    public String error() {
        return aesStr(ResultVoUtil.ERROR);
    }

    /**
     * 返回成功消息
     */
    public String success(String message) {
        return aesStr(ResultVoUtil.success(message));
    }

    /**
     * 返回失败消息
     */
    public String error(String message) {
        return aesStr(ResultVoUtil.error(message));
    }

    /**
     * 响应返回结果
     *
     * @param rows 影响行数
     * @return 操作结果
     */
    protected String toAesStr(int rows) {
        return rows > 0 ? aesStr(ResultVoUtil.SUCCESS) : aesStr(ResultVoUtil.ERROR);
    }

    /**
     * 响应返回结果
     *
     * @param result 结果
     * @return 操作结果
     */
    protected String toAesStr(boolean result) {
        return result ? aesStr(ResultVoUtil.SUCCESS) : aesStr(ResultVoUtil.ERROR);
    }

}
