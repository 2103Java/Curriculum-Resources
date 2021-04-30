import { Component, OnInit } from '@angular/core';
import { MessageServiceService } from '../message-service.service';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  private currentMessage: string = '';

  get CurrentMessage(){

    return this.currentMessage;

  } 

  

  set CurrentMessage(incomingMessage: string){
    this.currentMessage = incomingMessage;
  }

  constructor(private messageService: MessageServiceService) { }

  ngOnInit(): void {
    this.currentMessage = this.messageService.MyMessage;

    this.messageService.theObserve.subscribe(

         (doesntmatter) => { this.currentMessage = doesntmatter}

    )

  }

}
