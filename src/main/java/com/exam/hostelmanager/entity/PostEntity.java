package com.exam.hostelmanager.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "post")
public class PostEntity extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int postid;
	@Column
	String title;

	@Column
	String shortDescription;

	@ManyToOne(cascade = CascadeType.ALL)
	private UserEntity userEntity;

	@ManyToOne(cascade = CascadeType.ALL)
	private FeeEntity feeEntity;
	
	@OneToMany(mappedBy = "post_id")
	private List<ImageEntity> image;

	@OneToMany(mappedBy = "post_id")
	private List<FeedbackEntity> feedback;

	@OneToMany(mappedBy = "postEntity")
	private List<TransactionHistoryEntity> trasaction;
	
	
	@OneToOne
	@JoinColumn(name = "content_id")
	private ContentEntity content;
	

	
	public FeeEntity getFeeEntity() {
		return feeEntity;
	}

	public void setFeeEntity(FeeEntity feeEntity) {
		this.feeEntity = feeEntity;
	}

	public List<TransactionHistoryEntity> getTrasaction() {
		return trasaction;
	}

	public void setTrasaction(List<TransactionHistoryEntity> trasaction) {
		this.trasaction = trasaction;
	}

	
	public PostEntity(String createDate, String createBy, String modifyDate, String modifyBy, int postid, String title,
			String shortDescription, UserEntity userEntity, FeeEntity feeEntity, List<ImageEntity> image,
			List<FeedbackEntity> feedback, List<TransactionHistoryEntity> trasaction, ContentEntity content) {
		super(createDate, createBy, modifyDate, modifyBy);
		this.postid = postid;
		this.title = title;
		this.shortDescription = shortDescription;
		this.userEntity = userEntity;
		this.feeEntity = feeEntity;
		this.image = image;
		this.feedback = feedback;
		this.trasaction = trasaction;
		this.content = content;
	}

	public int getPostid() {
		return postid;
	}

	public void setPostid(int postid) {
		this.postid = postid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public List<ImageEntity> getImage() {
		return image;
	}

	public void setImage(List<ImageEntity> image) {
		this.image = image;
	}

	public List<FeedbackEntity> getFeedback() {
		return feedback;
	}

	public void setFeedback(List<FeedbackEntity> feedback) {
		this.feedback = feedback;
	}



	public ContentEntity getContent() {
		return content;
	}

	public void setContent(ContentEntity content) {
		this.content = content;
	}
	
}
