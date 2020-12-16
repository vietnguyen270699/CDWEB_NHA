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

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int depositid;
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

	
	
	

	public DepositHistoryEntity(String createDate, String createBy, String modifyDate, String modifyBy, int depositid,
			double money, String time, String state, String type, UserEntity userEntity) {
		super(createDate, createBy, modifyDate, modifyBy);
		this.depositid = depositid;
		this.money = money;
		this.time = time;
		this.state = state;
		this.type = type;
		this.userEntity = userEntity;
	}

	public int getDepositid() {
		return depositid;
	}

	public void setDepositid(int depositid) {
		this.depositid = depositid;
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
