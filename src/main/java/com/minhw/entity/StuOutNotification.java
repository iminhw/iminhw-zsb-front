package com.minhw.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class StuOutNotification implements Serializable {
    @NotEmpty(message = "考生号不能为空")
    @Size(min = 8, message = "考生号格式错误")
    @Pattern(regexp = "^[0-9]*$", message = "考生号格式错误")
    private String ksh;
//    @NotEmpty(message = "身份证号不能为空")
    @Pattern(regexp = "^([1-6][1-9]|50)\\d{4}(18|19|20)\\d{2}((0[1-9])|10|11|12)(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$", message = "身份证号格式错误")
    private String sfzh;
    private String kddh;
    @NotEmpty(message = "姓名不能为空")
    private String xm;


    private static final long serialVersionUID = 1L;

    public StuOutNotification(String ksh, String sfzh, String kddh, String xm) {
        this.ksh = ksh;
        this.sfzh = sfzh;
        this.kddh = kddh;
        this.xm = xm;
    }

    public StuOutNotification() {
        super();
    }

    public String getKsh() {
        return ksh;
    }

    public void setKsh(String ksh) {
        this.ksh = ksh == null ? null : ksh.trim();
    }

    public String getKddh() {
        return kddh;
    }

    public void setKddh(String kddh) {
        this.kddh = kddh == null ? null : kddh.trim();
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }
}