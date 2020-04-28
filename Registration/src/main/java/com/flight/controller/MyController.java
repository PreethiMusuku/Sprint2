package com.flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entity.Register;
import com.flight.service.FlightService;

@RestController
@RequestMapping("/flights")
@CrossOrigin(origins="http://localhost:4200")
public class MyController {
	@Autowired
	private FlightService flightService;
	
	@PostMapping("/RegPage")
	public String register(@RequestBody Register reg){
		flightService.register(reg);
		return "Registered successfully";
	}
}
