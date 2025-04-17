package com.jsp.ecommerce.dto;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class MerchantDto {
	
	@Size(min = 5, max = 15, message = "* Name should be 5~15 charecters")
	private String mname;
	@NotEmpty(message = "* Email is Required")
	@Email(message = "* Check Email format")
	private String memail;
	@Pattern(regexp = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$", message = "* Password should contain atleast 8 charecter, one uppercase, one lowercase, one number and one special charecter")
	private String mpassword;
	@Pattern(regexp = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$", message = "* Password should contain atleast 8 charecter, one uppercase, one lowercase, one number and one special charecter")
	private String confirmPassword;
	@AssertTrue(message = "* Check terms and Condition in order to proceed")
	private boolean terms;
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfrmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public boolean isTerms() {
		return terms;
	}
	public void setTerms(boolean terms) {
		this.terms = terms;
	}
	

	
	
	
}
