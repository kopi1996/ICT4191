package com.gopinath.DoctorPatient.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gopinath.DoctorPatient.Model.Patient;
@Repository
public interface PatientRepo extends JpaRepository<Patient,String> {

}
