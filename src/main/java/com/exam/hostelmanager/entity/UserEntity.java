package com.exam.hostelmanager.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int userid;
	@Column
	String userName;
	@Column
	String password;
	@Column
	String email;
	@Column
	int phone;
	@Column
	String address;
	@Column
	double money;
	
	@ManyToMany
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<RoleEntity> roles = new ArrayList<>();

	@OneToMany(mappedBy = "userEntity")
	private List<DepositHistoryEntity> depositHistory;

	@OneToMany(mappedBy = "userEntity")
	private List<TransactionHistoryEntity> transactionHistory;
	
	@OneToMany(mappedBy = "userEntity")
	private List<FeedbackEntity> feedback;
	
	@OneToMany(mappedBy = "userEntity")
	private List<PostEntity> post ;

	

	public UserEntity(String createDate, String createBy, String modifyDate, String modifyBy, int userid,
			String userName, String password, String email, int phone, String address, double money,
			List<RoleEntity> roles, List<DepositHistoryEntity> depositHistory,
			List<TransactionHistoryEntity> transactionHistory, List<FeedbackEntity> feedback, List<PostEntity> post) {
		super(createDate, createBy, modifyDate, modifyBy);
		this.userid = userid;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.money = money;
		this.roles = roles;
		this.depositHistory = depositHistory;
		this.transactionHistory = transactionHistory;
		this.feedback = feedback;
		this.post = post;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public List<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}

	public List<DepositHistoryEntity> getDepositHistory() {
		return depositHistory;
	}

	public void setDepositHistory(List<DepositHistoryEntity> depositHistory) {
		this.depositHistory = depositHistory;
	}

	public List<TransactionHistoryEntity> getTransactionHistory() {
		return transactionHistory;
	}

	public void setTransactionHistory(List<TransactionHistoryEntity> transactionHistory) {
		this.transactionHistory = transactionHistory;
	}

	public List<FeedbackEntity> getFeedback() {
		return feedback;
	}

	public void setFeedback(List<FeedbackEntity> feedback) {
		this.feedback = feedback;
	}

	public List<PostEntity> getPost() {
		return post;
	}

	public void setPost(List<PostEntity> post) {
		this.post = post;
	}
	
	
}
