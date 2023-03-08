import {error} from '@angular/compiler/src/util';
import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {IWord} from 'src/app/model/i-word';
import {DictonaryService} from 'src/app/service/dictonary.service';

@Component({
  selector: 'app-dictionary-detail',
  templateUrl: './dictionary-detail.component.html',
  styleUrls: ['./dictionary-detail.component.css']
})
export class DictionaryDetailComponent implements OnInit {
  iWord: IWord = {word: 'five', mean: '5'};

  constructor(private dictonaryService: DictonaryService, private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe(next => {
      const word = next.get('word');
      if (word != null) {
        // @ts-ignore
        this.iWord = this.dictonaryService.findById();
      }
      // tslint:disable-next-line:no-shadowed-variable
    }, error => {

    }, () => {
    });
  }

  ngOnInit(): void {
  }

}
