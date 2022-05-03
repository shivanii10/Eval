import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  title="Login Page";
  passenger_id = 12345;
  passwd = 'admin';
  show =true;
  status="";
   constructor(private router: Router )
   {

   }
  validate()
  {
    if (this.passenger_id==12345 && this.passwd=="admin")
    {
    console.log("you are authorized");
    this.status="valid credentials";
    this.router.navigateByUrl("menu")
    }
    else
    {
    this.status="Invalid credentials";
    console.log("you are not authorized");
    this.router.navigateByUrl("login")
    }
  }

  ngOnInit(): void {
  }

}

