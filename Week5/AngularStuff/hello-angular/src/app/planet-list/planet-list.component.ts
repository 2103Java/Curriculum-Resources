import { Component, OnInit } from '@angular/core';
import { PlanetServiceService } from '../shared/planet-service.service';
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
  
  //demoing event from star component 
  starEventString: string;

  starEventWasTriggered(message: string): void {
    this.starEventString = message;
  }


  constructor(private planetGenerator: PlanetServiceService) {
    this.planets = this.planetGenerator.Planets;

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
