package com.exam.hostelmanager.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fee")
public class FeeEntity extends BaseEntity {

    @Column
    private double price;

    @OneToMany(mappedBy = "feeEntity")
    private List<TransactionHistoryEntity> transactionList;

    @OneToMany(mappedBy = "feeEntity")
    private List<PostEntity> postList;


    public FeeEntity(Long id, Date createDate, String createBy, Date modifyDate, String modifyBy,
                     double price, List<TransactionHistoryEntity> transactionList,
                     List<PostEntity> postList) {
        super(id, createDate, createBy, modifyDate, modifyBy);
        this.price = price;
        this.transactionList = transactionList;
        this.postList = postList;
    }
    
    
    public FeeEntity() {
		super();
	}


	public FeeEntity(Long id, Date createDate, String createBy, Date modifyDate, String modifyBy) {
		super(id, createDate, createBy, modifyDate, modifyBy);
	}


	public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<TransactionHistoryEntity> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<TransactionHistoryEntity> transactionlist) {
        this.transactionList = transactionlist;
    }

    public List<PostEntity> getPostList() {
        return postList;
    }

    public void setPostList(List<PostEntity> postList) {
        this.postList = postList;
    }


}
