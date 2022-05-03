package com.example.FlightData.Service;

import java.util.List;
import java.util.Optional;

import com.example.FlightData.Model.Flight_Details;


public interface IFlightDataService {
	
	public List<Flight_Details> getAllflights();
	public String insertflight(Flight_Details fd);
	public String deleteflight(Flight_Details fd);
	public Optional <Flight_Details> searchByFId(int fid);
	public List<Flight_Details> flights(String from_location,String to_location);

}
