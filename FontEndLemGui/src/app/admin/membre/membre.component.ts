import {Component, OnInit, TemplateRef} from '@angular/core';
import {BsModalRef, BsModalService} from 'ngx-bootstrap';
import {AdminService} from '../../shared/service/admin.service';
import {Router} from '@angular/router';
import {Membre} from '../../shared/model/membre';
import {TypeMembre} from '../../shared/model/type-membre';

@Component({
  selector: 'app-membre',
  templateUrl: './membre.component.html',
  styleUrls: ['./membre.component.css']
})
export class MembreComponent implements OnInit {
  static subscribeData:any;
  membres;
  m: Array<Membre> = [];
  tm: TypeMembre;
  typeMembre;
  i =0;
  modalRef: BsModalRef;
  config = {
    backdrop: true,
    ignoreBackdropClick: true,
    keyboard: false,
  };

  constructor(private modalService: BsModalService, private adminService: AdminService,
              private router:Router) {
    // customize default values of modals used by this component tree

  }
  ngOnInit() {

    this.adminService.getResource("/membres")
      .subscribe(data=>{
        this.membres = data;
        console.log(data);
       // this.m=this.membres._embedded.membres;
        /*for (let i = 0; i < this.membres._embedded.membres.length; i++) {
          console.log(this.membres._embedded.membres[i]);
          console.log(this.getTypeMembre(this.membres._embedded.membres[i].idMembre));
        }*/
            // this.m=this.membres._embedded.membres;


            /* for (let m of this.membres._embedded.membres) {
               console.log(m.idMembre);
               this.getTypeMembre(m.idMembre);
             }*/
        //console.log(this.membres._embedded.membres);
       // this.getTypeMembre(this.membres._embedded.membres.idMembre);
      },err=>{
          this.router.navigateByUrl("/menu");
      });

    /*this.adminService.getResource("/utilisateurs")
      .subscribe(data=> {
        this.membres = data;
        console.log(data);
      });*/


  }

  ouvrir(erreur: TemplateRef<any>){
    this.modalRef = this.modalService.show(erreur, this.config);
  }

  getTypeMembre(id:number):any{
     this.adminService.getResource("/membres/"+id+"/typeMembre")
      .subscribe(data=>{
        console.log(data);
       MembreComponent.subscribeData=data;
        console.log(MembreComponent.subscribeData);
        this.typeMembre = data;
        return data;
      },err=>{
        this.router.navigateByUrl("/menu");
      });

  }


}
