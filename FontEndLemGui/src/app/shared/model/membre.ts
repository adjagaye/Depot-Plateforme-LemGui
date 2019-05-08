import {TypeMembre} from './type-membre';

export interface Membre {
   idMembre:number;
   nomMembre:string;
   tel:number;
   numeroCarte:string;
   dateAdhesion:Date;
   etat:number;
  typeMembre:TypeMembre ;
}
