import {Component, OnInit, TemplateRef} from '@angular/core';
import {BsModalRef, BsModalService} from 'ngx-bootstrap';
import {AdminService} from '../../shared/service/admin.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-membre',
  templateUrl: './membre.component.html',
  styleUrls: ['./membre.component.css']
})
export class MembreComponent implements OnInit {
  membres;
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
      },err=>{
          this.router.navigateByUrl("/menu");
      });
  }

  ouvrir(erreur: TemplateRef<any>){
    this.modalRef = this.modalService.show(erreur, this.config);
  }

}
