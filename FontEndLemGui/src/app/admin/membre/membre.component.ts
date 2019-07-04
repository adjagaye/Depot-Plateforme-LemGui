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
  mode:number=0;
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

    this.adminService.getResource("/utilisateurs")
      .subscribe(data=>{
        this.membres = data;
        console.log(data);

      },err=>{
          this.router.navigateByUrl("/menu");
      });

    this.getTypeMembres();

  }

  ouvrir(erreur: TemplateRef<any>){
    this.modalRef = this.modalService.show(erreur, this.config);
  }



  getTypeMembres(){
    this.adminService.getResource("/typeMembres")
      .subscribe(data=>{
        // console.log(MembreComponent.subscribeData);
        this.typeMembre = data;
        console.log(this.typeMembre);
      },err=>{
        this.router.navigateByUrl("/menu");
      });

  }

  onSave(membre){
    console.log(membre.typeMembres);
    this.adminService.saveResource("/membres/"+membre.typeMembres,membre)
      .subscribe(resp =>{
          console.log(resp);

          this.router.navigateByUrl('/membre');
        },
        err => {
          this.mode=1;
        });
  }



}
