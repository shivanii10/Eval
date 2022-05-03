import { Component, OnInit } from '@angular/core';
import { PserviceService } from '../pservice.service';

@Component({
  selector: 'app-display',
  templateUrl: './display.component.html',
  styleUrls: ['./display.component.css']
})
export class DisplayComponent implements OnInit {

  constructor(private service:PserviceService) { }
  ps: any;
  ngOnInit(): void {
    this.service.getAllflights().subscribe(response=>{this.ps=response;
      console.log(response);})
  }

}
