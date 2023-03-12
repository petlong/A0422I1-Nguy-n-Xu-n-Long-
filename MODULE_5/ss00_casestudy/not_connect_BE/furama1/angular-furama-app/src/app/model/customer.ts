import {CustomerType} from "src/app/model/customer-type";

export interface Customer {
  id: string,
  name: string,
  gender: string,
  dateOfBirth: string
  idCard: string,
  phone: string,
  email?: string,
  address?: string,
  typeCustomer: string
}
