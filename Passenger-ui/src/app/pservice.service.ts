import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PserviceService {

  constructor(private httpClient : HttpClient) { }

  getAllflights()
  {
    return this.httpClient.get("http://localhost:8084/PassengerData/flights");
  }

  getbylocation(from_location: string, to_location: string)
  {
   return this.httpClient.get("http://localhost:8084/PassengerData/location/"+from_location+"/"+to_location)
  }

  allPassengers()
  {
    return this.httpClient.get("http://localhost:8084/PassengerData/all")
  }

}
