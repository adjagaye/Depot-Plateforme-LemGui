import {Activite} from './activite';

export interface DetailsProgramme {
  idDetailsProgramme: number;
  periode: number;
  etat: number;
  daterRealisation:Date;
  coutPrevisionnel: number;
  coutReel:number;
  activite: Activite;
  idLieu: number;
}
