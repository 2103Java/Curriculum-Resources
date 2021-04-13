
// With ES6, we have classes! The feature bascially adds a nice sugar 
//coating to JavaScript. 
//OOP

//We need objects first! 

//Defining an object!
//JSON - JAvascript object notation looks quite a bit like creating an object in JS
//A JS object doesn't need to be based of a class: it consists of key value pairs. 

var obj = {
    key:"value",
    name: "Bob",
    age: 4,
    mass: "1",
    jump: function(){
        console.log("Look at " + this.colour + ", I'm jumping!")
    }
}; 
// Interacting with our JS object
// console.log(obj.mass); //dot notation to refer to object attributes
// console.log(obj["name"]);// bracket notation to refer to obejct attributes
// obj.jump();

// Objects properties can be defined outside of the object, during runtime. (JS IS FUN)
// obj.colour = "Red";

// obj.jump();

// console.log(obj.colour);


//--------------------DEFINING A CONSTRUCTOR--------------------------------------


function fun1(){
    console.log("Jumping!")
}

let fun2 = function(){
    console.log("Improving Jumping!")
}

//prior to ES6
function Robot(name, age, mass, jump) {
    this.name = name;
    this.age = age;
    this.mass = mass;
    this.jump = jump;
}

//post ES6 
class Robot {
    constructor(name, age, mass, jump) {
        this.name = name;
        this.age = age;
        this.mass = mass;
        this.jump = jump;
    }
}

//We can pass functions as well into our constructor (and other functions)
let barry = new Robot("BArry",22,2,fun1);

let newBArry = new Robot("Barry 2.0", 1, 3, fun2);

barry.character = true;

// console.log(barry);

// console.log(newBArry);


//-------------------------INHERITANCE----------------------------------------------

//Inheritance, how is it achieved without classes?
// With object based inheritance!
// Every object in java has an attribute, something called a prototype
// Prototypical inheritance. 


//Prior to ES6
let animal = {
    nickname: "Bob",
    ability(){
        console.log('My ability is ' + x);
    }
}

let racoon = {

    name: "Racoon",
    __proto__: animal
}


//----------------------------POLYMORPHISM-----------------------------


/**
 * overloading ?
 *      JS does not care about the number of parameters, so we can't distinguish 
 *      between methods based on their parameters.
 * 
 * overriding?
 *      JS does allow overriding. even if the arguments don't match. 
 *      We're overriding the "ability(...)" function.
 */
let bird = {


    ability(x){
        console.log('I can fly!');
    },
    __proto__: animal
}

let eagle = {

    ability(){
        console.log("I can hunt!");
    },
    __proto__: bird
}



//-----------------ENCAPSULATION----------------------------------------

// Managing access to data 
// Java we achieve it using access modifiers. 
// In JS, prior to ecmaScript 2015, we don't have access modifiers. 

//Encapsulation 

//We achieve it using closures. 

//NOT ACHIEVING ENCAPSULATION, anyone in the file can access secret
let secret = "secret value!";

secret = "no longer secret!";
/////////////////////////////////////////////////////////////////////////



let myValue = function(){ //self invoking function will now return 0, i.e. let myValue = 0;
    return 0;
}();

//rather than returning a value, we can return an entire function e.g.
/**
 * let myReturnedFunction = function(){
        console.log("inside returned function!" + " secret is: " + parentVariable);
        
    };

 */
//But why invoke a funciton to return a function??? Why not assign it directly?

let myReturnedFunction = function(){

    let parentVariable = "secret";

    return function(){
        console.log("inside returned function!" + " secret is: " + parentVariable);
        
    };
}();

//The "returned" function will keep track of variables inside in it's parent scope
// Only the "returned" function will have access to it!
// So now we have a single method, that is only able to access our variable!
// So've achieved encapsulation

// The rest of the functions are just more illustraions on it: 


// let setterMethod = function(){

//     let privateVariable = "initial";

//     return function(boolean,newValue){
//         //This is a getter and setter

//         if(boolean){
//             console.log(`old value is ${privateVariable}`);

//             privateVariable = newValue;
    
//             console.log(`new value is ${privateVariable}`);
//         }
        

//         return privateVariable;
//     }

// }();


// console.log(setterMethod(true,"apples"));




//Here we've effectively stored the "dogToy" within a function, which is an 
//attribute of the dog object (accessMethod)
//The accessMethod has a boolean argument to state whether we're inserting or
//getting values from the object. 
let dog = {
    bark(){
        console.log("Dog noises");
    },
    accessMethod: function(){

        let dogToy = "ball";
    
        return function(boolean,newValue){
            //This is a getter and setter
    
            if(boolean){

                var apples = "HoneyCrisp";
                console.log(`old value is ${dogToy}`);
    
                dogToy = newValue;
        
                console.log(`new value is ${dogToy}`);
            }
            
    
            return dogToy;
        }
    
    }(),
    __proto__: animal
};

// dog.accessMethod(false); //getter method
// console.log(dog.accessMethod(false));

// dog.accessMethod(true,"Chewy bone"); //setter method

// console.log(dog.accessMethod(false));

// dog.bark();
// dog.ability("barking");
// console.log(dog.nickname);

// console.log(dog);



//Abstraction 
//ABstraction is achieved in Java via abstract classes and interfaces. 
//JS does not really have abstraction. 



