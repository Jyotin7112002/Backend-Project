package com.TRMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TRMS.Model.Buses;

@Repository
public interface BusesRepository extends JpaRepository<Buses, Integer>{

}
