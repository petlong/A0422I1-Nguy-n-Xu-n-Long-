import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CustomerCreateComponent} from 'src/app/component/customer/customer-create/customer-create.component';
import {CustomerEditComponent} from 'src/app/component/customer/customer-edit/customer-edit.component';
import {CustomerListComponent} from 'src/app/component/customer/customer-list/customer-list.component';
import {FacilityCreateComponent} from 'src/app/component/facility/facility-create/facility-create.component';
import {FacilityEditComponent} from 'src/app/component/facility/facility-edit/facility-edit.component';
import {FacilityListComponent} from 'src/app/component/facility/facility-list/facility-list.component';
import {HomeComponent} from 'src/app/layout/home/home/home.component';
import {NavbarComponent} from 'src/app/layout/navbar/navbar.component';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'customer', component: CustomerListComponent},
  {path: 'customer/edit/:id', component: CustomerEditComponent},
  {path: 'customer/create', component: CustomerCreateComponent},
  {path: 'facility', component: FacilityListComponent},
  {path: 'facility/edit/:id', component: FacilityEditComponent},
  {path: 'facility/create', component: FacilityCreateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
