import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  result: number;

  constructor() { }

  ngOnInit(): void {
  }

  calculation(input1: string, input2: string, operator: string){
    switch (operator) {
      case '+':
        this.result = parseInt(input1) + parseInt(input2);
        break;
      case '-':
        this.result = parseInt(input1) - parseInt(input2);
        break;
      case '*':
        this.result = parseInt(input1) * parseInt(input2);
        break;
      case '/':
        this.result = parseInt(input1) / parseInt(input2);
        break;
    }
  }
}
