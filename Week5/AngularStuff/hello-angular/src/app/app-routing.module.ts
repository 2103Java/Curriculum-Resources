import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProfileComponent } from './personal/profile/profile.component';
import { PlanetListComponent } from './planet-list/planet-list.component';
import { PokemonComponentComponent } from './pokemon/pokemon-component/pokemon-component.component';
import { RouteguardGuard } from './routeguard.guard';
import { WelcomeComponent } from './welcome/welcome.component';

const routes: Routes = [
  {
    path: 'planets',
    component: PlanetListComponent
  },
  {
    path: 'pokemon',
    component: PokemonComponentComponent
  },
  {
    path: 'profile/:myPathVariable',
    component: ProfileComponent,
    canActivate: [RouteguardGuard]
  },
  {
    path: 'welcome',
    component: WelcomeComponent
  },
  {
    path: '**',
    redirectTo: 'welcome'
  }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
