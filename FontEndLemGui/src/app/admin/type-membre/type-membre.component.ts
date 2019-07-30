import {Component, OnInit, TemplateRef} from '@angular/core';
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {AdminService} from "../../shared/service/admin.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-type-membre',
  templateUrl: './type-membre.component.html',
  styleUrls: ['./type-membre.component.css']
})
export class TypeMembreComponent implements OnInit {
  private mode: number=0;
  modalRef: BsModalRef;
  config = {
    backdrop: true,
    ignoreBackdropClick: true,
    keyboard: false,
  };
  private typeMembres;

  constructor(private modalService: BsModalService,private adminService: AdminService,
              private router:Router) { }

  ngOnInit() {
    this.adminService.getResource("/typeMembres")
      .subscribe(data=>{
        this.typeMembres = data;
        console.log(data);

      },err=>{
        this.router.navigateByUrl("/menu");
      });

  }
  ouvrir(erreur: TemplateRef<any>){
    this.modalRef = this.modalService.show(erreur, this.config);
  }

  onUpload(typeMembre) {
    console.log(typeMembre);
    this.adminService.saveResource("/typeMembres",typeMembre)
      .subscribe(resp =>{
          console.log(resp);

          this.router.navigateByUrl('/programme');
        },
        err => {
          this.mode=1;
        });

  }

}
