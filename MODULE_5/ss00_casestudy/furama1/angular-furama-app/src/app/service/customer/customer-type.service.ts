import {Injectable} from '@angular/core';
import {CustomerType} from 'src/app/model/customer-type';

@Injectable({
  providedIn: 'root'
})
export class CustomerTypeService {
  customerTypes: CustomerType[] = [];

  constructor() {
    this.customerTypes.push({id: 1, name: 'Vip'});
    this.customerTypes.push({id: 2, name: 'Normal'});
  }

  getAll(): CustomerType[] {
    return this.customerTypes;
  }
}
