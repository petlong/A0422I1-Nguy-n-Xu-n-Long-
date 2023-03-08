import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DictionaryDetailComponent} from 'src/app/dictionary/dictionary-detail/dictionary-detail.component';
import {DictionaryListComponent} from 'src/app/dictionary/dictionary-list/dictionary-list.component';


const routes: Routes = [
  {path: '', component: DictionaryListComponent},
  {path: 'detail/:word', component: DictionaryDetailComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
