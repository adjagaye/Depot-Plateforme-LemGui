import {Component, OnInit, TemplateRef} from '@angular/core';
import { ModalDirective, BsModalRef, BsModalService } from 'ngx-bootstrap';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-domaine',
  templateUrl: './domaine.component.html',
  styleUrls: ['./domaine.component.css'],

})
export class DomaineComponent implements OnInit {
  fileData: File = null;
  modalRef: BsModalRef;
  config = {
    backdrop: true,
    ignoreBackdropClick: true,
    keyboard: false,
  };


  constructor(private modalService: BsModalService,private http: HttpClient) {
    // customize default values of modals used by this component tree

  }fileProgress(fileInput: any) {
    this.fileData = <File>fileInput.target.files[0];
  }


  ngOnInit() {
  }

  ouvrir(erreur: TemplateRef<any>){
    this.modalRef = this.modalService.show(erreur, this.config);
  }

  onSubmit() {
    const formData = new FormData();
    formData.append('file', this.fileData);
    this.http.post('url/to/your/api', formData)
      .subscribe(res => {
        console.log(res);
        alert('SUCCESS !!');
      })
  }
  I
}
