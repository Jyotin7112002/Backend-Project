package com.TRMS.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TRMS.Model.Passengers;
import com.TRMS.Repository.PassengersRepository;

@Service
public class PassengersService {

    @Autowired
    private PassengersRepository repo; // Corrected repository injection

    public void addPass(Passengers p1) {
        repo.save(p1); // Fixed method call to save entity
    }
    
    public Passengers getSingleData(String email) {
    	Passengers p= repo.getById(email);
    	return p;
    }
    
    public Passengers getSingle(String email) {
    	return repo.findById(email).orElse(null);
    }
    
    public void delete(String email) {
    	repo.deleteById(email);
    }
    
    public Passengers update(Passengers p1) {
    	Passengers pass = repo.save(p1);
    	return pass;
    }
}

