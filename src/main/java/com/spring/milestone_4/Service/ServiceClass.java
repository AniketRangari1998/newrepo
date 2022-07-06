package com.spring.milestone_4.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.milestone_4.entity.Cricketers;
import com.spring.milestone_4.repo.CricketerRepo;

@Service
public class ServiceClass {
	
	@Autowired
	private CricketerRepo repository;
	
	
	public Cricketers addCricketer(Cricketers c) {
		return repository.save(c);
	}
	
	public List<Cricketers> getAllCricketers(){
		return repository.findAll();
	}
	
	public Cricketers getById(int id) {
		return repository.findById(id).orElse(null);
	}
	
}


