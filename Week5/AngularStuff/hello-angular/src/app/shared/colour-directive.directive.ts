import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appColourDirective]'
})
export class ColourDirectiveDirective {

  /**
   * this is an example of a custom attribute directive. 
   * 
   * In this case I'm defining a function that will trigger over a 'mouseenter' event (thanks to the HostListener).
   * the event will cause it to change color depending on what the text value is (i.e. if it contians 'Earth')
   */

 @HostListener('mouseenter') onMouseEnter(){

    let textStuff: string = this.element.nativeElement.innerText;

    textStuff = textStuff.toLowerCase();

    console.log(textStuff);

    if(textStuff.toLowerCase().indexOf("earth")!= -1){
      this.element.nativeElement.style.color = "ForestGreen";
    }else {
      this.element.nativeElement.style.color = "Crimson";
    }
  }

  constructor(private element: ElementRef) { }

}
