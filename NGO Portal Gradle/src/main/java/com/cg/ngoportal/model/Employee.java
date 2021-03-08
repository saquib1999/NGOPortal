package com.cg.ngoportal.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NEmployee")
public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String email;
	private String phone;
	private Address address;
	@Id
	private String username;
	private String password;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int employeeId, String employeeName, String email, String phone, Address address, String username,
			String password) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.username = username;
		this.password = password;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email + ", phone="
				+ phone + ", address=" + address + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
