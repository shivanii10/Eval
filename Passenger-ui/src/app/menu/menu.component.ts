import { Component, OnInit } from '@angular/core';
import { PserviceService } from '../pservice.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  constructor(private service: PserviceService) { }
  cmts:any;
  ngOnInit(): void {
    this.service.getAllflights()
    .subscribe( response =>{
      this.cmts=response;
      console.log(response);
    }
    );
    console.log(this.cmts);
  }

}
