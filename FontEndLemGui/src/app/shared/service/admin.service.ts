import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject} from 'rxjs';
import {Membre} from '../model/membre';

@Injectable({
  providedIn: 'root'
})
export class AdminService {
  public host:string="http://localhost:8080";

  constructor(private http:HttpClient) { }


  public getResource(url){
    return this.http.get(this.host+url);
  }




}
