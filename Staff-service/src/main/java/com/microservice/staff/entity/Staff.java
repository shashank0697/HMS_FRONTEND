package com.microservice.staff.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "StaffDetails")
public class Staff {
	@Id
	private long staffId;
	private String staffName;
	private double staffSalary;
	private String staffEmail;
	
	public Staff(long staffId, String staffName, double staffSalary, String staffEmail) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffSalary = staffSalary;
		this.staffEmail = staffEmail;
	}
	public Staff() {
		
	}
	
	public long getStaffId() {
		return staffId;
	}
	public void setStaffId(long staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public double getStaffSalary() {
		return staffSalary;
	}
	public void setStaffSalary(double staffSalary) {
		this.staffSalary = staffSalary;
	}
	public String getStaffEmail() {
		return staffEmail;
	}
	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}
	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffName=" + staffName + ", staffSalary=" + staffSalary
				+ ", staffEmail=" + staffEmail + "]";
	}
	
	
}
