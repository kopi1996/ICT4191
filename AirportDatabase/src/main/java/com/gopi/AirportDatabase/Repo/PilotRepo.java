package com.gopi.AirportDatabase.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gopi.AirportDatabase.Model.Pilot;

public interface PilotRepo extends JpaRepository<Pilot, Integer>{

}
