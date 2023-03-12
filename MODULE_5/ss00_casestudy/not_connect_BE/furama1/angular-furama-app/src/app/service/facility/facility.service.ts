import { Injectable } from '@angular/core';
import {Facility} from "src/app/model/facility";

@Injectable({
  providedIn: 'root'
})
export class FacilityService {
  private facilities: Facility [] = [];

  constructor() {
    this.facilities.push({
      id: "DV-0001",
      name: "Villa",
      area: 500,
      cost: 1000,
      standard: "3 bed",
      floor: 1,
      other: "swing pool",
    });
    this.facilities.push({
      id: "DV-0002",
      name: "House",
      area: 200,
      cost: 500,
      standard: "2 bed",
      floor: 2,
      other: "swing pool",
    });
    this.facilities.push({
      id: "DV-0003",
      name: "Room",
      area: 200,
      cost: 500,
      standard: "3 bed",
      floor: 1,
      other: "swing pool",
    });

  }

  getAll() {
    return this.facilities;
  }

  addFacility(even: any) {
      this.facilities.push(even);
  }
}
