import {Component, OnInit, TemplateRef} from '@angular/core';
import {BsModalRef, BsModalService} from 'ngx-bootstrap';
import {AdminService} from "../../shared/service/admin.service";
import {Router} from "@angular/router";
import {HttpEventType, HttpResponse} from "@angular/common/http";

@Component({
  selector: 'app-cadre',
  templateUrl: './cadre.component.html',
  styleUrls: ['./cadre.component.css']
})
export class CadreComponent implements OnInit {

  modalRef: BsModalRef;
  config = {
    backdrop: true,
    ignoreBackdropClick: true,
    keyboard: false,
  };
  selectedFile;
  currentUploadFile: any;
  mode=0;
  progress: number;

  constructor(private modalService: BsModalService,private adminService: AdminService,
              private router:Router) {
    // customize default values of modals used by this component tree


  }
  ngOnInit() {

  }

  ouvrir(erreur: TemplateRef<any>){
    this.modalRef = this.modalService.show(erreur, this.config);
  }

  onFileSelected(event){
    console.log(event);
    this.selectedFile = event.target.files;

  }

  onUpload(){
    this.progress = 0;
    this.currentUploadFile = this.selectedFile.item(0);

    this.adminService.uploadPhotoProduct(this.currentUploadFile)
      .subscribe(event =>{
         if(event.type === HttpEventType.UploadProgress){
            this.progress = Math.round(100 * event.loaded / event.total)

         }else if (event instanceof HttpResponse) {
           alert("Probleme de telechargement...");
         }
        },
        err => {
          alert("N'entre pas");
        });

  }

}
