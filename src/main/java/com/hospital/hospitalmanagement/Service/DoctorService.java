package com.hospital.hospitalmanagement.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospitalmanagement.Entity.Doctor;
import com.hospital.hospitalmanagement.Repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	DoctorRepository doctorRepository;

	public List<Doctor> getAllDoctor(){
		List<Doctor> doctors=new ArrayList<>();
		doctors= doctorRepository.findAll();
		return doctors;
	}
	
	public Doctor addDoctor(Doctor doctor) {
		doctor=doctorRepository.save(doctor);
		return doctor;
	}
	
	public Optional<Doctor> getDoctor(int did){
		return doctorRepository.findById(did);
	}
	
	public Doctor updateDoctor(Doctor doctor, int did) {
		if(did==doctor.getDid()) {
			return doctorRepository.save(doctor);
		}
		return doctor;
	}
	public void deleteDoctor(int did) {
		doctorRepository.deleteById(did);
	}
}
