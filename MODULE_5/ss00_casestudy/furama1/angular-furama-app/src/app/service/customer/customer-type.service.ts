import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {Customer} from 'src/app/model/customer';
import {CustomerType} from 'src/app/model/customer-type';

@Injectable({
  providedIn: 'root'
})
export class CustomerTypeService {
  customerTypes: CustomerType[] = [];

  constructor(private httpClient: HttpClient) {
    // this.customerTypes.push({id: 1, name: 'Vip'});
    // this.customerTypes.push({id: 2, name: 'Normal'});
  }

  // getAll(): CustomerType[] {
  //   return this.customerTypes;
  // }

  getAll(): Observable<CustomerType> {
    return this.httpClient.get<CustomerType>('http://localhost:3000/customerTypes/');
  }
}
