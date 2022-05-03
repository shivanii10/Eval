package com.example.PassengerData.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PassengerData.Model.Passenger_Details;

public interface PassengerDataDao extends JpaRepository<Passenger_Details,Integer>{

}
