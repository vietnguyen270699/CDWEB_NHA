package com.exam.hostelmanager.model;

import java.util.Date;

public class Content {
    int idcontent;
    String description;
    double price;
    String address;
    double acreage;
    double electricPrice;
    double waterPrice;
    Date createDate;
    String createBy;
    Date modifyDate;
    String modifyBy;

    public Content(int idcontent, String description, double price, String address, double acreage, double electricPrice, double waterPrice, Date createDate, String createBy, Date modifyDate, String modifyBy) {
        this.idcontent = idcontent;
        this.description = description;
        this.price = price;
        this.address = address;
        this.acreage = acreage;
        this.electricPrice = electricPrice;
        this.waterPrice = waterPrice;
        this.createDate = createDate;
        this.createBy = createBy;
        this.modifyDate = modifyDate;
        this.modifyBy = modifyBy;
    }

    public int getIdcontent() {
        return idcontent;
    }

    public void setIdcontent(int idcontent) {
        this.idcontent = idcontent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }

    public double getElectricPrice() {
        return electricPrice;
    }

    public void setElectricPrice(double electricPrice) {
        this.electricPrice = electricPrice;
    }

    public double getWaterPrice() {
        return waterPrice;
    }

    public void setWaterPrice(double waterPrice) {
        this.waterPrice = waterPrice;
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
