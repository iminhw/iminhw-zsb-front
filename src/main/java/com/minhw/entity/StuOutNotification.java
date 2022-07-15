package com.minhw.entity;

import java.io.Serializable;

public class StuOutNotification implements Serializable {
    private String ksh;
    private String kddh;
    private String xm;

    private static final long serialVersionUID = 1L;

    public StuOutNotification(String ksh, String kddh, String xm) {
        this.ksh = ksh;
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

}