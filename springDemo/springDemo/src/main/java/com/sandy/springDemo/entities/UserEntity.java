package com.sandy.springDemo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
public class UserEntity {
	
	@Id
	@SequenceGenerator(name = "mySeqGen", sequenceName = "user_sequence", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mySeqGen")
	private Integer userId;
	
	@Column
	private String userName;
	
	@Column
	private String address;

	@Column
	private String emailId;

	public UserEntity() {
		
	}

	public UserEntity(String userName, String address, String emailId) {
		this.userName = userName;
		this.address = address;
		this.emailId = emailId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", userName=" + userName + ", address=" + address + ", emailId="
				+ emailId + "]";
	}
	
	
	

}
