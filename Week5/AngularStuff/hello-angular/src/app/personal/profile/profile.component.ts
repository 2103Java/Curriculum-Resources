import { Component, OnInit } from '@angular/core';

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
  template: '<p>Hello There!<p>', //the html file it references
  styleUrls: ['./profile.component.css'] // a component can have muliplte sytlings. 
})
export class ProfileComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
