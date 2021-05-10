import { Component, OnInit } from '@angular/core';
import { AjaxSessionService } from '../ajax-session.service';

@Component({
  selector: 'app-landing-page',
  templateUrl: './landing-page.component.html',
  styleUrls: ['./landing-page.component.css']
})
export class LandingPageComponent implements OnInit {

  constructor(private myAjax: AjaxSessionService ) { }

  userDetails = "";
  loginMessage = "";
  logoutMessage = "";

  ngOnInit(): void {
  }

  firstButtonEvent(){

    this.myAjax.loginRequest().subscribe(

      data => {
        this.loginMessage = this.loginMessage + " " + data.message;
      }

    )

  }

  secondButtonEvent(){

    this.myAjax.logoutRequest().subscribe(

      data => {
        this.logoutMessage = this.logoutMessage + " " + data.message;
      }
    )

  }

  thirdButtonEvent(){

    this.myAjax.verifySession().subscribe(

      data => {

        this.userDetails = this.userDetails + " " + data.name;
      }

    )

  }

}
