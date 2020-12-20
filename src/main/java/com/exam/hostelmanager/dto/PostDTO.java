package com.exam.hostelmanager.dto;

import java.util.Date;

public class PostDTO extends BaseDTO<PostDTO>{
    String title;
    String content;
    String shortDescription;
    String images;
    String fee;
    String user;

    public PostDTO(String title, String content, String shortDescription, String images, String fee, String user) {
        this.title = title;
        this.content = content;
        this.shortDescription = shortDescription;
        this.images = images;
        this.fee = fee;
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}


