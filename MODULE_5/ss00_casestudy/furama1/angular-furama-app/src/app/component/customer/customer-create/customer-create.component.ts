import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators, ReactiveFormsModule} from '@angular/forms';
import {Router} from '@angular/router';
import {CustomerType} from 'src/app/model/customer-type';
import {CustomerTypeService} from 'src/app/service/customer/customer-type.service';
import {CustomerService} from 'src/app/service/customer/customer.service';
import {consoleTestResultHandler} from 'tslint/lib/test';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  constructor(private customerService: CustomerService, private router: Router, private customerTypeService: CustomerTypeService) { }
  customerTypes: CustomerType [] = [];

  customerForm = new FormGroup({
    // id: new FormControl('', [Validators.required, Validators.min(1), Validators.max(2147483647)]),
    id: new FormControl('', [Validators.required, Validators.pattern('(KH)[-][\\d]{4}')]),
    // name: new FormControl('', [Validators.required, Validators.minLength(3), Validators.maxLength(255)]),
    name: new FormControl('', [Validators.required]),
    gender: new FormControl('', [Validators.required]),
    dateOfBirth: new FormControl(),
    idCard: new FormControl('', [Validators.required, Validators.pattern('[\\d]{9}|[\\d]{12}')]),
    // tslint:disable-next-line:max-line-length
    phone: new FormControl('', [Validators.required, Validators.pattern('(090)[\\d]{7}|(091)[\\d]{7}|\(84\)\+90[\d]{7}|\(84\)\+91[\d]{7}')]),
    email: new FormControl('', [Validators.email]),
    address: new FormControl(),
    customerType: new FormControl([Validators.required]),
  });

  ngOnInit(): void {
    this.customerTypes = this.customerTypeService.getAll();
  }

  addCustomerWithReactive() {
    console.log();
    const customer = this.customerForm.value;
    // customer.customerType = {
    //   id: customer.customerType
    // };
    this.customerService.addCustomer(customer).subscribe(next => {
      this.router.navigateByUrl('customer');
    });
  }
}
