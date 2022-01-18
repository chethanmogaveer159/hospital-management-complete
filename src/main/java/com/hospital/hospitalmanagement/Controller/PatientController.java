package com.hospital.hospitalmanagement.Controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospitalmanagement.Entity.Patient;
import com.hospital.hospitalmanagement.Service.PatientService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class PatientController {

	@Autowired
	PatientService patientService;
	
	@GetMapping(value= "/patients")
	public List<Patient> getAllPatient(){
		return patientService.getAllPatient();
	}
	
	@GetMapping(value= "/patients/{pid}")
	public Optional<Patient> getPatient(@PathVariable int pid){
		return patientService.getPatient(pid);
	}
	
	@PostMapping("/patients")
	public void addPatients(@RequestBody Patient patient) {
		patientService.addPatient(patient);
	}
	
	@PutMapping("/patients/{pid}")
	public Patient updatePatients(@RequestBody Patient patient, @PathVariable int pid) {
		return patientService.updatePatient(patient, pid);
	}
	
	@DeleteMapping("/patients/{pid}")
	public void deletePatient(@PathVariable int pid) {
		patientService.deletePatient(pid);
	}
	
	
}