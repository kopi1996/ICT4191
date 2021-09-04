package com.gopi.AirportDatabase.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gopi.AirportDatabase.Model.Aeroplane;

public interface AeroplaneRepo extends JpaRepository<Aeroplane, Integer> {

}
