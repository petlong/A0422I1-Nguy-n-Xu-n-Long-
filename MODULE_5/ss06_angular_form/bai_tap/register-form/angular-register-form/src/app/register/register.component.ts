import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }

  register = new FormGroup({
    email: new FormControl('',[Validators.required], [Validators.email]),
    password: new FormControl('', [Validators.minLength(6)]),
    confirmPassword: new FormControl('', [Validators.minLength(6)]),
    country: new FormControl('', [Validators.required]),
    age: new FormControl('', [Validators.min(18)]),
    gender: new FormControl('', [Validators.required]),
    phone: new FormControl('', [Validators.pattern("\\(84\\)[\\d]{9,10}")])
  }, [this.comparePassword]);

  ngOnInit(): void {
  }

  comparePassword(form: any) {
    let password = form.controls.password.value;
    let confirmPassword = form.controls.confirmPassword.value;
    if (password === confirmPassword) {
      return null;
    }
    return {'invalidPassword': true};
  }

  onSubmit() {
    console.log(this.register.value);
  }

}
