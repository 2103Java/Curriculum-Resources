
console.log("Hello Javascript!");

/**
 * 
 * What is JS?
 * 
 *  Not at all related with Java
 *  Scripting Language, not a compiled one. 
 *  Used to design and manipulate webapges. 
 *  Run's on the clientside, i.e. the browser. 
 * 
 * 
 *  Created in 1995 by Brandan Eich (10 days)
 * 
 *  JS is loosely typed, interpreted, object-based, scripting language*. 
 *  Used to design and manipulate webapges - to provide more interactivity/functionality. 
 * 
 *  Benefits? 
 *      Less server interaction. 
 *      Increased interactivity
 *      ASI (Automatic Semicolon insertion)
 *  
 * 
 * 
 */

/**
 *  Hoisting
 *  Anonymous functions
 *  callback functions
 *  self invoking functions
 * 
 * ES6
 *  FAt arrow notations
 *  `Template literals`
 */



// console.log(num);

// var num = 5;

// var num = 7;

// var num = 11;

// console.log(num)



// console.log(fruit);

// const fruit = "apples";

// ECMAscript 2015/ ES6 feature list:

//Ecma, there implements standards for scripting languages. 
// The biggest one recently was ES6 

// var only allows global and function scopes. 
// let and const allows global and function and block scope. 

// greetings("Hello",1,2,3);

function greetings(a,b) {

    var num = 7;

    console.log(a + " " + b);

    return 0;

}


// console.log(num);

// for(var i = 0;i < 10; i++){

//     var j = 7;
//     greetings("Hi", "There");
// }

// for(i = 0; i< 12; i++){
//     greetings("Hello!");
// }

let fatArrow = (i) => {return ++i;}; // This function is defined using fat arrow notation (ES6)
               // This is an anonyous function.  




//anonymous function "without a name"
let func1 = function(){
    console.log("This is");
    console.log("a");
    console.log("Anonymous function!");

    console.log(` This is 
                        a
                                Anonymous function!`)

    return 0;
}(); //self invoking function, that get's invoked as soon as it is defined. 
    // can't be used anywhere else either!

console.log(func1);
   


//  console.log(fatArrow);



//  function parentFuction(myFunction){ //callback function and this is function that are passed into other functions.
//      console.log(myFunction("Hi", "!"));
//  }


//  parentFuction(greetings);

// parentFuction(fatArrow); //NaN, invalid numerical operations will return a NaN

// parentFuction(func1);

// func1();



let array = [1,2, "3", "hello"];

array[7] = "my 7th position";
array[12] = array;

console.log(array);

console.log(isNaN(19));
console.log(isNaN("19"));
console.log(isNaN("helo"));
console.log(isNaN(NaN));
console.log(isNaN(Infinity - Infinity));

let numb = "19";

if(numb === 19){ // == will do type cohersion, === will check type and value 
    console.log("Hi there, the number is 19!")
}

//All values in JS have a inherent truthy or falsy value 

// while(-10){
//     console.log("Hello!");
// }






