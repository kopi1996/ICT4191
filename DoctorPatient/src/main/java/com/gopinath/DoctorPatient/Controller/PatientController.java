package com.gopinath.DoctorPatient.Controller;

import java.util.List;

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
import com.gopinath.DoctorPatient.Repo.PatientRepo;

@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	private PatientRepo repo;
	@GetMapping
	public List<Patient> getAll()
	{
		return repo.findAll();
	}
	@GetMapping("/{id}")
	public Patient get(@PathVariable("id") String id)
	{
		return repo.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody Patient patient)
	{
		repo.save(patient);
	}
	@PutMapping
	public void update(@RequestBody Patient patient)
	{
		repo.save(patient);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id)
	{
		repo.deleteById(id);
	}
}
