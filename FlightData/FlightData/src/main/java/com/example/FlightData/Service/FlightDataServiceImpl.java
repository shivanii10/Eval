package com.example.FlightData.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FlightData.Dao.FlightDataDao;
import com.example.FlightData.Model.Flight_Details;

@Service
public class FlightDataServiceImpl implements IFlightDataService {
	
	@Autowired
	FlightDataDao dao;
	

	@Override
	public List<Flight_Details> getAllflights() {
		// TODO Auto-generated method stub
		return dao.findAll() ;
	}

	@Override
	public String insertflight(Flight_Details fd) {
		// TODO Auto-generated method stub
		dao.save(fd);
		return "Flight Data Inserted";
	}

	@Override
	public String deleteflight(Flight_Details fd) {
		// TODO Auto-generated method stub
		dao.delete(fd);
		return "Flight Details deleted";
	}

	@Override
	public Optional<Flight_Details> searchByFId(int fid) {
		// TODO Auto-generated method stub
		return dao.findById(fid);
	}

	@Override
	public List<Flight_Details> flights(String from_location,String to_location) {
		// TODO Auto-generated method stub
		return dao.flight(from_location,to_location);
	}

}
