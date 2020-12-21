package com.exam.hostelmanager.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
public class FeedbackEntity extends BaseEntity{

	@Column
	String content;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private UserEntity userEntity;
	

	@ManyToOne(cascade = CascadeType.ALL)
	private PostEntity post_id;


	public FeedbackEntity() {
		super();
	}


	public FeedbackEntity(Long id, Date createDate, String createBy, Date modifyDate,
						  String modifyBy, String content, UserEntity userEntity, PostEntity post_id) {
		super(id, createDate, createBy, modifyDate, modifyBy);
		this.content = content;
		this.userEntity = userEntity;
		this.post_id = post_id;
	}


	public FeedbackEntity(Long id, Date createDate, String createBy, Date modifyDate, String modifyBy) {
		super(id, createDate, createBy, modifyDate, modifyBy);
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public UserEntity getUserEntity() {
		return userEntity;
	}


	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}


	public PostEntity getPost_id() {
		return post_id;
	}


	public void setPost_id(PostEntity post_id) {
		this.post_id = post_id;
	}
	
}
