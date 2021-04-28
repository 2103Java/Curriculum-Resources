import { Component, OnInit } from '@angular/core';
import { Planet } from './planet'

/**
 * @Component tells Angular that this class is a component. 
 * Components are responsible for the view (they also have their own html, css and ts files. )
 * 
 * 
 */

@Component({
  selector: 'planet-list',
  templateUrl: './other-planet-page.html',
  styleUrls: ['./planet-list.component.css']
})
export class PlanetListComponent implements OnInit {

  //demo interpolation
  user: string = "Bob";
  age: number = 1;

  //demo structural directives, ngFor 
  planets: Planet[];

  //this section is used to demo the filter function
  filteredPlanets: Planet[]; // if no filter then planets 
  actualInputField: string = ''; //used to demo our 2-way binding

  get inputField(){
    return this.actualInputField;
  }


  set inputField(userInput: string){

    this.actualInputField = userInput;

    //I want to filter the planets if input is a non-empty string 

    //Ternary expression: 
    // value = (conditional boolean expression)?
              // <evaluate when true>:<evalueate when false>
    this.filteredPlanets = (this.actualInputField)?
            this.performFilter(this.inputField): this.planets;

            //if false
            //this.filterplanets = this.planets

            //if true
            //this.filterplanets = this.performFilter(filterValue);

  }

  // Demoing event binding and property binding
  showTable: boolean = true;
  toggleTable(): void {
    this.showTable = !this.showTable;
  }
  imageWidth = 100;
  imageMargin = 2;
  

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

    this.filteredPlanets = this.planets;
   }

  ngOnInit(): void {
  }

  performFilter(filterValue: string): Planet[] {

    return this.planets.filter(//inbuild method where we define the filter condition

      (planet:Planet) => planet.name.toLowerCase().indexOf(filterValue.toLowerCase())!= -1
    ); 
  }

}
