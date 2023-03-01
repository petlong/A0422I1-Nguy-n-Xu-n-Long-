import { Component, OnInit } from '@angular/core';
import {Student} from "../../model/student";

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  students: Student[] = [];
  student: Student = {id: 0, name: "", point: 0}

  constructor() {
    this.students.push({id: 0, point: 9, name: "HaiTT", dateOfBirth: "1998/01/01"});
    this.students.push({id: 2, point: 11, name: "TrungDP", dateOfBirth: "1988/01/01"});
    this.students.push({id: 4, point: 5, name: "Long", dateOfBirth: "1965/01/01"});
  }

  ngOnInit(): void {
  }

  viewInfo(item: Student){
    this.student = item;
  }

  addStudent(event: any){
    this.students.push(event);
  }
}
