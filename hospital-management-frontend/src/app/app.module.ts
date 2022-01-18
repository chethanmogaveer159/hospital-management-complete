import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateDoctorComponent } from './create-doctor/create-doctor.component';
import { DoctorDetailsComponent } from './doctor-details/doctor-details.component';
import { DoctorListComponent } from './doctor-list/doctor-list.component';
import { CreatePatientComponent } from './create-patient/create-patient.component';
import { PatientDetailsComponent } from './patient-details/patient-details.component';
import { PatientListComponent } from './patient-list/patient-list.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { UpdateDoctorComponent } from './update-doctor/update-doctor.component';
import { UpdatePatientComponent } from './update-patient/update-patient.component';
import { HomePageComponent } from './home-page/home-page.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateDoctorComponent,
    DoctorDetailsComponent,
    DoctorListComponent,
    CreatePatientComponent,
    PatientDetailsComponent,
    PatientListComponent,
    UpdateDoctorComponent,
    UpdatePatientComponent,
    HomePageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
