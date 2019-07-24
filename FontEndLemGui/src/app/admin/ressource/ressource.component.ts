import {Component, OnInit, TemplateRef} from '@angular/core';
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {AdminService} from "../../shared/service/admin.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-ressource',
  templateUrl: './ressource.component.html',
  styleUrls: ['./ressource.component.css']
})
export class RessourceComponent implements OnInit {
  modalRef: BsModalRef;
  config = {
    backdrop: true,
    ignoreBackdropClick: true,
    keyboard: false,
  };
  private mode: number=0;
  private ressources;

  constructor(private modalService: BsModalService,private adminService: AdminService,private router:Router) { }

  ngOnInit() {
    this.adminService.getResource("/ressources")
      .subscribe(data=>{
        this.ressources = data;
        console.log(data);

      },err=>{
        this.router.navigateByUrl("/menu");
      });
  }

  ouvrir(erreur: TemplateRef<any>){
    this.modalRef = this.modalService.show(erreur, this.config);
  }

  onUpload(ressource) {
    console.log(ressource);
    this.adminService.saveResource("/ressources",ressource)
      .subscribe(resp =>{
          console.log(resp);

          this.router.navigateByUrl('/programme');
        },
        err => {
          this.mode=1;
        });

  }
}
