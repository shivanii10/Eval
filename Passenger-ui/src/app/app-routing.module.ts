import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { DisplayComponent } from './display/display.component';
import { LoginComponent } from './login/login.component';
import { MenuComponent } from './menu/menu.component';
import { PassengersComponent } from './passengers/passengers.component';
import { RegisterComponent } from './register/register.component';
import { SearchComponent } from './search/search.component';

const routes: Routes = [
  // {path:'/',component:LoginComponent},
  {path:'display',component:DisplayComponent},
  {path:'search',component:SearchComponent},
  {path:'register',component:RegisterComponent},
  {path:"menu",component:MenuComponent},
  {path:"home",component:AppComponent},
  {path:"login",component:LoginComponent},
  {path:"passengers",component:PassengersComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
