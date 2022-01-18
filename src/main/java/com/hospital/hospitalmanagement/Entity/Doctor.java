package com.hospital.hospitalmanagement.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
	@Id
	@Column(name="did")
	private int did;
	@Column(name="name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="gender")
	private String gender;
	@Column(name="specialist")
	private String specialist;
	
	//@OneToMany(cascade= CascadeType.ALL, orphanRemoval=true)
	//@JsonIgnoreProperties("doctor")
	//private List<Patient> patientList=new ArrayList<>();
	
	public Doctor() {
		super();
	}
	

	


	public Doctor(int did, String name, int age, String gender, String specialist) {
		super();
		this.did = did;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specialist = specialist;
	}





	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	
	

	@Override
	public String toString() {
		return "Doctor [did=" + did + ", name=" + name + ", age=" + age + ", gender=" + gender + ", specialist="
				+ specialist + "]";
	}

	
}
