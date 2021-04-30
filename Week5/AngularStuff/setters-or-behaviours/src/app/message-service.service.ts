import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MessageServiceService {

  private myMessage: string = 'apples'; 

  //USING SETTERS AND GETTERS
  get MyMessage(){
    return this.myMessage;
  }

  set MyMessage(newMessage: string){
    this.myMessage = newMessage;
  }

  //USING OBSERVABLES and BEHAVUIRAL SUBJECT

  private myBehaviourSubject = new BehaviorSubject<string>(this.myMessage);

  private castMyBehaviouralSubjectToObservable = this.myBehaviourSubject.asObservable(); 

  get theObserve(){
    return this.castMyBehaviouralSubjectToObservable;
  }

  changeTheMessageUsingBehave(newMessage: string){
    this.MyMessage = newMessage;
    this.myBehaviourSubject.next(this.MyMessage);
  }


  constructor() { }
}
