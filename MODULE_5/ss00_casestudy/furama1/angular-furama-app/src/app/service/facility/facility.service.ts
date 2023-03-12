import { Injectable } from '@angular/core';
import {Customer} from 'src/app/model/customer';
import {Facility} from 'src/app/model/facility';

@Injectable({
  providedIn: 'root'
})
export class FacilityService {
  private facilities: Facility [] = [];

  constructor() {
    this.facilities.push({
      id: 'DV-0001',
      name: 'Villa',
      area: 500,
      cost: 1000,
      standard: '3 bed',
      floor: 1,
      other: 'swing pool',
    });
    this.facilities.push({
      id: 'DV-0002',
      name: 'House',
      area: 200,
      cost: 500,
      standard: '2 bed',
      floor: 2,
      other: 'swing pool',
    });
    this.facilities.push({
      id: 'DV-0003',
      name: 'Room',
      area: 200,
      cost: 500,
      standard: '3 bed',
      floor: 1,
      other: 'swing pool',
    });

  }

  getAll() {
    return this.facilities;
  }

  addFacility(even: any) {
      this.facilities.push(even);
  }


  findById(id: string): Facility {
    return this.facilities.filter(element => element.id === id)[0];
  }

  editFacility(id: string, facility: Facility) {
    for (let i = 0; i < this.facilities.length; i++) {
      if (this.facilities[i].id === id) {
        this.facilities[i] = facility;
      }
    }
  }
}
