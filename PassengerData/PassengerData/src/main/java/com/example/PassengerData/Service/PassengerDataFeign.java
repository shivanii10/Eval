package com.example.PassengerData.Service;

import com.example.PassengerData.Model.Flight_DetailsDto;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="Flight-Details")
public interface PassengerDataFeign {
	
	@GetMapping("FlightData/search/location/{from_location}/{to_location}")
	public List<Flight_DetailsDto> searchByLocation(@PathVariable("from_location") String from_location,@PathVariable("to_location") String to_location);
}
