import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Student} from "../../model/student";
import {AbstractControl, FormControl, FormGroup, NgForm, Validators} from "@angular/forms";

@Component({
  selector: 'app-student-create',
  templateUrl: './student-create.component.html',
  styleUrls: ['./student-create.component.css']
})
export class StudentCreateComponent implements OnInit {
  @Output() studentSubmit = new EventEmitter();
  student?: Student

  studentForm: FormGroup;

  constructor() {
    this.studentForm = new FormGroup({
      id: new FormControl('', [Validators.required, Validators.min(1), Validators.max(2147483647)]),
      name: new FormControl('', [Validators.required, Validators.minLength(3), Validators.maxLength(255)]),
      dateOfBirth: new FormControl(),
      point: new FormControl('', [this.validatePoint])
      },[this.confirmPass]
    )
  }

  confirmPass(form: any){
    let name = form.controls.name.value;
    if (name == 'HaiTT'){
      return null;
    } else {
      return {'invalidName': true};
    }
  }

  validatePoint(control: AbstractControl){
    let point = control.value;
    if(point<0){
      return{'invalidPoint': true}
    }
    return null;
  }

  ngOnInit(): void {
  }

  addStudent(value: string, value2: string, value3: string, value4: string){
    let student = {id: parseInt(value), name: value2, dateOfBirth: value3, point: parseInt(value4)}
    console.log(student);
    this.studentSubmit.emit(student)
  }

  addStudentWithTemplate(templateForm: NgForm){
    console.log(templateForm);
    this.studentSubmit.emit(templateForm.value)
  }

  addStudentWithReactive(){
    console.log(this.studentForm);
    this.studentSubmit.emit(this.studentForm.value)
  }
}
