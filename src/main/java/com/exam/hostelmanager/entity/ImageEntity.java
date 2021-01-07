package com.exam.hostelmanager.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "image")
public class ImageEntity extends BaseEntity {

    @Column
    private String link;

    @ManyToOne(cascade = CascadeType.ALL)
    private PostEntity post_id;

    public ImageEntity() {
        super();
    }

    public ImageEntity(String imgLink) {
        super();
        this.link = imgLink;
    }

    public ImageEntity(Long id, Date createDate, String createBy, Date modifyDate, String modifyBy) {
        super(id, createDate, createBy, modifyDate, modifyBy);
    }

    public ImageEntity(Long id, Date createDate, String createBy, Date modifyDate, String modifyBy, String link,
                       PostEntity post_id) {
        super(id, createDate, createBy, modifyDate, modifyBy);
        this.link = link;
        this.post_id = post_id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public PostEntity getPost_id() {
        return post_id;
    }

    public void setPost_id(PostEntity post_id) {
        this.post_id = post_id;
    }

}
