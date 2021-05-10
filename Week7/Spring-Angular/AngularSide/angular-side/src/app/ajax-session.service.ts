import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

export interface Message{
  message: string;
}

export interface User{
  name: string;
  adminAccess: boolean;
}

@Injectable({
  providedIn: 'root'
})
export class AjaxSessionService {

  constructor(private myHttpClient: HttpClient) { }

  loginRequest(): Observable<Message>{

    //verb ? GET
    //response object = Message
    //url? /login

    return this.myHttpClient.get<Message>("http://localhost:8088/login", {withCredentials: true});

  }

  logoutRequest(): Observable<Message>{

    //verb ? GET
    //response object = Message
    //url? /login

    return this.myHttpClient.get<Message>("http://localhost:8088/logout", {withCredentials: true});

  }

  verifySession(): Observable<User>{

    //verb ? GET
    //response object = User
    //url? /login

    return this.myHttpClient.get<User>("http://localhost:8088/checkSession", {withCredentials: true});

  }
}
