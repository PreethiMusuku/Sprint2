package com.flight.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flight.entity.Flight;

@Repository
public interface FlightDao extends JpaRepository<Flight, Integer> {

	@Query("select e.flightNumber,e.flightName,e.fromloc,e.toloc,e.seatCapacity,e.costPerSeat from Flight e where e.fromloc=?1 and e.toloc=?2")

	List<Flight> findFlight(String fromloc, String toloc);


}