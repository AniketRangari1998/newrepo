package com.spring.milestone_4.ControllerClass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.milestone_4.Service.ServiceClass;
import com.spring.milestone_4.entity.Cricketers;

@RestController
public class CricketerController {

	@Autowired
	private ServiceClass s;
	
	@GetMapping("/cricketers")
	public List<Cricketers> getAllCricketers(){
		return s.getAllCricketers();
	}
	
	@GetMapping("/cricketers/{id}")
	public Cricketers getById(@PathVariable int id) {
		return s.getById(id);
	}
	
	@PostMapping("/cricketers")
	public Cricketers addCricketer(@RequestBody Cricketers c) {
		return s.addCricketer(c);	
	}
}
