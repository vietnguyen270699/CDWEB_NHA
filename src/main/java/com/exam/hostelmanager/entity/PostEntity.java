package com.exam.hostelmanager.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "post")
public class PostEntity extends BaseEntity {

    @Column
    String title;

    @Column
    String shortDescription;

    @ManyToOne(cascade = CascadeType.ALL)
    private UserEntity userEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    private FeeEntity feeEntity;

    @OneToMany(mappedBy = "post_id", cascade = CascadeType.ALL)
    private List<ImageEntity> image;

    @OneToMany(mappedBy = "post_id")
    private List<FeedbackEntity> feedback;

    @OneToMany(mappedBy = "postEntity")
    private List<TransactionHistoryEntity> transaction;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "content_id")
    private ContentEntity content;

    public PostEntity() {
        super();
    }


    public PostEntity(Long id, Date createDate, String createBy, Date modifyDate, String modifyBy) {
        super(id, createDate, createBy, modifyDate, modifyBy);
    }


    public PostEntity(Long id, Date createDate, String createBy, Date modifyDate, String modifyBy, String title,
                      String shortDescription, UserEntity userEntity, FeeEntity feeEntity, List<ImageEntity> image,
                      List<FeedbackEntity> feedback, List<TransactionHistoryEntity> transaction, ContentEntity content) {
        super(id, createDate, createBy, modifyDate, modifyBy);
        this.title = title;
        this.shortDescription = shortDescription;
        this.userEntity = userEntity;
        this.feeEntity = feeEntity;
        this.image = image;
        this.feedback = feedback;
        this.transaction = transaction;
        this.content = content;
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


    public FeeEntity getFeeEntity() {
        return feeEntity;
    }


    public void setFeeEntity(FeeEntity feeEntity) {
        this.feeEntity = feeEntity;
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


    public List<TransactionHistoryEntity> getTransaction() {
        return transaction;
    }


    public void setTransaction(List<TransactionHistoryEntity> transaction) {
        this.transaction = transaction;
    }


    public ContentEntity getContent() {
        return content;
    }


    public void setContent(ContentEntity content) {
        this.content = content;
    }


}
