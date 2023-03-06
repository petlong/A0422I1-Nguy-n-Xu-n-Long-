import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CustomerCreateComponent} from "src/app/component/customer/customer-create/customer-create.component";
import {CustomerEditComponent} from "src/app/component/customer/customer-edit/customer-edit.component";
import {CustomerListComponent} from "src/app/component/customer/customer-list/customer-list.component";
import {NavbarComponent} from "src/app/layout/navbar/navbar.component";


const routes: Routes = [
  {path: "", component: NavbarComponent},
  {path: "customer", component: CustomerListComponent},
  {path: "customer/edit/:id", component: CustomerEditComponent},
  {path: "customer/create", component: CustomerCreateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
