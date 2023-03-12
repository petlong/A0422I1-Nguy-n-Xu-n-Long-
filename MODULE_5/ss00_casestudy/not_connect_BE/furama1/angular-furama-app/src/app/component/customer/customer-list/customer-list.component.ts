import {Component, OnInit} from '@angular/core';
import {Customer} from 'src/app/model/customer';
import {CustomerService} from 'src/app/service/customer/customer.service';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customers: Customer[];
  customer: Customer = {
    id: '',
    name: '',
    gender: '',
    dateOfBirth: '',
    idCard: '',
    phone: '',
    email: '',
    address: '',
    typeCustomer: ''
  };

  constructor(customerService: CustomerService) {
    this.customers = customerService.getAll();
  }

  ngOnInit(): void {
  }

  remove(id: string) {
     this.customers.splice(this.customers.findIndex(element => element.id === id), 1);
  }
}
