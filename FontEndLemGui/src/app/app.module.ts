import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavigationComponent } from './navigation/navigation.component';
import { SlideComponent } from './slide/slide.component';
import { CadresComponent } from './cadres/cadres.component';
import { DomainesComponent } from './domaines/domaines.component';
import { NewsComponent } from './news/news.component';
import { DonateursComponent } from './donateurs/donateurs.component';
import { ContactsComponent } from './contacts/contacts.component';
import { FooterComponent } from './footer/footer.component';
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
    MembreComponent,
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


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
