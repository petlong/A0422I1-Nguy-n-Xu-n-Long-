import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {IWord} from 'src/app/model/i-word';
import {DictonaryService} from 'src/app/service/dictonary.service';

@Component({
  selector: 'app-dictionary-list',
  templateUrl: './dictionary-list.component.html',
  styleUrls: ['./dictionary-list.component.css']
})
export class DictionaryListComponent implements OnInit {
  iWords: IWord [];

  constructor(private dictonaryService: DictonaryService, private router: Router) {
    this.iWords = dictonaryService.getAll();
  }

  ngOnInit(): void {
  }

}
