package com.TRMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TRMS.Model.Passengers;

@Repository
public interface PassengersRepository extends JpaRepository<Passengers, String> {

}
