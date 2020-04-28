package com.flight.service;

import java.util.List;

import com.flight.entity.Flight;

public interface FlightServiceImpl {

	List<Flight> findFlight(String fromloc, String toloc);

}
