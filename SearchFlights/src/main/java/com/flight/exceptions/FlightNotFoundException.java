package com.flight.exceptions;

@SuppressWarnings("serial")
public class FlightNotFoundException extends RuntimeException {
	public FlightNotFoundException(String fromLoc, String toLoc) {
	        super("flight not found");
	    }
}