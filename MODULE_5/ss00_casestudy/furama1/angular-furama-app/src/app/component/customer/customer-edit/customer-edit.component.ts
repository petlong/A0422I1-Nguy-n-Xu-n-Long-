import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {ActivatedRoute, Router} from "@angular/router";
import {Customer} from "src/app/model/customer";
import {CustomerService} from "src/app/service/customer/customer.service";

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {
  customer: Customer = {
    id: "",
    name: "",
    gender: "",
    dateOfBirth: "",
    idCard: "",
    phone: "",
    email: "",
    address: "",
    typeCustomer: ""
  }

  constructor(private customerService: CustomerService, private router: Router, private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe(next =>{
      const id = next.get('id');
      if(id!=null){
        this.customer = this.customerService.findById(id);
      }
    },error => {

    }, () =>{
    });
  }

  customerForm = new FormGroup({
    id: new FormControl(this.customer.id),
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

  editCustomerWithReactive() {
    this.customerService.editCustomer(this.customerForm.value)
    this.router.navigateByUrl("customer")
  }


}
