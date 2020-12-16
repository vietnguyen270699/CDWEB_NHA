package com.exam.hostelmanager.model;

import java.util.Date;

public class Feedback {
    int idfeedBack;
    String reason;
    String content;
    String post;
    Date createDate;
    String createBy;
    Date modifyDate;
    String modifyBy;

    public Feedback(int idfeedBack, String reason, String content, String post, Date createDate, String createBy, Date modifyDate, String modifyBy) {
        this.idfeedBack = idfeedBack;
        this.reason = reason;
        this.content = content;
        this.post = post;
        this.createDate = createDate;
        this.createBy = createBy;
        this.modifyDate = modifyDate;
        this.modifyBy = modifyBy;
    }

    public int getIdfeedBack() {
        return idfeedBack;
    }

    public void setIdfeedBack(int idfeedBack) {
        this.idfeedBack = idfeedBack;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
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
