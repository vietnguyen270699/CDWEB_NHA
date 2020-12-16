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
public class ActionEntity extends BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int actionid;
	@Column
	private String name;
	@Column
	private String post;
	@Column
    private String user;
	
	
	

	public ActionEntity(String createDate, String createBy, String modifyDate, String modifyBy, int actionid,
			String name, String post, String user) {
		super(createDate, createBy, modifyDate, modifyBy);
		this.actionid = actionid;
		this.name = name;
		this.post = post;
		this.user = user;
	}
	public int getActionid() {
		return actionid;
	}
	public void setActionid(int actionid) {
		this.actionid = actionid;
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
