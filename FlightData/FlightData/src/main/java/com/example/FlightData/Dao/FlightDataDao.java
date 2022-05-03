package com.example.FlightData.Dao;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.FlightData.Model.Flight_Details;


@Repository
@Transactional
public interface FlightDataDao extends JpaRepository<Flight_Details,Integer> {

	@Query("select f from Flight_Details f where f.from_location=?1 and f.to_location=?2")
	 public List<Flight_Details> flight(String from_location, String to_location);

}
