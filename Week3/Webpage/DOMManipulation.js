
let title = document.getElementById("myTitle");



window.onload = function(){
    
    title.addEventListener("wheel",domManipulation);

    console.log(title)

}

//1) We need to have a wway of selecting our element!




//2.1) Defiing the manipulation function

function domManipulation(){
    title.innerText += "Bob";

    title.style= "color:black";
}

//2.2) We want to add an eventlistener to said element



//n) event to occur


//n) Changing the element

// domManipulation();





//Modify Element function



// event has to occur 
// said event has to invoke a function 
// function should then modify the html, via the DOM 