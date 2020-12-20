package com.exam.hostelmanager.dto;

import java.util.Date;

public class ReasonDTO extends BaseDTO<ReasonDTO>{
    String content;

    public ReasonDTO(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
