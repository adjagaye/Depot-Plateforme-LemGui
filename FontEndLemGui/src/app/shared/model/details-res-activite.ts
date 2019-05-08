import {Activite} from './activite';

export interface DetailsResActivite {
  idDetails:number;
  prixRessoucePrevu:number;
  prixRessouceReel:number;
  etat:number;
  activite: Activite;
}
