package com.hospital.hospitalmanagement.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospitalmanagement.Entity.Patient;
import com.hospital.hospitalmanagement.Repository.PatientRepository;

@Service
public class PatientService {
	@Autowired
	PatientRepository patientRepository;
	public List<Patient> getAllPatient(){
		List<Patient> patients=new ArrayList<>();
		patients= patientRepository.findAll();
		return patients;
	}
	
	public Patient addPatient(Patient patient) {
		patient=patientRepository.save(patient);
		return patient;
	}
	
	public Optional<Patient> getPatient(int pid){
		return patientRepository.findById(pid);
	}
	
	public Patient updatePatient(Patient patient, int pid) {
		if(pid==patient.getPid()) {
			return patientRepository.save(patient);
		}
		return patient;
	}
	public void deletePatient(int pid) {
		patientRepository.deleteById(pid);
	}
}
