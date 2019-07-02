import {Component, OnInit, TemplateRef} from '@angular/core';
import {BsModalRef, BsModalService} from 'ngx-bootstrap';
import {AdminService} from '../../shared/service/admin.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-donateur',
  templateUrl: './donateur.component.html',
  styleUrls: ['./donateur.component.css']
})
export class DonateurComponent implements OnInit {
  mode=0;
  donateurs;
  typeDonateurs;
  modalRef: BsModalRef;
  config = {
    backdrop: true,
    ignoreBackdropClick: true,
    keyboard: false,
  };

  constructor(private modalService: BsModalService,private adminService: AdminService,private router:Router) {
    // customize default values of modals used by this component tree

  }

  ngOnInit() {
    this.adminService.getResource("/donateurs")
      .subscribe(data=>{
        this.donateurs = data;
        console.log(data);
      },err=>{
        this.router.navigateByUrl("/menu");
      });

    this.getTypeDonateurs();
  }

  ouvrir(erreur: TemplateRef<any>){
    this.modalRef = this.modalService.show(erreur, this.config);
  }

  getTypeDonateurs(){
    this.adminService.getResource("/typeDonateurs")
      .subscribe(data => {
        this.typeDonateurs = data;
        console.log(this.typeDonateurs);
      }, err => {
        this.router.navigateByUrl("/menu");
      });
  }

  onSave(donateur){
    console.log(donateur);
    this.adminService.saveResource("/donateurs/"+donateur.typeDonateur,donateur)
      .subscribe(resp =>{
          console.log(resp);

          this.router.navigateByUrl('/donateur');
        },
        err => {
          this.mode=1;
        });
  }


}
