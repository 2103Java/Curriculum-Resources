import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

/**
 * So Angular distinguishes entites, pipes, service, components, anything, based on 
 *  their decorator
 * 
 * The decorator looks like annotation, provides metadata to Angular to tell it what it does. 
 * 
 * Component: .html, .css, .ts
 */


@Component({ // key value pairs. value: file addresses
  selector: 'app-profile', //how to select it via tag form
  templateUrl: './profile.component.html', //the html file it references
  styleUrls: ['./profile.component.css'] // a component can have muliplte sytlings. 
})
export class ProfileComponent implements OnInit {

  pathVariable: string;

  constructor(private route: ActivatedRoute) { }

  ngOnInit(): void {

    this.pathVariable = this.route.snapshot.paramMap.get('myPathVariable');
  }

}
