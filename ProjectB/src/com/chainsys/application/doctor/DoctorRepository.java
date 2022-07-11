package com.chainsys.application.doctor;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor,Integer>{
	Doctor findById(int id);
	Doctor save(Doctor dr);
	// Used for both adding new Doctor and Modifying new Doctor
	void deleteById(int id);
	List <Doctor> findAll();
}
