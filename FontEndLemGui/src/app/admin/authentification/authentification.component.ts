import { Component, OnInit } from '@angular/core';
import {AdminService} from '../../shared/service/admin.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-authentification',
  templateUrl: './authentification.component.html',
  styleUrls: ['./authentification.component.css']
})
export class AuthentificationComponent implements OnInit {
  mode:number=0;
  constructor(private adminService: AdminService, private router:Router) { }

  ngOnInit() {
  }

  onLogin(user){

    this.adminService.login(user)
      .subscribe(resp =>{
        console.log(resp);
        let jwt = resp.headers.get('Authorization');
        this.adminService.saveToken(jwt);
        this.router.navigateByUrl('/menu');
      },
        err => {
          this.mode=1;
        });
  }



}
