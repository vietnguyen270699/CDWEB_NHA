package com.exam.hostelmanager.dto;

import java.util.Date;

public class ImageDTO extends BaseDTO<ImageDTO>{
    String name;

    public ImageDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
