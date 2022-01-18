package com.hospital.hospitalmanagement;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.hospital.hospitalmanagement.Controller.DoctorController;
import com.hospital.hospitalmanagement.Controller.PatientController;
import com.hospital.hospitalmanagement.Entity.Doctor;
import com.hospital.hospitalmanagement.Entity.Patient;
import com.hospital.hospitalmanagement.Repository.DoctorRepository;
import com.hospital.hospitalmanagement.Repository.PatientRepository;
import com.hospital.hospitalmanagement.Service.DoctorService;
import com.hospital.hospitalmanagement.Service.PatientService;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
class HospitalManagementApplicationTests {
	
	@Autowired
	private DoctorController doctorController;
	
	@MockBean
	private DoctorRepository doctorRepository;
	
	@Autowired
	private PatientController patientController;
	
	@MockBean
	private PatientRepository patientRepository;
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private PatientService patientService;
	
	@Test
	@DisplayName("Get Doctors Test")
	public void getDoctorsTest() {
		when(doctorRepository.findAll()).thenReturn(Stream
				.of(new Doctor(102,"Amith",35, "Male", "Neurologist"), new Doctor(103,"Harsha",35, "Male", "Neurologist")).collect(Collectors.toList()));
		assertEquals(2, doctorController.getAllDoctor().size());
	}
	
	@Test
	@DisplayName("Get Patients Test")
	public void getPatientsTest(){
		when(patientRepository.findAll()).thenReturn(Stream
				.of (new Patient("Amar","2022-01-15,35",35, "Male",2)).collect(Collectors.toList()));
		assertEquals(1, patientController.getAllPatient().size());
	}
	
	@Test
	@DisplayName("Add new Doctor Test")
	public void addDoctorTest() {
		Doctor doctor= new Doctor(101,"Shankar",35, "Male", "Neurologist");
		when(doctorRepository.save(doctor)).thenReturn(doctor);
		assertEquals(doctor, doctorService.addDoctor(doctor));
	}
	
	@Test
	@DisplayName("Add new Patient Test")
	public void addPatientTest() {
		Patient patient= new Patient("Amar","2022-01-15,35",35, "Male",2);
		when(patientRepository.save(patient)).thenReturn(patient);
		assertEquals(patient, patientService.addPatient(patient));
	}
	
	@Test
	@DisplayName("Delete Doctor Test")
	public void deleteDoctorTest() {
		Doctor doctor = new Doctor(101,"Shankar",35, "Male", "Neurologist");
		doctorController.deleteDoctor(doctor.getDid());
		Optional optional=doctorRepository.findById(doctor.getDid());
		assertEquals(optional.empty(),optional);
	}
	
	@Test
	@DisplayName("Delete Patient Test")
	public void deletePatientTest() {
		Patient patient= new Patient("Amar","2022-01-15,35",35, "Male",2);
		patientController.deletePatient(patient.getPid());
		Optional optional=patientRepository.findById(patient.getDid());
		assertEquals(optional.empty(),optional);
	}
	
	
	

}
