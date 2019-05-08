import {Activite} from './activite';
import {Membre} from './membre';
import {Bureau} from './bureau';

export interface DetailsBureau {
  idDetailsBureau: number;
  idPoste: number;
  membre: Membre;
  bureau: Bureau;
}
