package com.microservice.staff.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.microservice.staff.entity.Staff;

@Service
public interface StaffService {
	
	void addStaff(Staff staff);

	List<Staff> getAllStaff();

	Optional<Staff> getStaffById(long staffId);

	void updateStaff(long staffId, Staff staff);

	void deleteStaff(long staffId);
	
	public List<Staff> getStaffByName(String staffName);
}
