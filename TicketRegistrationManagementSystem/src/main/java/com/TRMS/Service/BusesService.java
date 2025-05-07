package com.TRMS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TRMS.Model.Buses;
import com.TRMS.Repository.BusesRepository;

@Service
public class BusesService {

	@Autowired
	private BusesRepository repo;
	
	public Buses add(Buses bus) {
		Buses b= repo.save(bus);
		return b;
	}
	
	public List<Buses> allData(){
		List<Buses>list=repo.findAll();
		return list;
	}
}
