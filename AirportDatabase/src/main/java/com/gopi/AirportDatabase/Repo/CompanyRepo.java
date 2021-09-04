package com.gopi.AirportDatabase.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gopi.AirportDatabase.Model.Company;

public interface CompanyRepo extends JpaRepository<Company, Integer> {

}
