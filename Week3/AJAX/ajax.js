/**
 * AJAX - A technique for accessing web servers from a web page asynchronosuly. 
 * 
 * syncrhnous vs asynchrnous: 
 *      Asynchrnous opertainos allow the rest of the application/web page to still 
 *      work while waiting for the operation to conclude. 
 *      It won't block everything while waiting for a response. 
 * 
 * 
 * AJAX consists of : 
 *      Asynchronous JavaScript and XML 
 * 
 *      Library that allows us to do asyncrhonous operations. 
 * 
 *      What I'll be using is an XMLHttpRequest Object. 
 * 
 */

// I want to have a user interactive way to send of a request. 

window.onload = function(){
document.getElementById("pokemonButton").addEventListener('click',getPokemon);
console.log("hello!")

}

// I want to have a AJAX function that sends of a request 

function getPokemon(){

        // I should be using a function to grab information from a html element 

        // let pokemonId = 4;

        let pokemonId = document.getElementById("pokemonId").value;
        console.log(pokemonId);

        /**
         * How does AJAX work ?
         * 
         * 1) An XMLHttpRequest Object is created
         * 2) XMLHttpRequest object sends a request to the web server 
         * 3) Server processes the request
         * 4) Server sends a response back 
         * 
         */

        let xhttp = new XMLHttpRequest();

        xhttp.onreadystatechange = function(){

            /**
             *  0 - request not initalized 
             *  1 - server connection established 
             *  2 - request received 
             *  3 - processing request 
             *  4 - request is finished and response is ready
             */

            console.log("Chaning my readystate " + xhttp.readyState);

            if(xhttp.readyState == 4 && xhttp.status == 200){ //checking that process is done and process was successful
                
                let poke = JSON.parse(xhttp.responseText);

                console.log(poke);

                DOMManipulation(poke);

            }

        }

        let BasePokeUrl = "https://pokeapi.co/api/v2/pokemon/";

        xhttp.open("GET",BasePokeUrl + pokemonId);

        xhttp.send();

}



// I want to then manipulate my page to render the returned JSOB object 
function DOMManipulation(pokemon){

    //setting the name
    document.getElementById("pokemonName").innerHTML = pokemon.name;

    //setting the image
    let pokeImg = document.getElementById("pokemonImg");

    pokeImg.setAttribute("src", pokemon.sprites.front_shiny);
    pokeImg.setAttribute("title", pokemon.name);

}


