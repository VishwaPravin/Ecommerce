package com.jsp.ecommerce.entity;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity

public class Merchant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String mname;
	@Column(unique = true,nullable = false)
	private String memail;
	@Column(nullable = false)
	private String mpassword;
	@CreationTimestamp
	private String registered_at;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		mname = mname;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		memail = memail;
	}
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		mpassword = mpassword;
	}
	public String getRegistered_at() {
		return registered_at;
	}
	public void setRegistered_at(String registered_at) {
		this.registered_at = registered_at;
	}
	
	
	

}
