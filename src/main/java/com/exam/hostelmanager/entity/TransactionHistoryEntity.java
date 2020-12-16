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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	int trandactionhistoryid;
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

	

	public TransactionHistoryEntity(String createDate, String createBy, String modifyDate, String modifyBy,
			int trandactionhistoryid, String content, String time, FeeEntity feeEntity, UserEntity userEntity,
			PostEntity postEntity) {
		super(createDate, createBy, modifyDate, modifyBy);
		this.trandactionhistoryid = trandactionhistoryid;
		this.content = content;
		this.time = time;
		this.feeEntity = feeEntity;
		this.userEntity = userEntity;
		this.postEntity = postEntity;
	}



	public PostEntity getPostEntity() {
		return postEntity;
	}

	public void setPostEntity(PostEntity postEntity) {
		this.postEntity = postEntity;
	}

	public int getTrandactionhistoryid() {
		return trandactionhistoryid;
	}

	public void setTrandactionhistoryid(int trandactionhistoryid) {
		this.trandactionhistoryid = trandactionhistoryid;
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
