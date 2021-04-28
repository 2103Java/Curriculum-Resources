import { Injectable } from '@angular/core';
import { Planet } from 'src/app/planet-list/planet'


//The decorator here is optional *BUT* if not present then you need to specify it in the app.module.ts
// the providedIn specifies where the 'dependency injector' will inject the service into, in this 
// case into anywhere inside the root package. 

//This service is responsible for holding all the planets. 

// @Injectable({
//   providedIn: 'root'
// })
export class PlanetServiceService {

  private planets: Planet[];

  get Planets(){
    return this.planets;
  }

  constructor() {
  
    this.planets = [ {
      name: 'Earth',
      image: 'https://images.unsplash.com/photo-1564053489984-317bbd824340?ixlib=rb-1.2.1&auto=format&fit=crop&w=2014&q=80',
      livibility: 5
    },
    {
      name:'Mars' ,
      image: 'https://upload.wikimedia.org/wikipedia/commons/0/02/OSIRIS_Mars_true_color.jpg',
      livibility: 3
    },
    {
      name: 'Venus',
      image: 'https://upload.wikimedia.org/wikipedia/commons/a/a9/PIA23791-Venus-NewlyProcessedView-20200608.jpg',
      livibility: 4
    },
    {
      name: 'Mercury',
      image: 'http://dreamicus.com/data/mercury/mercury-06.jpg',
      livibility: 2
    },
    {
      name: 'Pluto',
      image: 'https://earthsky.org/upl/2019/11/Pluto-false-color-New-Horizons-2015-800x813.jpg',
      livibility: 1
    }];

   }

}
