import {Donateur} from './donateur';

export interface Dons {
    idDon:number;
    libelleDon:string;
    qteDon:number;
    donateur: Donateur ;
}
