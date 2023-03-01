import {Component, Input, OnInit, SimpleChanges} from '@angular/core';
import {Student} from "../../model/student";

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit {
  @Input() student: Student = {id: 3, name: 'HaiTT', point: 0}
  color = 'red';

  constructor() { }

  ngOnInit(): void {
    console.log("hello every body")
  }

  ngDoCheck():void{
    console.log("do check")
  }

  changeNameStudent(name: string){
    this.student.name = name;
    this.ngOnInit()
  }

  ngOnChanges(changes: SimpleChanges): void{
    console.log(changes)
  }
}
