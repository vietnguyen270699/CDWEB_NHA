package com.exam.hostelmanager.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "action")
public class ActionEntity extends BaseEntity {

    @Column
    private String name;
    @Column
    private String post;
    @Column
    private String user;
    
    public ActionEntity() {
		super();
	}

	public ActionEntity(Long id, Date createDate, String createBy, Date modifyDate, String modifyBy,
                        String name, String post, String user) {
        super(id, createDate, createBy, modifyDate, modifyBy);
        this.name = name;
        this.post = post;
        this.user = user;
    }

    public ActionEntity(Long id, Date createDate, String createBy, Date modifyDate, String modifyBy) {
		super(id, createDate, createBy, modifyDate, modifyBy);
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }


}
