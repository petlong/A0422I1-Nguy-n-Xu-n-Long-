import { Component, OnInit } from '@angular/core';
import {AbstractControl, FormControl, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';
import {Facility} from 'src/app/model/facility';
import {CustomerService} from 'src/app/service/customer/customer.service';
import {FacilityService} from 'src/app/service/facility/facility.service';


@Component({
  selector: 'app-facility-edit',
  templateUrl: './facility-edit.component.html',
  styleUrls: ['./facility-edit.component.css']
})
export class FacilityEditComponent implements OnInit {
  facility: Facility = {
    id: '',
    name: '',
    area: 0,
    cost: 0,
    standard: '',
    floor: 0,
    other: '',
  };
  id: string;

  facilityForm: FormGroup;

  ngOnInit(): void {
  }

  constructor(private facilityService: FacilityService, private router: Router, private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe(next => {
      const id = next.get('id');
      if (id != null) {
        this.facility = this.facilityService.findById(id);
        this.facilityForm = new FormGroup({
          id: new FormControl(this.facility.id),
            name: new FormControl(this.facility.name, [Validators.required] ),
            area: new FormControl(this.facility.area, [Validators.required, this.validateInteger]),
            cost: new FormControl(this.facility.cost, [Validators.required, this.validateInteger]),
            standard: new FormControl(this.facility.standard, [Validators.required]),
            floor: new FormControl(this.facility.floor, [Validators.required, this.validateInteger]),
            other: new FormControl(this.facility.other),
        });
      }
    }, error => {

    }, () => {
    });
  }

  private validateInteger(control: AbstractControl) {
    const integer = control.value;
    if (integer > 0 && integer % 1 === 0) {
      return null;
    } else {
      return {validateInteger: true};
    }
  }

  editFacilityWithReactive(id: string) {
    this.facilityService.editFacility(id, this.facilityForm.value);
    this.router.navigateByUrl('facility');
    alert('Update complete');
  }
}

