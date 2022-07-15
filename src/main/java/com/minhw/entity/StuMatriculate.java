package com.minhw.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

public class StuMatriculate implements Serializable {
//    @NotEmpty(message = "考生号为空")
    @Size(min = 8, message = "考生号错误")
    private String ksh;
//    @NotEmpty(message = "身份证号码为空")
    @Size(min = 18, message = "身份证号码错误")
    private String sfzh;

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
}