import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators, ReactiveFormsModule} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';
import {Customer} from 'src/app/model/customer';
import {CustomerType} from 'src/app/model/customer-type';
import {CustomerTypeService} from 'src/app/service/customer/customer-type.service';
import {CustomerService} from 'src/app/service/customer/customer.service';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {
  customer: Customer;
  id: string;

  customerTypes: CustomerType[] = [];
  customerForm: FormGroup = new FormGroup({
    // id: new FormControl('', [Validators.required, Validators.min(1), Validators.max(2147483647)]),
    // id: new FormControl(this.customer.id),
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

  constructor(private customerService: CustomerService, private router: Router,
              private activatedRoute: ActivatedRoute, private customerTypeService: CustomerTypeService) {
    // this.customerTypes = this.customerTypeService.getAll();
    this.activatedRoute.paramMap.subscribe(next => {
      const id = next.get('id');
      if (id != null) {
        // @ts-ignore
        // tslint:disable-next-line:no-shadowed-variable
        this.customer = this.customerService.findById(id).subscribe(next => {
          this.customer = next;
          console.log(this.customer);
        });
      }
    }, error => {
    }, () => {
    });
  }

  ngOnInit(): void {
    this.getAllcustomerType();
  }

  getCustomerForm(id: string) {

  }

  editCustomerWithReactive(id: string) {
    this.customerService.editCustomer(id, this.customerForm.value).subscribe(next => {
      this.router.navigateByUrl('customer');
      alert('Update complete');
    });
  }

  getAllcustomerType() {
    this.customerTypeService.getAll().subscribe(next => {
      // @ts-ignore
      this.customerTypes = next;
    });
  }
}
