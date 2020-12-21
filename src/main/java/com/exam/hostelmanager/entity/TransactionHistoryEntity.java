package com.exam.hostelmanager.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transactionhistory")
public class TransactionHistoryEntity extends BaseEntity {
	@Column
	String content;
	@Column
	String time;

	@ManyToOne(cascade = CascadeType.ALL)
	private FeeEntity feeEntity;

	@ManyToOne(cascade = CascadeType.ALL)
	private UserEntity userEntity;

	@ManyToOne(cascade = CascadeType.ALL)
	private PostEntity postEntity;

	public FeeEntity getFeeEntity() {
		return feeEntity;
	}


	public TransactionHistoryEntity() {
		super();
	}


	public TransactionHistoryEntity(Long id, Date createDate, String createBy, Date modifyDate,
									String modifyBy, String content, String time, FeeEntity feeEntity,
									UserEntity userEntity, PostEntity postEntity) {
		super(id, createDate, createBy, modifyDate, modifyBy);
		this.content = content;
		this.time = time;
		this.feeEntity = feeEntity;
		this.userEntity = userEntity;
		this.postEntity = postEntity;
	}

	public TransactionHistoryEntity(Long id, Date createDate, String createBy, Date modifyDate, String modifyBy) {
		super(id, createDate, createBy, modifyDate, modifyBy);
	}


	public PostEntity getPostEntity() {
		return postEntity;
	}

	public void setPostEntity(PostEntity postEntity) {
		this.postEntity = postEntity;
	}


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public void setFeeEntity(FeeEntity feeEntity) {
		this.feeEntity = feeEntity;
	}

}
