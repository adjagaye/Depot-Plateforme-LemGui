import {Component, OnInit, TemplateRef} from '@angular/core';
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {AdminService} from "../../shared/service/admin.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-type-donateur',
  templateUrl: './type-donateur.component.html',
  styleUrls: ['./type-donateur.component.css']
})
export class TypeDonateurComponent implements OnInit {
  private mode: number=0;
  modalRef: BsModalRef;
  config = {
    backdrop: true,
    ignoreBackdropClick: true,
    keyboard: false,
  };
  private typeDonateurs;

  constructor(private modalService: BsModalService,private adminService: AdminService,
              private router:Router) { }

  ngOnInit() {
    this.adminService.getResource("/typeDonateurs")
      .subscribe(data=>{
        this.typeDonateurs = data;
        console.log(data);

      },err=>{
        this.router.navigateByUrl("/typeDonateurs");
      });

  }
  ouvrir(erreur: TemplateRef<any>){
    this.modalRef = this.modalService.show(erreur, this.config);
  }

  onUpload(typeDonateurs) {
    console.log(typeDonateurs);
    this.adminService.saveResource("/typeDonateurs",typeDonateurs)
      .subscribe(resp =>{
          console.log(resp);

          this.router.navigateByUrl('/typeDonateurs');
        },
        err => {
          this.mode=1;
        });

  }

}
