import {Component, OnInit, TemplateRef} from '@angular/core';
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {AdminService} from "../../shared/service/admin.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-type-news',
  templateUrl: './type-news.component.html',
  styleUrls: ['./type-news.component.css']
})
export class TypeNewsComponent implements OnInit {
  private mode: number=0;
  modalRef: BsModalRef;
  config = {
    backdrop: true,
    ignoreBackdropClick: true,
    keyboard: false,
  };
  private typeNews;

  constructor(private modalService: BsModalService,private adminService: AdminService,
              private router:Router) { }

  ngOnInit() {
    this.adminService.getResource("/typeNews")
      .subscribe(data=>{
        this.typeNews = data;
        console.log(data);

      },err=>{
        this.router.navigateByUrl("/menu");
      });

  }
  ouvrir(erreur: TemplateRef<any>){
    this.modalRef = this.modalService.show(erreur, this.config);
  }

  onUpload(typeNews) {
    console.log(typeNews);
    this.adminService.saveResource("/typeNews",typeNews)
      .subscribe(resp =>{
          console.log(resp);

          this.router.navigateByUrl('/programme');
        },
        err => {
          this.mode=1;
        });

  }


}
