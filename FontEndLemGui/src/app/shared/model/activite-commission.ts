import {DetailsProgramme} from './details-programme';
import {Commission} from './commission';

export interface ActiviteCommission {
  idActiviteCommission: number;
  detailsProgramme: DetailsProgramme;
  commission:Commission;
}
