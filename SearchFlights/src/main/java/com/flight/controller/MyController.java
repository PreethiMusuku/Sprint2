package com.flight.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entity.Flight;
import com.flight.exceptions.FlightNotFoundException;
import com.flight.service.FlightService;

@RestController
@RequestMapping("/flights")
@CrossOrigin(origins="http://localhost:4200")
public class MyController {
	@Autowired
	private FlightService flightService;
	
	@GetMapping("/findAllflights")
	public List<Flight> findAllFlights() {
		return flightService.fetchFlights();
	}
	//@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="Flight not found with this details")
	@GetMapping("/SearchFlights/{fromloc}/{toloc}/{date1}")
	public List<Flight> findFlight(@PathVariable String fromloc,@PathVariable String toloc,@PathVariable Date date1) {
		return flightService.findFlight(fromloc,toloc,date1);
	
	}
}