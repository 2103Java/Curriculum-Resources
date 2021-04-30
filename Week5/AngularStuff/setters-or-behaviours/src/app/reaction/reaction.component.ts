import { Component, OnInit } from '@angular/core';
import { MessageServiceService } from '../message-service.service';

@Component({
  selector: 'app-reaction',
  templateUrl: './reaction.component.html',
  styleUrls: ['./reaction.component.css']
})
export class ReactionComponent implements OnInit {

  private capturedMessage: string;

  get CapturedMessage(){
    return this.capturedMessage;
  }

  constructor(private messageGenerator: MessageServiceService) {

    

   }

  ngOnInit(): void {

    // this.capturedMessage = this.messageGenerator.MyMessage this is grabbing the message using a getter

    this.messageGenerator.theObserve.subscribe(

      (data) => { this.capturedMessage = data}

    )



  }

}
