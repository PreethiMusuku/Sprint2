package com.flight;

import static org.junit.Assert.assertSame;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flight.entity.Flight;
import com.flight.service.FlightService;

@SpringBootTest
public class SearchFlightsApplicationTests {
	
@Autowired
	private FlightService flightService;
	

  @Test(expected=NullPointerException.class)
  
  public void searchtestsuccess() throws Exception {
Date date=new Date(2020-05-07);
List<Flight> data=flightService.findFlight("Hyderabad","Pune",date);
List<Flight> result=new ArrayList<Flight>();
result.add(new Flight(14,"Spicejet","Hyderabad","Pune",100,1700,date));
result.add(new Flight(15,"Indigo","Hyderabad","Pune",200,2000,date));
System.out.println("data"+result);
assertSame(data,result);
	}
}
