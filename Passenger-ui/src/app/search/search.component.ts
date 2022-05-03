import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { PserviceService } from '../pservice.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  constructor(private service:PserviceService) { }
  ps: any;
  to_location="";
  from_location="";

  ngOnInit(): void {

  }
  formdata: FormGroup = new FormGroup({       
    from_location : new FormControl("", Validators.required),
    to_location : new FormControl("", Validators.required)
   });

   searchComments(){
    this.service.getbylocation(this.from_location,this.to_location).subscribe(response=>{this.ps=response;
      console.log(response);})
   }
   

}
