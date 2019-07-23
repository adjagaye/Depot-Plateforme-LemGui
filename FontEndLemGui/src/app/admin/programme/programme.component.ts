import {Component, OnInit, TemplateRef} from '@angular/core';
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {AdminService} from "../../shared/service/admin.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-programme',
  templateUrl: './programme.component.html',
  styleUrls: ['./programme.component.css']
})
export class ProgrammeComponent implements OnInit {

  modalRef: BsModalRef;
  config = {
    backdrop: true,
    ignoreBackdropClick: true,
    keyboard: false,
  };
  private mode: number=0;
  private programmes: any;

  constructor(private modalService: BsModalService,private adminService: AdminService,private router:Router) { }

  ngOnInit() {
    this.adminService.getResource("/programmes")
      .subscribe(data=>{
        this.programmes = data;
        console.log(data);

      },err=>{
        this.router.navigateByUrl("/menu");
      });

  }

  ouvrir(erreur: TemplateRef<any>){
    this.modalRef = this.modalService.show(erreur, this.config);
  }

  onUpload(programme) {
    console.log(programme);
    this.adminService.saveResource("/programmes",programme)
      .subscribe(resp =>{
          console.log(resp);

          this.router.navigateByUrl('/programme');
        },
        err => {
          this.mode=1;
        });
    
  }
}
