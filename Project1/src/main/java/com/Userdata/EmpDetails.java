package com.Userdata;

import java.time.LocalDateTime;
import java.util.Date;

public class EmpDetails {
	private String email;
	private String empName;
	private String pass;
	private String login;
	private String logout;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getLogout() {
		return logout;
	}
	public void setLogout(String logout) {
		this.logout = logout;
	}
	public EmpDetails(String empName, String email, String pass, String login, String logout) {
		super();
		this.email = email;
		this.empName = empName;
		this.pass = pass;
		this.login = login;
		this.logout = logout;
	}
	
	public EmpDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmpDetails [email=" + email + ", empName=" + empName + ", pass=" + pass + ", login=" + login
				+ ", logout=" + logout + "]";
	}
	
	
	//LocalDateTime regDate;
	

}
