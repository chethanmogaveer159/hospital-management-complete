import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Doctor } from '../doctor';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';
import { DoctorService } from '../doctor.service';

@Component({
  selector: 'app-create-patient',
  templateUrl: './create-patient.component.html',
  styleUrls: ['./create-patient.component.css']
})
export class CreatePatientComponent implements OnInit {
  patient: Patient = new Patient();
  doctors: Doctor[];
  constructor(private patientService: PatientService, private doctorService: DoctorService,
    private router: Router) { }

    ngOnInit(): void {
      this.getDoctors();
    }

  private getDoctors(){
    this.doctorService.getDoctorList().subscribe( data =>{
      this.doctors=data
    });
  }

  savePatient(){
    this.patientService.createPatient(this.patient).subscribe( data=>{
      console.log(data);
      this.goToPatientList();
    },
    error => console.log(error));
  }

  goToPatientList(){
    this.router.navigate(['/patients']);
  }

  onSubmit(){
    console.log(this.patient);
    this.savePatient();
  }

}
