package com.exam.hostelmanager.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "content")
public class ContentEntity extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idcontent;
	@Column
	String description;
	@Column
	double price;
	@Column
	String address;
	@Column
	double acreage;
	@Column
	double electricPrice;
	@Column
	double waterPrice;
	
	@OneToOne(mappedBy = "content")
    private PostEntity post;

	
	


	public ContentEntity(String createDate, String createBy, String modifyDate, String modifyBy, int idcontent,
			String description, double price, String address, double acreage, double electricPrice, double waterPrice,
			PostEntity post) {
		super(createDate, createBy, modifyDate, modifyBy);
		this.idcontent = idcontent;
		this.description = description;
		this.price = price;
		this.address = address;
		this.acreage = acreage;
		this.electricPrice = electricPrice;
		this.waterPrice = waterPrice;
		this.post = post;
	}


	public int getIdcontent() {
		return idcontent;
	}


	public void setIdcontent(int idcontent) {
		this.idcontent = idcontent;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public double getAcreage() {
		return acreage;
	}


	public void setAcreage(double acreage) {
		this.acreage = acreage;
	}


	public double getElectricPrice() {
		return electricPrice;
	}


	public void setElectricPrice(double electricPrice) {
		this.electricPrice = electricPrice;
	}


	public double getWaterPrice() {
		return waterPrice;
	}


	public void setWaterPrice(double waterPrice) {
		this.waterPrice = waterPrice;
	}


	public PostEntity getPost() {
		return post;
	}


	public void setPost(PostEntity post) {
		this.post = post;
	}

	
	
}
