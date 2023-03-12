import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators, ReactiveFormsModule} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';
import {Customer} from 'src/app/model/customer';
import {CustomerService} from 'src/app/service/customer/customer.service';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {
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
  id: string;

  customerForm: FormGroup;

  constructor(private customerService: CustomerService, private router: Router, private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe(next => {
      const id = next.get('id');
      if (id != null) {
        this.customer = this.customerService.findById(id);
        this.customerForm = new FormGroup({
          id: new FormControl(this.customer.id),
          name: new FormControl(this.customer.name, [Validators.required]),
          gender: new FormControl(this.customer.gender, [Validators.required]),
          dateOfBirth: new FormControl(this.customer.dateOfBirth),
          idCard: new FormControl(this.customer.idCard, [Validators.required, Validators.pattern('[\\d]{9}|[\\d]{12}')]),
          phone: new FormControl(this.customer.phone, [Validators.required, Validators.pattern('(090)[\\d]{7}|(091)[\\d]{7}|\(84\)\+90[\d]{7}|\(84\)\+91[\d]{7}')]),
          email: new FormControl(this.customer.email, [Validators.email]),
          address: new FormControl(this.customer.address),
          typeCustomer: new FormControl(this.customer.typeCustomer, [Validators.required]),
        });
      }
    }, error => {

    }, () => {
    });
  }

  ngOnInit(): void {
  }

  editCustomerWithReactive(id: string) {
    this.customerService.editCustomer(id, this.customerForm.value);
    this.router.navigateByUrl('customer');
    alert('Update complete');
  }
}
