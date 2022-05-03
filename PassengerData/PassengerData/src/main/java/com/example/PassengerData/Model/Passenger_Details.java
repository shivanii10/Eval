package com.example.PassengerData.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Passenger_Details")
public class Passenger_Details {
	
	@Id
	int passenger_id;
	String passwd;
	String first_name;
	String last_name;
	String address;
	String email;
	Long mobileno;
	
	public  Passenger_Details()
	{
		
	}

	public Passenger_Details(int passenger_id, String passwd, String first_name, String last_name, String address,
			String email, int mobileno) {
		super();
		this.passenger_id = passenger_id;
		this.passwd = passwd;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.email = email;
		this.mobileno = (long) mobileno;
	}

	public int getPassenger_id() {
		return passenger_id;
	}

	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobileno() {
		return mobileno;
	}

	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	
	

}
