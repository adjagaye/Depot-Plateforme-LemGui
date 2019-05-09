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



  public saveResource(url,objet){
    return  this.http.post(this.host+url,objet);

  }

  public updateContact(url,objet,id:number){
    return  this.http.put(this.host+url+id,objet);
  }

  public deleteContact(id:number,url){
    return  this.http.delete(this.host+url+id);
  }
}
