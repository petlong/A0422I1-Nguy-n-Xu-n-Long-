import { Injectable } from '@angular/core';
import {element} from 'protractor';
import {IWord} from 'src/app/model/i-word';

@Injectable({
  providedIn: 'root'
})
export class DictonaryService {
  private iWords: IWord[] = [];

  constructor() {
    this.iWords.push({
      word: 'one',
      mean: '1'
    });
    this.iWords.push({
      word: 'two',
      mean: '2'
    });
    this.iWords.push({
      word: 'three',
      mean: '3'
    });
    this.iWords.push({
      word: 'four',
      mean: '4'
    });
  }

  getAll() {
    return this.iWords;
  }

  findById(word: string): IWord {
    // tslint:disable-next-line:no-shadowed-variable
    return this.iWords.filter(element => element.word === word)[0];
  }
}
