import { Component, OnInit } from '@angular/core';
import { PserviceService } from '../pservice.service';

@Component({
  selector: 'app-passengers',
  templateUrl: './passengers.component.html',
  styleUrls: ['./passengers.component.css']
})
export class PassengersComponent implements OnInit {

  constructor(private service:PserviceService) { }
  psg: any;
  ngOnInit(): void {
    this.service.allPassengers().subscribe(response=>{this.psg=response;
      console.log(response);})
  }

}
