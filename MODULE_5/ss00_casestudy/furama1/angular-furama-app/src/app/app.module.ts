import {HttpClientModule} from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './layout/header/header.component';
import { FooterComponent } from './layout/footer/footer.component';
import { NavbarComponent } from './layout/navbar/navbar.component';
import { CustomerListComponent } from './component/customer/customer-list/customer-list.component';
import { CustomerCreateComponent } from './component/customer/customer-create/customer-create.component';
import { CustomerEditComponent } from './component/customer/customer-edit/customer-edit.component';
import { FacilityCreateComponent } from './component/facility/facility-create/facility-create.component';
import { FacilityEditComponent } from './component/facility/facility-edit/facility-edit.component';
import { FacilityListComponent } from './component/facility/facility-list/facility-list.component';
import { ContractCreateComponent } from './component/contract/contract-create/contract-create.component';
import { ContractListComponent } from './component/contract/contract-list/contract-list.component';
import { ContractEditComponent } from './component/contract/contract-edit/contract-edit.component';
import { HomeComponent } from './layout/home/home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    NavbarComponent,
    CustomerListComponent,
    CustomerCreateComponent,
    CustomerEditComponent,
    FacilityCreateComponent,
    FacilityEditComponent,
    FacilityListComponent,
    ContractCreateComponent,
    ContractListComponent,
    ContractEditComponent,
    HomeComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
