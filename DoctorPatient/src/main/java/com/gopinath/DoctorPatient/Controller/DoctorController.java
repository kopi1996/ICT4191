package com.gopinath.DoctorPatient.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gopinath.DoctorPatient.Model.Doctor;
import com.gopinath.DoctorPatient.Model.Patient;
import com.gopinath.DoctorPatient.Repo.DoctorRepo;
import com.gopinath.DoctorPatient.Repo.PatientRepo;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
@Autowired
private DoctorRepo repo;
@Autowired
private PatientRepo patientrepo;
@GetMapping
public List<Doctor> getAll()
{
	return repo.findAll();
}
@GetMapping("/{id}")
public Doctor get(@PathVariable("id") String id)
{
	return repo.findById(id).get();
}
@PostMapping
public void add(@RequestBody Doctor doctor)
{
	repo.save(doctor);
}
@PutMapping
public void update(@RequestBody Doctor doctor)
{
	repo.save(doctor);
}

@DeleteMapping("/{id}")
public void delete(@PathVariable("id") String id)
{
	repo.deleteById(id);
}
@PostMapping("/{id}/addpatient")
public void addpatient(@PathVariable("id") String docid,@RequestBody Map<String,String> patientmap)
{
	Doctor doctor=repo.findById(docid).get();
	Patient patient=patientrepo.findById(patientmap.get("patientid")).get();
	doctor.getPatients().add(patient);
	repo.save(doctor);
	
}
}
