package com.spring.milestone_4.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.milestone_4.entity.Cricketers;

public interface CricketerRepo extends JpaRepository<Cricketers ,Integer> {
	
}
