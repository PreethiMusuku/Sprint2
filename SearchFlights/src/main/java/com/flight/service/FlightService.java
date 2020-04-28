package com.flight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.dao.FlightDao;
import com.flight.entity.Flight;

@Service
public class FlightService implements FlightServiceImpl{

	@Autowired
	private FlightDao flightDao;

	@Override
	public List<Flight> findFlight(String fromloc,String toloc) {
		// TODO Auto-generated method stub
		return flightDao.findFlight(fromloc,toloc);
	}

	public List<Flight> fetchFlights() {
		// TODO Auto-generated method stub
		return flightDao.findAll();
	}
}
	
	