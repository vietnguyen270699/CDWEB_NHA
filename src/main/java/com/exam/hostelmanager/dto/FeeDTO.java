package com.exam.hostelmanager.dto;

import java.util.Date;

public class FeeDTO extends BaseDTO<FeeDTO>{
    double price;

    public FeeDTO(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
