import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {MembreComponent} from './membre/membre.component';

const routes: Routes = [
  { path: 'membre', component: MembreComponent },

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdminRoutingModule { }
