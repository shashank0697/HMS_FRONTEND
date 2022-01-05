package com.microservice.staff.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservice.staff.entity.Staff;

@Repository
public interface StaffRepository extends MongoRepository<Staff,Long>{

	public List<Staff> findByStaffName(String staffName);
}
