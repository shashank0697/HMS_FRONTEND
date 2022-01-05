package com.microservice.staff.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservice.staff.entity.Staff;
import com.microservice.staff.repository.StaffRepository;

public class StaffServiceImpl implements StaffService {

	@Autowired
	private StaffRepository staffRepository;
	
	@Override
	public void addStaff(Staff staff) {
		staffRepository.save(staff);
	}

	@Override
	public List<Staff> getAllStaff() {
		return staffRepository.findAll();
	}

	@Override
	public Optional<Staff> getStaffById(long staffId) {
		return staffRepository.findById(staffId);
	}

	@Override
	public void updateStaff(long staffId, Staff staff) {
		staffRepository.save(staff);
	}

	@Override
	public void deleteStaff(long staffId) {
		staffRepository.deleteById(staffId);
	}

	@Override
	public List<Staff> getStaffByName(String staffName) {
		return staffRepository.findByStaffName(staffName);
	}
	
}
