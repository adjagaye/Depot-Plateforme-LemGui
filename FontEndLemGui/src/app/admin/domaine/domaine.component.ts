import {Component, OnInit, TemplateRef} from '@angular/core';
import { ModalDirective, BsModalRef, BsModalService } from 'ngx-bootstrap';
import {HttpClient, HttpEventType, HttpResponse} from '@angular/common/http';
import {AdminService} from "../../shared/service/admin.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-domaine',
  templateUrl: './domaine.component.html',
  styleUrls: ['./domaine.component.css'],

})
export class DomaineComponent implements OnInit {
  fileData: File = null;
  selectedFile;
  currentUploadFile: any;
  domaines;
  progress: number;
  modalRef: BsModalRef;
  config = {
    backdrop: true,
    ignoreBackdropClick: true,
    keyboard: false,
  };


  constructor(private modalService: BsModalService,private adminService: AdminService,
              private router:Router) {
    // customize default values of modals used by this component tree

  }fileProgress(fileInput: any) {
    this.fileData = <File>fileInput.target.files[0];
  }


  ngOnInit() {
    this.adminService.getResource("/domaines")
      .subscribe(data=>{
        this.domaines = data;
        console.log(data);

      },err=>{
        this.router.navigateByUrl("/menu");
      });

  }

  ouvrir(erreur: TemplateRef<any>){
    this.modalRef = this.modalService.show(erreur, this.config);
  }

  onFileSelected(event){
    this.selectedFile = event.target.files;
    console.log(this.selectedFile);

  }

  onUpload(domaine){
    this.progress = 0;
    console.log(domaine);
    this.currentUploadFile = this.selectedFile.item(0);

    this.adminService.uploadPhotoProduct(this.currentUploadFile,domaine,"/SaveDomaines/")
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
  I
}
