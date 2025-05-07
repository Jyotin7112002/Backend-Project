package com.TRMS.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserLogin {

	@Id
	private String emailId;
	private String username;
	private String password;
	private String role;
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserLogin [emailId=" + emailId + ", username=" + username + ", password=" + password + ", role=" + role
				+ "]";
	}
	public UserLogin(String emailId, String username, String password, String role) {
		super();
		this.emailId = emailId;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
