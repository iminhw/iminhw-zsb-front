package com.minhw.entity;

import java.io.Serializable;
import java.util.Date;

public class SysHomepageVisitLog implements Serializable {
    private Long visitId;

    private String title;

    private Integer businessType;

    private String method;

    private String requestMethod;

    private String visitUrl;

    private String visitIp;

    private String visitLocation;

    private String visitParam;

    private String jsonResult;

    private Integer status;

    private String errorMsg;

    private Date visitTime;

    private static final long serialVersionUID = 1L;

    public SysHomepageVisitLog(Long visitId, String title, Integer businessType, String method, String requestMethod, String visitUrl, String visitIp, String visitLocation, String visitParam, String jsonResult, Integer status, String errorMsg, Date visitTime) {
        this.visitId = visitId;
        this.title = title;
        this.businessType = businessType;
        this.method = method;
        this.requestMethod = requestMethod;
        this.visitUrl = visitUrl;
        this.visitIp = visitIp;
        this.visitLocation = visitLocation;
        this.visitParam = visitParam;
        this.jsonResult = jsonResult;
        this.status = status;
        this.errorMsg = errorMsg;
        this.visitTime = visitTime;
    }

    public SysHomepageVisitLog() {
        super();
    }

    public Long getVisitId() {
        return visitId;
    }

    public void setVisitId(Long visitId) {
        this.visitId = visitId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod == null ? null : requestMethod.trim();
    }

    public String getVisitUrl() {
        return visitUrl;
    }

    public void setVisitUrl(String visitUrl) {
        this.visitUrl = visitUrl == null ? null : visitUrl.trim();
    }

    public String getVisitIp() {
        return visitIp;
    }

    public void setVisitIp(String visitIp) {
        this.visitIp = visitIp == null ? null : visitIp.trim();
    }

    public String getVisitLocation() {
        return visitLocation;
    }

    public void setVisitLocation(String visitLocation) {
        this.visitLocation = visitLocation == null ? null : visitLocation.trim();
    }

    public String getVisitParam() {
        return visitParam;
    }

    public void setVisitParam(String visitParam) {
        this.visitParam = visitParam == null ? null : visitParam.trim();
    }

    public String getJsonResult() {
        return jsonResult;
    }

    public void setJsonResult(String jsonResult) {
        this.jsonResult = jsonResult == null ? null : jsonResult.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }
}