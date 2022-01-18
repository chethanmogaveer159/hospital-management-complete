package com.hospital.hospitalmanagement.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospitalmanagement.Entity.Doctor;
import com.hospital.hospitalmanagement.Service.DoctorService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@EnableAutoConfiguration
public class DoctorController {
	@Autowired
	DoctorService doctorService;
	@GetMapping(value= "/doctors")
	public List<Doctor> getAllDoctor(){
		return doctorService.getAllDoctor();
	}
	
	@GetMapping(value= "/doctors/{did}")
	public Optional<Doctor> getDoctor(@PathVariable int did){
		return doctorService.getDoctor(did);
	}
	
	@PostMapping("/doctors")
	public void addDoctors(@RequestBody Doctor doctor) {
		doctorService.addDoctor(doctor);
	}
	
	@PutMapping("/doctors/{did}")
	public Doctor updateDoctors(@RequestBody Doctor doctor, @PathVariable int did) {
		return doctorService.updateDoctor(doctor, did);
	}
	
	@DeleteMapping("/doctors/{did}")
	public void deleteDoctor(@PathVariable int did) {
		doctorService.deleteDoctor(did);
	}
	
	
}
