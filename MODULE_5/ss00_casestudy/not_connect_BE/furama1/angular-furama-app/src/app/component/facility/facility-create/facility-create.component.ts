import { Component, OnInit } from '@angular/core';
import {AbstractControl, FormControl, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {FacilityService} from 'src/app/service/facility/facility.service';

@Component({
  selector: 'app-facility-create',
  templateUrl: './facility-create.component.html',
  styleUrls: ['./facility-create.component.css']
})
export class FacilityCreateComponent implements OnInit {

  constructor(private facilityService: FacilityService, private router: Router) { }

  facilityForm = new FormGroup({
    // id: new FormControl('', [Validators.required, Validators.min(1), Validators.max(2147483647)]),
    id: new FormControl('', [Validators.required, Validators.pattern('(DV)[-][\\d]{4}')]),
    // name: new FormControl('', [Validators.required, Validators.minLength(3), Validators.maxLength(255)]),
    name: new FormControl('', [Validators.required] ),
    area: new FormControl('', [Validators.required, this.validateInteger]),
    cost: new FormControl('', [Validators.required, this.validateInteger]),
    standard: new FormControl('', [Validators.required]),
    floor: new FormControl('', [Validators.required, this.validateInteger]),
    other: new FormControl(),
  });
  // id: string,
  // name: string,
  // area: number,
  // cost: number,
  // standard: string
  // floor: number,
  // other: string

  ngOnInit(): void {
  }

  addFacilityWithReactive() {
    this.facilityService.addFacility(this.facilityForm.value);
    this.router.navigateByUrl('facility');
  }

  private validateInteger(control: AbstractControl) {
      const integer = control.value;
      if (integer > 0 && integer % 1 === 0) {
        return null;
      } else {
        return {validateInteger: true};
      }
  }
}
