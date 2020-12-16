package com.exam.hostelmanager.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fee")
public class FeeEntity extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feeid;
	@Column
	private double price;
	
	@OneToMany(mappedBy = "feeEntity")
	private List<TransactionHistoryEntity> trasactionlist;
	
	@OneToMany(mappedBy = "feeEntity")
	private List<PostEntity> postlist;



	public FeeEntity(String createDate, String createBy, String modifyDate, String modifyBy, int feeid, double price,
			List<TransactionHistoryEntity> trasactionlist, List<PostEntity> postlist) {
		super(createDate, createBy, modifyDate, modifyBy);
		this.feeid = feeid;
		this.price = price;
		this.trasactionlist = trasactionlist;
		this.postlist = postlist;
	}

	public int getFeeid() {
		return feeid;
	}

	public void setFeeid(int feeid) {
		this.feeid = feeid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<TransactionHistoryEntity> getTrasactionlist() {
		return trasactionlist;
	}

	public void setTrasactionlist(List<TransactionHistoryEntity> trasactionlist) {
		this.trasactionlist = trasactionlist;
	}

	public List<PostEntity> getPostlist() {
		return postlist;
	}

	public void setPostlist(List<PostEntity> postlist) {
		this.postlist = postlist;
	}
	

	

	
	
	
	
	
}
