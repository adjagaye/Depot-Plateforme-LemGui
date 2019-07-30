import {Component, OnInit, TemplateRef} from '@angular/core';
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {AdminService} from "../../shared/service/admin.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-navigations',
  templateUrl: './navigations.component.html',
  styleUrls: ['./navigations.component.css']
})
export class NavigationsComponent implements OnInit {
  private mode: number=0;
  modalRef: BsModalRef;
  config = {
    backdrop: true,
    ignoreBackdropClick: true,
    keyboard: false,
  };
  private menus;

  constructor(private modalService: BsModalService,private adminService: AdminService,
              private router:Router) { }

  ngOnInit() {
    this.adminService.getResource("/menus")
      .subscribe(data=>{
        this.menus = data;
        console.log(data);

      },err=>{
        this.router.navigateByUrl("/menu");
      });

  }

  ouvrir(erreur: TemplateRef<any>){
    this.modalRef = this.modalService.show(erreur, this.config);
  }

  onUpload(menu) {
    console.log(menu);
    this.adminService.saveResource("/menus",menu)
      .subscribe(resp =>{
          console.log(resp);

          this.router.navigateByUrl('/programme');
        },
        err => {
          this.mode=1;
        });

  }
}
