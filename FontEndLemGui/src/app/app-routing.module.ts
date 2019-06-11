import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ActiviteIndicateurComponent} from './admin/activite-indicateur/activite-indicateur.component';
import {ActiviteComponent} from './admin/activite/activite.component';
import {ActiviteCibleComponent} from './admin/activite-cible/activite-cible.component';
import {ActiviteCommissionComponent} from './admin/activite-commission/activite-commission.component';
import {ActiviteDomaineComponent} from './admin/activite-domaine/activite-domaine.component';
import {ActiviteTacheComponent} from './admin/activite-tache/activite-tache.component';
import {BureauComponent} from './admin/bureau/bureau.component';
import {CadreComponent} from './admin/cadre/cadre.component';
import {CibleComponent} from './admin/cible/cible.component';
import {CommissionComponent} from './admin/commission/commission.component';
import {DetailsBureauComponent} from './admin/details-bureau/details-bureau.component';
import {DetailsProgrammeComponent} from './admin/details-programme/details-programme.component';
import {DetailsResActiviteComponent} from './admin/details-res-activite/details-res-activite.component';
import {DomaineComponent} from './admin/domaine/domaine.component';
import {DonateurComponent} from './admin/donateur/donateur.component';
import {DonsComponent} from './admin/dons/dons.component';
import {IndicateursComponent} from './admin/indicateurs/indicateurs.component';
import {LieuComponent} from './admin/lieu/lieu.component';
import {MembreComponent} from './admin/membre/membre.component';
import {MembreCommissionComponent} from './admin/membre-commission/membre-commission.component';
import {MenuComponent} from './admin/menu/menu.component';

import {PosteComponent} from './admin/poste/poste.component';
import {ProgrammeComponent} from './admin/programme/programme.component';
import {RessourceComponent} from './admin/ressource/ressource.component';
import {TacheComponent} from './admin/tache/tache.component';
import {TypeActiviteComponent} from './admin/type-activite/type-activite.component';
import {TypeDonateurComponent} from './admin/type-donateur/type-donateur.component';
import {TypeMembreComponent} from './admin/type-membre/type-membre.component';
import {TypeNewsComponent} from './admin/type-news/type-news.component';
import {AuthentificationComponent} from './admin/authentification/authentification.component';
import {NewComponent} from './admin/new/new.component';
import {AccueilComponent} from './font/accueil/accueil.component';
import {SlidesComponent} from './admin/slides/slides.component';

const routes: Routes = [
  { path: 'actviteindicateur', component: ActiviteIndicateurComponent },
  { path: 'activite', component: ActiviteComponent },
  { path: 'actvitecible', component: ActiviteCibleComponent },
  { path: 'actvitecommission', component: ActiviteCommissionComponent },
  { path: 'actvitedomaine', component: ActiviteDomaineComponent },
  { path: 'actvitetache', component: ActiviteTacheComponent },
  { path: 'bureau', component: BureauComponent },
  { path: 'cadre', component: CadreComponent },
  { path: 'cible', component: CibleComponent },
  { path: 'commission', component: CommissionComponent },
  { path: 'commission', component: CommissionComponent },
  { path: 'detailsbureau', component: DetailsBureauComponent },
  { path: 'detailsprogramme', component: DetailsProgrammeComponent },
  { path: 'detailsresactivite', component: DetailsResActiviteComponent },
  { path: 'domaine', component: DomaineComponent },
  { path: 'donateur', component: DonateurComponent },
  { path: 'dons', component: DonsComponent },
  { path: 'indicateur', component: IndicateursComponent },
  { path: 'lieu', component: LieuComponent },
  { path: 'membre', component: MembreComponent },
  { path: 'membrecommision', component: MembreCommissionComponent },
  { path: 'menu', component: MenuComponent },
  { path: 'new', component: NewComponent },
  { path: 'poste', component: PosteComponent },
  { path: 'programme', component: ProgrammeComponent },
  { path: 'resssource', component: RessourceComponent },
  { path: 'tache', component: TacheComponent },
  { path: 'typeactivite', component: TypeActiviteComponent },
  { path: 'typedonateur', component: TypeDonateurComponent },
  { path: 'typemembre', component: TypeMembreComponent },
  { path: 'typenews', component: TypeNewsComponent },
  { path: 'authentification', component: AuthentificationComponent},
  { path: 'slide', component: SlidesComponent},
  { path: 'cadre', component: CadreComponent},
  { path: 'accueil', component: AccueilComponent},
  {path:'',redirectTo: '/authentification',pathMatch:'full'}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
