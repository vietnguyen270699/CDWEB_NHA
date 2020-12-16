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

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feedbackid;
	@Column
	String content;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private UserEntity userEntity;
	

	@ManyToOne(cascade = CascadeType.ALL)
	private PostEntity post_id;


	

	public FeedbackEntity(String createDate, String createBy, String modifyDate, String modifyBy, int feedbackid,
			String content, UserEntity userEntity, PostEntity post_id) {
		super(createDate, createBy, modifyDate, modifyBy);
		this.feedbackid = feedbackid;
		this.content = content;
		this.userEntity = userEntity;
		this.post_id = post_id;
	}


	public int getFeedbackid() {
		return feedbackid;
	}


	public void setFeedbackid(int feedbackid) {
		this.feedbackid = feedbackid;
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
