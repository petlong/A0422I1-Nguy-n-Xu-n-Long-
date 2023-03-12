import {Customer} from 'src/app/model/customer';
import {Facility} from 'src/app/model/facility';

export interface Contract {
  id?: string;
  customer?: any;
  facility?: any;
  dateStart?: string;
  dateEnd?: string;
  prepayment?: number;
}
