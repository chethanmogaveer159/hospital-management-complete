package com.hospital.hospitalmanagement.Entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	@Id
	@Column(name="pid")
	private int pid;
	@Column(name="name")
	private String name;
	@Column(name="date")
	private String date;
	@Column(name="age")
	private int age;
	@Column(name="gender")
	private String gender;
	@Column(name="did")
	private int did;

	public Patient() {
		super();
	}

	public Patient(String name, String date, int age, String gender, int did) {
		super();
		this.name = name;
		this.date = date;
		this.age = age;
		this.gender = gender;
		this.did = did;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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

	
	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", name=" + name + ", date=" + date + ", age=" + age + ", gender=" + gender
				+ ", did=" + did + "]";
	}

	

	
	
	
	

}
