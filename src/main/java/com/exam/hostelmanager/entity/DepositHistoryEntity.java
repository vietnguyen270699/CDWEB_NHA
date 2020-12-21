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
@Table(name = "deposit_history_entity")
public class DepositHistoryEntity extends BaseEntity{

	@Column
    double money;
	@Column
    String time;
	@Column
    String state;
	@Column
    String type;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private UserEntity userEntity;
	
	public DepositHistoryEntity() {
		super();
	}

	public DepositHistoryEntity(Long id, Date createDate, String createBy, Date modifyDate,
								String modifyBy, double money, String time, String state, String type,
								UserEntity userEntity) {
		super(id, createDate, createBy, modifyDate, modifyBy);
		this.money = money;
		this.time = time;
		this.state = state;
		this.type = type;
		this.userEntity = userEntity;
	}

	public DepositHistoryEntity(Long id, Date createDate, String createBy, Date modifyDate, String modifyBy) {
		super(id, createDate, createBy, modifyDate, modifyBy);
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	


}
