import {Component, OnInit} from '@angular/core';
import {Customer} from 'src/app/model/customer';
import {CustomerType} from 'src/app/model/customer-type';
import {CustomerTypeService} from 'src/app/service/customer/customer-type.service';
import {CustomerService} from 'src/app/service/customer/customer.service';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customers: Customer[] = [];
  customerTypes: CustomerType[] = [];
  customer: Customer = {
    id: '',
    name: '',
    gender: '',
    dateOfBirth: '',
    idCard: '',
    phone: '',
    email: '',
    address: ''
  };

  constructor(private customerService: CustomerService, private customerTypeService: CustomerTypeService) {

  }

  getAllCustomer() {
    this.customerService.getAll().subscribe(next => {
      this.customerTypes = this.customerTypeService.getAll();
      console.log(next);
      // @ts-ignore
      this.customers = next;
    }, error => {

    }, () => {

    });
  }

  ngOnInit(): void {
    this.getAllCustomer();
  }

  removeCustomer(id: string) {
     // this.customers.splice(this.customers.findIndex(element => element.id === id), 1);
    this.customerService.deleteCustomer(id).subscribe(next => {
      this.getAllCustomer();
    });
  }
}
