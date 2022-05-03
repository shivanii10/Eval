package com.example.PassengerData.Service;

import java.util.List;
import java.util.Optional;
import com.example.PassengerData.Model.Flight_DetailsDto;
import com.example.PassengerData.Model.Passenger_Details;


public interface PassengerDataService {
	
	public List<Passenger_Details> getAllPassengers();
	public String addPassenger(Passenger_Details pd);
	public String deletePassenger(Passenger_Details pd);
	public Optional <Passenger_Details> searchByPId(int passenger_id);
	public String deletePassengerByPid(int pid);
	public List<Flight_DetailsDto> getFlightsByLocation(String from_location,String to_location);
	public List<Flight_DetailsDto> allflights();
}
