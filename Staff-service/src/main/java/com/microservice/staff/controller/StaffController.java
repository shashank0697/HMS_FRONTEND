package com.microservice.staff.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.staff.entity.Staff;
import com.microservice.staff.service.StaffService;

import io.swagger.annotations.ApiOperation;
@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/staff")
public class StaffController {

	@Autowired
	private StaffService staffService;
	
	@PostMapping("/add")
	@ApiOperation(value = "Adding Staff Details")
	public String addStaff(@RequestBody Staff Staff) {
		this.staffService.addStaff(Staff);
		return "Staff added with StaffId "+Staff.getStaffId();
	}
	
	@GetMapping("/get")
	@ApiOperation(value = "Views all Staff Details")
	public List<Staff> getAllStaff(){
		return this.staffService.getAllStaff();
	}
	
	@GetMapping("/get/{sId}")
	@ApiOperation(value = "Views Specific Staff Details using ID")
	public Optional<Staff> getStaffById(@PathVariable long sId){
		return this.staffService.getStaffById(sId);
	}
	
	@PutMapping("/update/{sId}")
	@ApiOperation(value = "Upadtes the Staff Details of given ID")
	public String updateStaff(@RequestBody Staff Staff,@PathVariable long sId) {
		this.staffService.updateStaff(sId, Staff);
		return "Staff updated with StaffId "+sId;
	}
	
	@DeleteMapping("/delete/{sId}")
	@ApiOperation(value = "Deletes the Staff Details of given ID")
	public String deleteStaff(@PathVariable long sId) {
		this.staffService.deleteStaff(sId);
		return "Staff deleted with StaffId"+sId;
	}
	
	@GetMapping("/get/")
	@ApiOperation(value = "Views Specific Staff Details using Name")
	public List<Staff> getStaffByName(@RequestParam(value="staffName") String staffName){
		return this.staffService.getStaffByName(staffName);
	}
}
