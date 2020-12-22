package com.exam.hostelmanager.entity;

import java.util.Date;

import javax.persistence.CascadeType;
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

    @Column
    String description;
    @Column
    double price;
    @Column
    String address;
    @Column
	String city;
    @Column
    double acreage;
    @Column
    double electricPrice;
    @Column
    double waterPrice;

	@OneToOne(mappedBy = "content",  cascade = CascadeType.ALL, orphanRemoval = true)
    private PostEntity post;
	
	
	
    public ContentEntity() {
		super();
	}

	public ContentEntity(Long id, Date createDate, String createBy, Date modifyDate, String modifyBy) {
		super(id, createDate, createBy, modifyDate, modifyBy);
	}

	public ContentEntity(Long id, Date createDate, String createBy, Date modifyDate, String modifyBy,
			String description, double price, String address, String city, double acreage, double electricPrice,
			double waterPrice, PostEntity post) {
		super(id, createDate, createBy, modifyDate, modifyBy);
		this.description = description;
		this.price = price;
		this.address = address;
		this.city = city;
		this.acreage = acreage;
		this.electricPrice = electricPrice;
		this.waterPrice = waterPrice;
		this.post = post;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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
