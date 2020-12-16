package com.exam.hostelmanager.model;

import java.util.Date;

public class Reason {
    int idreason;
    String content;
    Date createDate;
    String createBy;
    Date modifyDate;
    String modifyBy;

    public Reason(int idreason, String content, Date createDate, String createBy, Date modifyDate, String modifyBy) {
        this.idreason = idreason;
        this.content = content;
        this.createDate = createDate;
        this.createBy = createBy;
        this.modifyDate = modifyDate;
        this.modifyBy = modifyBy;
    }

    public int getIdreason() {
        return idreason;
    }

    public void setIdreason(int idreason) {
        this.idreason = idreason;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }
}
