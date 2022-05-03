package com.example.PassengerData.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.PassengerData.Dao.PassengerDataDao;
import com.example.PassengerData.Model.Flight_DetailsDto;
import com.example.PassengerData.Model.Passenger_Details;

@Service
public class PassengerDataServiceImpl implements PassengerDataService {
	
	@Autowired
	PassengerDataDao dao;
	
	@Autowired
	RestTemplate template;
	

	@Override
	public List<Passenger_Details> getAllPassengers() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public String addPassenger(Passenger_Details pd) {
		// TODO Auto-generated method stub
		dao.save(pd);
		return "Passenger Added to database";
	}

	@Override
	public String deletePassenger(Passenger_Details pd) {
		// TODO Auto-generated method stub
		dao.delete(pd);
		return "passenger removed from database";
	}

	@Override
	public Optional<Passenger_Details> searchByPId(int passenger_id) {
		// TODO Auto-generated method stub
		return dao.findById(passenger_id);
	}

	@Override
	public String deletePassengerByPid(int pid) {
		// TODO Auto-generated method stub
		dao.deleteById(pid);
		return "passenger removed from database";
	}

	@Override
	public List<Flight_DetailsDto> getFlightsByLocation(String from_location, String to_location) {
		// TODO Auto-generated method stub
		return template.getForObject("http://localhost:8083/FlightData/search/location/"+from_location+"/"+to_location,List.class);
	}

	@Override
	public List<Flight_DetailsDto> allflights() {
		// TODO Auto-generated method stub
		return template.getForObject("http://localhost:8083/FlightData/all",List.class);
	}

}
