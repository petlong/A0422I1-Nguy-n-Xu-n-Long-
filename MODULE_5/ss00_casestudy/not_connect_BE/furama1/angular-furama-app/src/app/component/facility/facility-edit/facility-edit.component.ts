import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Facility} from 'src/app/model/facility';


@Component({
  selector: 'app-facility-edit',
  templateUrl: './facility-edit.component.html',
  styleUrls: ['./facility-edit.component.css']
})
export class FacilityEditComponent implements OnInit {
  facility: Facility = {
    id: "",
    name: "",
    area: 0,
    cost: 0,
    standard: "",
    floor: 0,
    other: "",
  }
  id: string;

  facilityForm: FormGroup

  ngOnInit(): void {
  }

  // editCustomerWithReactive(id: string) {
  //   this.customerService.editCustomer(id, this.customerForm.value)
  //   this.router.navigateByUrl("customer")
  //   alert('Update complete')
  // }

  // constructor(private facilityService: FacilityService, private router: Router) { }

  // facilityForm = new FormGroup({
  //   // id: new FormControl('', [Validators.required, Validators.min(1), Validators.max(2147483647)]),
  //   id: new FormControl('', [Validators.required, Validators.pattern('(DV)[-][\\d]{4}')]),
  //   // name: new FormControl('', [Validators.required, Validators.minLength(3), Validators.maxLength(255)]),
  //   name: new FormControl('', [Validators.required] ),
  //   area: new FormControl('', [Validators.required,this.validateInteger]),
  //   cost: new FormControl('', [Validators.required,this.validateInteger]),
  //   standard: new FormControl('', [Validators.required]),
  //   floor: new FormControl('', [Validators.required,this.validateInteger]),
  //   other: new FormControl(),
  // })

}

