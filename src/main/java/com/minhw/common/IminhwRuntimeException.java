package com.minhw.common;


/**
 * @program: iminhw-zsb-front
 * @description:
 * @author: MinHw or mz
 * @create: 2022-07-16 01:15
 **/
public final class IminhwRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误提示
     */
    private String message;

    /**
     * 错误明细，内部调试错误
     * <p>
     * 和{@link CommonResult#getDetailMessage()} 一致的设计
     */
    private String detailMessage;

    public IminhwRuntimeException() {
    }

    /**
     * 空构造方法，避免反序列化问题
     */


    public IminhwRuntimeException(String message) {
        this.message = message;
    }

    public IminhwRuntimeException(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public IminhwRuntimeException setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public IminhwRuntimeException setMessage(String message) {
        this.message = message;
        return this;
    }

    public Integer getCode() {
        return code;
    }
}
