import {DetailsProgramme} from './details-programme';
import {Cible} from './cible';

export interface ActiviteCible {
  idActiviteCible: number;
  cible:Cible;
  detailsProgramme: DetailsProgramme;
}
