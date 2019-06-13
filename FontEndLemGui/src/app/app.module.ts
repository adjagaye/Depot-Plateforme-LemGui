import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavigationComponent } from './font/navigation/navigation.component';
import { SlideComponent } from './font/slide/slide.component';
import { CadresComponent } from './font/cadres/cadres.component';
import { DomainesComponent } from './font/domaines/domaines.component';
import { NewsComponent } from './font/news/news.component';
import { DonateursComponent } from './font/donateurs/donateurs.component';
import { ContactsComponent } from './font/contacts/contacts.component';
import { FooterComponent } from './font/footer/footer.component';
import { AuthentificationComponent } from './admin/authentification/authentification.component';
import { MenuComponent } from './admin/menu/menu.component';
import { ActiviteIndicateurComponent } from './admin/activite-indicateur/activite-indicateur.component';
import { ActiviteComponent } from './admin/activite/activite.component';
import { ActiviteCibleComponent } from './admin/activite-cible/activite-cible.component';
import { ActiviteCommissionComponent } from './admin/activite-commission/activite-commission.component';
import { ActiviteDomaineComponent } from './admin/activite-domaine/activite-domaine.component';
import { ActiviteTacheComponent } from './admin/activite-tache/activite-tache.component';
import { BureauComponent } from './admin/bureau/bureau.component';
import { CadreComponent } from './admin/cadre/cadre.component';
import { CibleComponent } from './admin/cible/cible.component';
import { CommissionComponent } from './admin/commission/commission.component';
import { DetailsBureauComponent } from './admin/details-bureau/details-bureau.component';
import { DetailsProgrammeComponent } from './admin/details-programme/details-programme.component';
import { DetailsResActiviteComponent } from './admin/details-res-activite/details-res-activite.component';
import { DomaineComponent } from './admin/domaine/domaine.component';
import { DonateurComponent } from './admin/donateur/donateur.component';
import { DonsComponent } from './admin/dons/dons.component';
import { IndicateursComponent } from './admin/indicateurs/indicateurs.component';
import { LieuComponent } from './admin/lieu/lieu.component';
import { MembreComponent } from './admin/membre/membre.component';
import { MembreCommissionComponent } from './admin/membre-commission/membre-commission.component';
import { PosteComponent } from './admin/poste/poste.component';
import { ProgrammeComponent } from './admin/programme/programme.component';
import { RessourceComponent } from './admin/ressource/ressource.component';
import { TacheComponent } from './admin/tache/tache.component';
import { TypeActiviteComponent } from './admin/type-activite/type-activite.component';
import { TypeDonateurComponent } from './admin/type-donateur/type-donateur.component';
import { TypeMembreComponent } from './admin/type-membre/type-membre.component';
import { TypeNewsComponent } from './admin/type-news/type-news.component';
import {HttpClientModule} from '@angular/common/http';
import { NewComponent } from './admin/new/new.component';
import {FormsModule} from '@angular/forms';
import { AccueilComponent } from './font/accueil/accueil.component';
import {BsModalService, ModalModule} from 'ngx-bootstrap';
import { SlidesComponent } from './admin/slides/slides.component';
import {AdminService} from './shared/service/admin.service';
import { AdminModule } from './admin/admin.module';

@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    SlideComponent,
    CadresComponent,
    DomainesComponent,
    NewsComponent,
    DonateursComponent,
    ContactsComponent,
    FooterComponent,
    AuthentificationComponent,
    MenuComponent,
    ActiviteIndicateurComponent,
    ActiviteComponent,
    ActiviteCibleComponent,
    ActiviteCommissionComponent,
    ActiviteDomaineComponent,
    ActiviteTacheComponent,
    BureauComponent,
    CadreComponent,
    CibleComponent,
    CommissionComponent,
    DetailsBureauComponent,
    DetailsProgrammeComponent,
    DetailsResActiviteComponent,
    DomaineComponent,
    DonateurComponent,
    DonsComponent,
    IndicateursComponent,
    LieuComponent,
    MembreCommissionComponent,

    PosteComponent,
    ProgrammeComponent,
    RessourceComponent,
    TacheComponent,
    TypeActiviteComponent,
    TypeDonateurComponent,
    TypeMembreComponent,
    TypeNewsComponent,
    NewComponent,
    AccueilComponent,
    SlidesComponent,


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ModalModule.forRoot(),
    AdminModule,

  ],
  providers: [BsModalService,AdminService],
  bootstrap: [AppComponent]
})
export class AppModule { }
