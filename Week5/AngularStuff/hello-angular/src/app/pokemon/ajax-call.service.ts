import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

interface Pokemon{
  id : number;
  name : string;
  sprites : any;
}

@Injectable({
  providedIn: 'root'
})
export class AjaxCallService {

  private baseUrl: string = 'https://pokeapi.co/api/v2/pokemon/';
  private id: number;

  private url: string = '';

  getUrl(): string{
    return this.url;
  }

  setUrl(pokeId: number){

    this.id = pokeId;
    this.url = this.baseUrl + this.id;

  }


  //Send of our AJAX request 
  capturePokemon(): Observable<string>{

    return this.httpClient.get<string>(this.url); //that's our ajax request. 

  }

  capturePokemonAgain(): Observable<Pokemon> {
    return this.httpClient.get<Pokemon>(this.url);
  }

  constructor(private httpClient: HttpClient) { }


  /**
   * Asynchronous opertaions: 
   *    don't stop everything until they're finished, they simply wait in the background until the process is done. 
   *  
   * 
   * To send of a request, we need to use HTTP: Hyper Text Transfer Protocol 
   * 
   * To levarage HTTP calls, we use HttpClient Module: 
   * 
   *   HttpClientModule: 
   *    This is a service from the common libraries "@angular/common/http"
   *    This allows us abstract away our http requests and responses. 
   * 
   *  rxjs: 
   *    Reactive Extnsion JavaScript
   *    -it contains objects like, Observables, Promises and BehaviourSubjects. 
   *    -has tools to make asynchronous and callback functions simpiler. 
   * 
   * 
   * 
   * 
   * 
   *  Promise?
   *    It's an asynchronous operations. 
   *    Proxy object - it's an IOU, where here's a proxy object, in some time I *promise* to actually get the object. 
   *    A promise will only ever expect a single response.
   * 
   *  Observables?
   *    An observable is used to publish infromation to a stream.
   *    An observable follows a publisher-subscriber design pattern.
   *    Whenever it publishes data, all the subscribers down stream will get the data. 
   *    WE DONT KNOW HOW MUCH INFORMATION WE'RE GETTING! WE CAN GET 0 INFORMATION or INFINTE
   * 
   */
}
