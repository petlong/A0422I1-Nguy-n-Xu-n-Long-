import { Component, OnInit } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {Contract} from 'src/app/model/contract';
import {Facility} from 'src/app/model/facility';
import {ContractService} from 'src/app/service/contract/contract.service';
import {FacilityService} from 'src/app/service/facility/facility.service';

@Component({
  selector: 'app-contract-list',
  templateUrl: './contract-list.component.html',
  styleUrls: ['./contract-list.component.css']
})
export class ContractListComponent implements OnInit {

  contracts: Contract[];
  contract: Contract = {
    id: '',
    customer: '',
    facility: '',
    dateStart: '',
    dateEnd: '',
    prepayment: 0,
  };

  constructor(contractService: ContractService) {
    this.contracts = contractService.getAll();
  }

  ngOnInit(): void {
  }
}
