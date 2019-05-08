import {DetailsProgramme} from './details-programme';
import {Domaine} from './domaine';

export interface ActiviteDomaine {
  idActiviteDomaine: number;
  detailsProgramme: DetailsProgramme;
  domaine: Domaine;
}
