package com.exam.hostelmanager.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {
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

	@Column
	String resetPasswordToken;


	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
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

	
	public UserEntity() {
		super();
	}

	public UserEntity(Long id, Date createDate, String createBy, Date modifyDate,
					  String modifyBy, String userName, String password, String email, int phone,
					  String address, double money, List<RoleEntity> roles,
					  List<DepositHistoryEntity> depositHistory,
					  List<TransactionHistoryEntity> transactionHistory,
					  List<FeedbackEntity> feedback, List<PostEntity> post) {
		super(id, createDate, createBy, modifyDate, modifyBy);
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

	public UserEntity(Long id, Date createDate, String createBy, Date modifyDate,
					  String modifyBy, String userName, String password, String email, int phone,
					  String address, double money, List<RoleEntity> roles) {
		super(id, createDate, createBy, modifyDate, modifyBy);
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.money = money;
		this.roles = roles;
	}


	public UserEntity(Long id, Date createDate, String createBy, Date modifyDate,
					  String modifyBy, String userName, String password, String email, int phone,
					  String address, double money) {
		super(id, createDate, createBy, modifyDate, modifyBy);
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.money = money;
	}

	public String getResetPasswordToken() {
		return resetPasswordToken;
	}

	public void setResetPasswordToken(String resetPasswordToken) {
		this.resetPasswordToken = resetPasswordToken;
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
