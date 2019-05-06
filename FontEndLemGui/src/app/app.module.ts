import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavigationComponent } from './navigation/navigation.component';
import { SlideComponent } from './slide/slide.component';
import { CadresComponent } from './cadres/cadres.component';
import { DomainesComponent } from './domaines/domaines.component';
import { NewsComponent } from './news/news.component';
import { DonateursComponent } from './donateurs/donateurs.component';
import { ContactsComponent } from './contacts/contacts.component';
import { FooterComponent } from './footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    SlideComponent,
    CadresComponent,
    DomainesComponent,
    NewsComponent,
    DonateursComponent,
    ContactsComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }