package com.example.FlightData.Contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlightData.Model.Flight_Details;
import com.example.FlightData.Service.IFlightDataService;

@RestController
@RequestMapping("/FlightData")

public class FlightDataController {
	
	@Autowired
	IFlightDataService service;
	
	@GetMapping("/try")
	public String showdata()
	{
		return "hey, it's working";
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Flight_Details>> showAllFlights()
	{
		return new ResponseEntity(service.getAllflights(),HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public String Insertflight(@RequestBody Flight_Details fd)
	{
		
		return service.insertflight(fd);
	}
	
	@DeleteMapping("/delete")
	public String Deleteflight(@RequestBody Flight_Details fd)
	{
		return service.deleteflight(fd);
	}
	
	@GetMapping("/search/fid/{fid}")
	public Optional <Flight_Details> searchByFId (@PathVariable("fid") Integer fid)
	{
		return service.searchByFId(fid);
	}
	
	@GetMapping("search/location/{from_location}/{to_location}")
	public List<Flight_Details> searchByLocation(@PathVariable("from_location") String from_location,@PathVariable("to_location") String to_location)
	{
		return service.flights(from_location,to_location);
	}
	

}
