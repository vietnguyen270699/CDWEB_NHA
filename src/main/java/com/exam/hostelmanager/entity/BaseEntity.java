package com.exam.hostelmanager.entity;

import javax.persistence.Column;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {

	
	@Column
	private String createDate;
	@Column
	private String createBy;
	@Column
	private String modifyDate;
	@Column
	private String modifyBy;
	public BaseEntity(String createDate, String createBy, String modifyDate, String modifyBy) {
		super();
		this.createDate = createDate;
		this.createBy = createBy;
		this.modifyDate = modifyDate;
		this.modifyBy = modifyBy;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	
	

	
}
