import {Commission} from './commission';
import {DetailsProgramme} from './details-programme';
import {Donateur} from './donateur';
import {Tache} from './tache';
import {Ressource} from './ressource';

export interface ActiviteTache {
  idActiviteTache: number;
  but: number;
  atteint:number;
  coutPrevisionnel:number;
  Reel: number;
  detailsProgramme: DetailsProgramme;
  commission: Commission;
  donateur:Donateur;
  ressource:Ressource;
  tache: Tache;
}
