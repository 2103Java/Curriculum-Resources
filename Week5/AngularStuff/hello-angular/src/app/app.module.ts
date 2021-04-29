import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProfileComponent } from './personal/profile/profile.component';
import { PlanetListComponent } from './planet-list/planet-list.component';
import { PlanetServiceService } from './shared/planet-service.service';
import { PrependpipePipe } from './prependpipe.pipe';
import { ColourDirectiveDirective } from './shared/colour-directive.directive';
import { RatingStarsComponent } from './shared/rating-stars/rating-stars.component';
import { PokemonComponentComponent } from './pokemon/pokemon-component/pokemon-component.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { HttpClientModule } from '@angular/common/http';

//This is another decorator
// Declares the existence and location of all our angular files. 
// The reason why we don't have templateUrl, StyleURLs is beacuse this is a seperate entity, 
// in particular it's a configruation file. It's focus is declaring the nature of files 
// as well as it's location. 
@NgModule({
  declarations: [ // used for declaring components, also (custom) directives and pipes
    AppComponent,
    ProfileComponent,
    PlanetListComponent,
    PrependpipePipe,
    ColourDirectiveDirective,
    RatingStarsComponent,
    PokemonComponentComponent,
    WelcomeComponent
  ],
  imports: [ // used to import external modules 
    BrowserModule,
    AppRoutingModule,
    FormsModule, //ngModel comes from this library 
    HttpClientModule
  ],
  providers: [ //used to declare services
    /**
     * We have an 'injector' inside of Angular
     * And this entities deal with 'injecting' our dependencies when we instantiate anything.
     */
    PlanetServiceService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
