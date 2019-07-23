import {Component, OnInit, TemplateRef} from '@angular/core';
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {HttpEventType, HttpResponse} from "@angular/common/http";
import {AdminService} from "../../shared/service/admin.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-new',
  templateUrl: './new.component.html',
  styleUrls: ['./new.component.css']
})
export class NewComponent implements OnInit {

  modalRef: BsModalRef;
  config = {
    backdrop: true,
    ignoreBackdropClick: true,
    keyboard: false,
  };
  selectedFile;
  idTypeNews;
  private currentUploadFile: any;
  private progress: number;
  private typeNews: any;
  private news: any;

  constructor(private modalService: BsModalService ,private adminService: AdminService,
              private router:Router) {
    // customize default values of modals used by this component tree


  }
  ngOnInit() {
    this.getTypeNews();
    this.adminService.getResource("/nouvelles")
      .subscribe(data=>{
        this.news = data;
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

  onUpload(news) {

    this.progress = 0;
    console.log(news);
    console.log("**********");
    this.currentUploadFile = this.selectedFile.item(0);
    this.idTypeNews = news.typeNews;
    console.log(this.idTypeNews);


    this.adminService.uploadPhotoProduct(this.currentUploadFile,news,"/saveNews/")
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

  getTypeNews(){
    this.adminService.getResource("/typeNews")
      .subscribe(data=>{
        // console.log(MembreComponent.subscribeData);
        this.typeNews = data;
        console.log(this.typeNews);
      },err=>{
        this.router.navigateByUrl("/menu");
      });
  }

}
