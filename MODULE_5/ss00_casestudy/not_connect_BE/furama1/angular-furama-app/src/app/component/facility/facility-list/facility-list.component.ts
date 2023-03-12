import { Component, OnInit } from '@angular/core';
import {Facility} from 'src/app/model/facility';
import {FacilityService} from 'src/app/service/facility/facility.service';

@Component({
  selector: 'app-facility-list',
  templateUrl: './facility-list.component.html',
  styleUrls: ['./facility-list.component.css']
})
export class FacilityListComponent implements OnInit {

  facilities: Facility[];
  facility: Facility = {
    id: "",
    name: "",
    area: 0,
    cost: 0,
    standard: "",
    floor: 0,
    other: "",
  }

  constructor(facilityService: FacilityService) {
    this.facilities = facilityService.getAll();
  }

  ngOnInit(): void {
  }

}
