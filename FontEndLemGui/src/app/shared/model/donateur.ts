import {TypeDonateur} from './type-donateur';

export interface Donateur {

   idDonateur:number;
   nomDonateur:string;
    adresse:string;
    email:string;
    adressFacebook:string;
    adresstwitter:string;
    adresstlinkedin:string;
    adressPinterest:string;
    typeDonateur:TypeDonateur;
    statut:string;

}
