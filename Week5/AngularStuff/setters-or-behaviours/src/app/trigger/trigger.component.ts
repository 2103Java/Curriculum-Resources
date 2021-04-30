import { Component, OnInit } from '@angular/core';
import { MessageServiceService } from '../message-service.service';

@Component({
  selector: 'app-trigger',
  templateUrl: './trigger.component.html',
  styleUrls: ['./trigger.component.css']
})
export class TriggerComponent implements OnInit {

  input: string;
  recapturedMessage: string;

  constructor(private messageService: MessageServiceService) { }


  changeMessageWithSetter(): void {


    console.log("inside change message with setter!")
    this.messageService.MyMessage = this.input;

   
  }

  grabMessageWithGetter(): void{
    this.recapturedMessage = this.messageService.MyMessage;
  }


  //UPDATING MESSAGE USING OBSERVABLES 

  usingBehaviouralForMessage(){
    this.messageService.changeTheMessageUsingBehave(this.input);
  }

  ngOnInit(): void {

    // this.recapturedMessage = this.messageService.MyMessage;

    this.messageService.theObserve.subscribe(

      (data) => { this.recapturedMessage = data}

    )
  }

}
