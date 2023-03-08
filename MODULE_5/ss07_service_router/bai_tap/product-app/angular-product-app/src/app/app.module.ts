import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductListComponent } from './component/product/product-list/product-list.component';
import { ProductCreateComponent } from './component/product/product-create/product-create.component';
import { ProdcutDeleteComponent } from './component/product/prodcut-delete/prodcut-delete.component';
import { ProductEditComponent } from './component/product/product-edit/product-edit.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,
    ProductCreateComponent,
    ProdcutDeleteComponent,
    ProductEditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
