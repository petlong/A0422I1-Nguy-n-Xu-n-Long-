import {Injectable} from '@angular/core';
import {Contract} from 'src/app/model/contract';
import {Customer} from 'src/app/model/customer';
import {Facility} from 'src/app/model/facility';

@Injectable({
  providedIn: 'root'
})
export class ContractService {
  private contracts: Contract [] = [];

  constructor() {
    this.contracts.push({
      id: 'HD-0001',
      customer: 'Nam',
      facility: 'Room',
      dateStart: '2023-01-01',
      dateEnd: '2023-01-02',
      prepayment: 100,
    });
    this.contracts.push({
      id: 'HD-0002',
      customer: 'Nam2',
      facility: 'Villa',
      dateStart: '2023-02-04',
      dateEnd: '2023-01-06',
      prepayment: 200,
    });
    this.contracts.push({
      id: 'HD-0003',
      customer: 'Nam',
      facility: 'Room',
      dateStart: '2023-01-01',
      dateEnd: '2023-01-02',
      prepayment: 300,
    });
  }
  getAll() {
    return this.contracts;
  }

  addFacility(even: any) {
    this.contracts.push(even);
  }
}

// id?: string;
// customer?: Customer;
// facility?: Facility;
// dateStart?: string;
// dateEnd?: string;
// prepayment?: number;
