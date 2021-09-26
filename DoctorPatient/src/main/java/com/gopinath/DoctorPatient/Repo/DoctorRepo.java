package com.gopinath.DoctorPatient.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gopinath.DoctorPatient.Model.Doctor;
@Repository
public interface DoctorRepo extends JpaRepository<Doctor, String> {


}
