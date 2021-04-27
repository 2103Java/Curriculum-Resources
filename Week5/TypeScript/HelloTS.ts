
/**
 * 
 * Datatypes 
 * 
 * Control flow statements 
 * 
 * data structures 
 * 
 * Objects and how to create them 
 * 
 * OOP:
 *      inheritance
 *      polymoprhism 
 *      encapsulation
 *      abstraction 
 */

console.log("Hello World!");

let s = "Hello from a variable";

let s2 : number = 2;
let s3 : number | string | boolean = true;

// s2 = "3";
s3 = "3";
s3 = 3;

console.log(s);

if(true){
    let s4 = 3;
    s4 = "3";
}

function myFunc(a: number, b: string, c: boolean) : string {
    return "";
}

myFunc("string", 2, "true");