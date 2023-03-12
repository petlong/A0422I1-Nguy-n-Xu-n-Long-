import {Injectable} from '@angular/core';
import {Customer} from "src/app/model/customer";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private customers: Customer [] = [];

  constructor() {
    this.customers.push({
      id: "KH0001",
      name: "Long",
      gender: "male",
      dateOfBirth: "1998/01/01",
      idCard: "201560135",
      phone: "0935117090",
      email: "long@gmail.com",
      address: "Da Nang 1",
      typeCustomer: "vip"
    });
    this.customers.push({
      id: "KH0002",
      name: "Chuong",
      gender: "male",
      dateOfBirth: "1988/01/01",
      idCard: "201560135",
      phone: "0935117090",
      email: "chuong@gmail.com",
      address: "Da Nang 2",
      typeCustomer: "vip"
    });
    this.customers.push({
      id: "KH0003",
      name: "HuyCho",
      gender: "male",
      dateOfBirth: "1978/01/01",
      idCard: "201560135",
      phone: "0935117090",
      email: "huy@gmail.com",
      address: "Da Nang3",
      typeCustomer: "vip"
    });
  }

  getAll() {
    return this.customers;
  }

  addCustomer(event: any) {
      this.customers.push(event)
  }

  findById(id: string): Customer {
    return this.customers.filter(element=>element.id===id)[0];
  }

  editCustomer(id: string, customer: Customer) {
    for (let i = 0; i < this.customers.length; i++) {
      if (this.customers[i].id === id) {
        this.customers[i] = customer;
      }
    }
  }
}
