package com.exam.hostelmanager.model;

import java.util.Date;

public class Fee {
    int idfee;
    double price;
    Date createDate;
    String createBy;
    Date modifyDate;
    String modifyBy;

    public Fee(int idfee, double price, Date createDate, String createBy, Date modifyDate, String modifyBy) {
        this.idfee = idfee;
        this.price = price;
        this.createDate = createDate;
        this.createBy = createBy;
        this.modifyDate = modifyDate;
        this.modifyBy = modifyBy;
    }

    public int getIdfee() {
        return idfee;
    }

    public void setIdfee(int idfee) {
        this.idfee = idfee;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
