package com.minhw.entity;

import java.io.Serializable;
import java.util.Date;

public class StuOutNotification implements Serializable {
    private String ksh;

    private String kddh;

    private String xm;

    private String yzbh;

    private String lxdh;

    private String yjdz;

    private Byte status;

    private String createBy;

    private String updateBy;

    private String remark;

    private Date updateTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public StuOutNotification(String ksh, String kddh, String xm, String yzbh, String lxdh, String yjdz, Byte status, String createBy, String updateBy, String remark, Date updateTime, Date createTime) {
        this.ksh = ksh;
        this.kddh = kddh;
        this.xm = xm;
        this.yzbh = yzbh;
        this.lxdh = lxdh;
        this.yjdz = yjdz;
        this.status = status;
        this.createBy = createBy;
        this.updateBy = updateBy;
        this.remark = remark;
        this.updateTime = updateTime;
        this.createTime = createTime;
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

    public String getYzbh() {
        return yzbh;
    }

    public void setYzbh(String yzbh) {
        this.yzbh = yzbh == null ? null : yzbh.trim();
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh == null ? null : lxdh.trim();
    }

    public String getYjdz() {
        return yjdz;
    }

    public void setYjdz(String yjdz) {
        this.yjdz = yjdz == null ? null : yjdz.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}