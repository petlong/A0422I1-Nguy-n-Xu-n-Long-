import {ReactiveFormsModule} from "@angular/forms";
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './layout/header/header.component';
import { FooterComponent } from './layout/footer/footer.component';
import { NavbarComponent } from './layout/navbar/navbar.component';
// import { ServiceComponent } from './component/service/service.component';
// import { CustomerComponent } from 'src/app/customer/customer.component';
import { CustomerListComponent } from './component/customer/customer-list/customer-list.component';
import { CustomerCreateComponent } from './component/customer/customer-create/customer-create.component';
import { ServiceListComponent } from './component/service/service-list/service-list.component';
import { ServiceCreateComponent } from './component/service/service-create/service-create.component';
import { ServiceEidtComponent } from './component/service/service-eidt/service-eidt.component';
import { CustomerEditComponent } from './component/customer/customer-edit/customer-edit.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    NavbarComponent,
    CustomerListComponent,
    CustomerCreateComponent,
    ServiceListComponent,
    ServiceCreateComponent,
    ServiceEidtComponent,
    CustomerEditComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
