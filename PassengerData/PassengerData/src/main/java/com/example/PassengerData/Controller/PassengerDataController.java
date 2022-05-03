package com.example.PassengerData.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.PassengerData.Service.PassengerDataService;
import com.example.PassengerData.Model.Flight_DetailsDto;
import com.example.PassengerData.Model.Passenger_Details;


@RestController
@RequestMapping("/PassengerData")
@CrossOrigin("*")
public class PassengerDataController {
	
	@Autowired
	PassengerDataService service;
	
	@GetMapping("/try")
	public String showdata()
	{
		return "hey, it's working";
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Passenger_Details>> showAllPassengers()
	{
		return new ResponseEntity(service.getAllPassengers(),HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public String AddPassenger(@RequestBody Passenger_Details pd)
	{
		return service.addPassenger(pd);
	}
	
	@DeleteMapping("/delete")
	public String RemovePassenger(@RequestBody Passenger_Details pd)
	{
		return service.deletePassenger(pd);
	}
	
	@GetMapping("/search/pid/{passenger_id}")
	public Optional <Passenger_Details> searchByPId (@PathVariable("passenger_id") Integer passenger_id)
	{
		return service.searchByPId(passenger_id);
	}
	
	@DeleteMapping("/delete/pid/{passenger_id}")
	public String DeleteById(@PathVariable("passenger_id") Integer passenger_id)
	{
		return service.deletePassengerByPid(passenger_id);
	}
	
	@GetMapping("/location/{from_location}/{to_location}")
	public List<Flight_DetailsDto> searchByLocation(@PathVariable("from_location") String from_location,@PathVariable("to_location") String to_location)
	{
		return service.getFlightsByLocation(from_location,to_location);
	}
	
	@GetMapping("/flights")
	public ResponseEntity<List<Flight_DetailsDto>> Flights()
	{
		return new ResponseEntity(service.allflights(),HttpStatus.OK);
	}

}
