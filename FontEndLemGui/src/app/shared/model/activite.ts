import {TypeActivite} from './type-activite';

export interface Activite {
  idActivite: number;
  nomActivite: string;
  etat: number;
  typeActivite: TypeActivite;

}
