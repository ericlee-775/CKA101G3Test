package com.tibame.user.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class UserVO implements Serializable{
	
	private Integer userId;
    private String email;
    private Integer districtId;      
    private String userAddress;
    private Integer emailVerified;
    private String password;
    private LocalDateTime userCreatedAt;
    private String userName;
    private String userNickname;
    private String userPhoneNum;
    private String userStatus;
    private Integer monthlySpending;
    private Boolean isFarmer;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getDistrictId() {
		return districtId;
	}
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public Integer getEmailVerified() {
		return emailVerified;
	}
	public void setEmailVerified(Integer emailVerified) {
		this.emailVerified = emailVerified;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getUserCreatedAt() {
		return userCreatedAt;
	}
	public void setUserCreatedAt(LocalDateTime userCreatedAt) {
		this.userCreatedAt = userCreatedAt;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getUserPhoneNum() {
		return userPhoneNum;
	}
	public void setUserPhoneNum(String userPhoneNum) {
		this.userPhoneNum = userPhoneNum;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public Integer getMonthlySpending() {
		return monthlySpending;
	}
	public void setMonthlySpending(Integer monthlySpending) {
		this.monthlySpending = monthlySpending;
	}
	public Boolean getIsFarmer() {
		return isFarmer;
	}
	public void setIsFarmer(Boolean isFarmer) {
		this.isFarmer = isFarmer;
	}
	
    

}
