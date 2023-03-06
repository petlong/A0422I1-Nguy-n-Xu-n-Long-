import {Customer} from "src/app/model/customer";
import {Facility} from "src/app/model/facility";

export interface Contract {
  id: string,
  customer: Customer,
  facility: Facility,
  dateStart: string,
  dateEnd: string,
  prepayment: number
}
