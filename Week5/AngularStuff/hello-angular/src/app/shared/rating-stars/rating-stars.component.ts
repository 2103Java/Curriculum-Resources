import { Component, EventEmitter, OnInit, Input, OnChanges, Output } from '@angular/core';
// import * as EventEmitter from 'node:events';


@Component({
  selector: 'stars',
  templateUrl: './rating-stars.component.html',
  styleUrls: ['./rating-stars.component.css']
})
export class RatingStarsComponent implements OnInit , OnChanges{

  /**
   * This line creates an attribute directive. 
   * This is a way for us to send infromation from parent to child
   */
  @Input() score: number;

  @Output() starClicked: EventEmitter<string> = new EventEmitter<string>();

  onStarClick(): void {
    
    this.starClicked.emit(`The score is ${this.score}. (From the star component)`);


  }


  starWidth: number;

  constructor() { 

    //associated with invoking code that is typescript. 

    

  }

  ngOnInit(): void {

    //invoking code associated with angular 
  }

  ngOnChanges(): void {
    this.starWidth = this.score*70/5;
  }


  /**
   * Lifecycle of a component: 
   *    1. Create component
   *    2. Render Componend
   *      3. Create and render Children (sub componenbt)
   *    4. Apply and updates components - this is when the ngOnChanges methods will be invoked 
   *    5. Destroy component
   * 
   * Lifecycle hook: 
   *    Is a function that gets invoked at the lifecycle stages. 
   */
}
