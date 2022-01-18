package com.hospital.hospitalmanagement.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.hospitalmanagement.Entity.Doctor;
@Repository

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

}
