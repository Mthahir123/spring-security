package com.example.demo.payload.request;

import java.util.Set;

public class SignupRequest {

	private String userName;
	private String email;
	private Set<String> role;
	private String password;
	
	public SignupRequest() {
		super();
	}

	public SignupRequest(String userName, String email, Set<String> role, String password) {
		super();
		this.userName = userName;
		this.email = email;
		this.role = role;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<String> getRole() {
		return role;
	}

	public void setRole(Set<String> role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "SignupRequest [userName=" + userName + ", email=" + email + ", role=" + role + ", password=" + password
				+ "]";
	}
	
}
