package com.yuzf.pojo;

public class User {
	private String userName;
	private String account;
	private Integer age;
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", Account=" + account + ", age=" + age + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
