import { Injectable } from '@angular/core';
import {HttpClient, HttpEvent, HttpHeaders, HttpRequest} from '@angular/common/http';
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class AdminService {
  public host:string="http://localhost:8080";
  private jwtToken= null;
  constructor(private http:HttpClient) { }


  public getResource(url){
    if(this.jwtToken == null ) this.loadToken();
    console.log(this.jwtToken);
   // console.log( this.http.get(this.host+url,
    //  {headers: new HttpHeaders({'Authorization':this.jwtToken})}));
    console.log(this.host+url);
    return this.http.get(this.host+url,
      {headers: new HttpHeaders({'Authorization':this.jwtToken})});
  }



  public saveResource(url,objet){
    //console.log( this.http.post(this.host+url,objet));
    console.log("tesssssssssssssssst");
    console.log(objet);
    return  this.http.post(this.host+url,objet,{headers: new HttpHeaders({'Authorization':this.jwtToken})});

  }

  public updateResource(url,objet,id:number){
    return  this.http.put(this.host+url+id,objet);
  }

  public deleteResource (id:number,url){
    return  this.http.delete(this.host+url+id);
  }


   login(user){
   // console.log( this.http.post(this.host+"/login",user,{observe:'response'}));
     console.log(user);
    return   this.http.post(this.host+"/login",user,{observe:'response'});

  }

  saveToken(jwt: string){
    localStorage.setItem( 'token',jwt);

  }

  loadToken(){
    this.jwtToken = localStorage.getItem('token');
    console.log(this.jwtToken);
  }

  uploadPhotoProduct(file:File,cadre): Observable<HttpEvent<{}>>{
    let formdata: FormData= new FormData();
    formdata.append('file',file);
    formdata.append('cadre',JSON.stringify(cadre));
    console.log(formdata);
    if(this.jwtToken == null ) this.loadToken();
    console.log(this.jwtToken);
    const req = new HttpRequest('POST',this.host+'/images/',formdata,{
      reportProgress:true,
      responseType:'text',
      headers: new HttpHeaders({'Authorization':this.jwtToken})
    });
    console.log(req);
    return this.http.request(req);
  }
}
