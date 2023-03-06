import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {CustomerService} from "src/app/service/customer/customer.service";

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {

  constructor(private customerService: CustomerService, private router: Router) { }

  customerForm = new FormGroup({
    // id: new FormControl('', [Validators.required, Validators.min(1), Validators.max(2147483647)]),
    id: new FormControl('', [Validators.required, Validators.pattern('(KH)[-][\\d]{4}')]),
    // name: new FormControl('', [Validators.required, Validators.minLength(3), Validators.maxLength(255)]),
    name: new FormControl('', [Validators.required]),
    gender: new FormControl('', [Validators.required]),
    dateOfBirth: new FormControl(),
    idCard: new FormControl('', [Validators.required, Validators.pattern('[\\d]{9}|[\\d]{12}')]),
    phone: new FormControl('', [Validators.required, Validators.pattern('(090)[\\d]{7}|(091)[\\d]{7}|\(84\)\+90[\d]{7}|\(84\)\+91[\d]{7}')]),
    email: new FormControl('', [Validators.email]),
    address: new FormControl(),
    typeCustomer: new FormControl([Validators.required]),
  })

  ngOnInit(): void {
  }

  addCustomerWithReactive() {
    this.customerService.addCustomer(this.customerForm.value);
    this.router.navigateByUrl("customer")
  }
}
