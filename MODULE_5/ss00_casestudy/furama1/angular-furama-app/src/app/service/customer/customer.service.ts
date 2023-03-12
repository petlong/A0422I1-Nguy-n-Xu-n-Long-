import {HttpClient, HttpClientModule} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {Customer} from 'src/app/model/customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private customers: Customer [] = [];

  constructor(private httpClient: HttpClient) {
    // this.customers.push({
    //   id: 'KH0001',
    //   name: 'Long',
    //   gender: 'male',
    //   dateOfBirth: '1998/01/01',
    //   idCard: '201560135',
    //   phone: '0935117090',
    //   email: 'long@gmail.com',
    //   address: 'Da Nang 1',
    //   typeCustomer: 'vip'
    // });
    // this.customers.push({
    //   id: 'KH0002',
    //   name: 'Chuong',
    //   gender: 'male',
    //   dateOfBirth: '1988/01/01',
    //   idCard: '201560135',
    //   phone: '0935117090',
    //   email: 'chuong@gmail.com',
    //   address: 'Da Nang 2',
    //   typeCustomer: 'vip'
    // });
    // this.customers.push({
    //   id: 'KH0003',
    //   name: 'HuyCho',
    //   gender: 'male',
    //   dateOfBirth: '1978/01/01',
    //   idCard: '201560135',
    //   phone: '0935117090',
    //   email: 'huy@gmail.com',
    //   address: 'Da Nang3',
    //   typeCustomer: 'vip'
    // });
  }

  getAll(): Observable<Customer> {
    return this.httpClient.get<Customer>('http://localhost:3000/customers/');
  }
  addCustomer(event: any): Observable<any> {
      return this.httpClient.post('http://localhost:3000/customers/', event);
  }

  findById(id: string): Observable<Customer> {
    return this.httpClient.get<Customer>('http://localhost:3000/customers/' + id);
  }

  deleteCustomer(id: string): Observable<Customer> {
    return this.httpClient.delete<Customer>('http://localhost:3000/customers/' + id);
  }

  editCustomer(id: string, customer: Customer): Observable<Customer> {
    return this.httpClient.put<Customer>('http://localhost:3000/customers/' + id, customer);
  }
}
