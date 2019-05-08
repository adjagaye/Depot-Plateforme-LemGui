import {Membre} from './membre';

export interface MembreCommission {
    idMembreCommission: number;
    dateDebut:Date;
   dateFin:Date;
    membre:Membre;
}
