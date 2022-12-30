package com.minhw.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class StuMatriculate implements Serializable {
    @NotEmpty(message = "考生号不能为空")
    @Size(min = 8, message = "考生号格式错误")
    @Pattern(regexp = "^[0-9]*$", message = "考生号格式错误")
    private String ksh;

//    @NotEmpty(message = "身份证号不能为空")
    @Pattern(regexp = "^([1-6][1-9]|50)\\d{4}(18|19|20)\\d{2}((0[1-9])|10|11|12)(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$", message = "身份证号格式错误")
    private String sfzh;
    @NotEmpty(message = "姓名不能为空")
    private String xm;

    private String zy;

    public StuMatriculate() {
    }

    public StuMatriculate(String ksh, String sfzh, String xm, String zy) {
        this.ksh = ksh;
        this.sfzh = sfzh;
        this.xm = xm;
        this.zy = zy;
    }

    public String getKsh() {
        return ksh;
    }

    public void setKsh(String ksh) {
        this.ksh = ksh;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    @Override
    public String toString() {
        return "StuMatriculate{" +
                "ksh='" + ksh + '\'' +
                ", sfzh='" + sfzh + '\'' +
                ", xm='" + xm + '\'' +
                ", zy='" + zy + '\'' +
                '}';
    }
}