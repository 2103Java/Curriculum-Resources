import { Component, OnInit } from '@angular/core';
import { AjaxCallService } from '../ajax-call.service';

@Component({
  selector: 'app-pokemon-component',
  templateUrl: './pokemon-component.component.html',
  styleUrls: ['./pokemon-component.component.css']
})
export class PokemonComponentComponent implements OnInit {

  pokeName: string; 
  pokeImage: string;
  pokeId: number;

  pokeButtonClick(): void {
      
    this.pokeGetter.setUrl(this.pokeId); //our url is set 

    

    this.pokeGetter.capturePokemon().subscribe(
      
      (data) => 
        {
          
          console.log("Hello there from original method")
  
          this.pokeName = data['name'];
          this.pokeImage = data['sprites']['front_shiny'];



        }
    )


  }

  pokeButtonClickedAgain(): void{
    this.pokeGetter.setUrl(this.pokeId);

    this.pokeGetter.capturePokemonAgain().subscribe(

      (data) => {
          console.log("Hello there from the other method!")
  
          this.pokeName = data.name;
          this.pokeImage = data.sprites['back_default']
      }

    )
  }

  constructor(private pokeGetter: AjaxCallService) { }

  ngOnInit(): void {
  }

}
