import {Indicateurs} from './indicateurs';
import {DetailsProgramme} from './details-programme';

export interface ActiviteIndicateur {
  idActiveIndicateur: string;
  but: number;
  atteint: number;
  indicateurs: Indicateurs;
  detailsProgramme: DetailsProgramme;

}


