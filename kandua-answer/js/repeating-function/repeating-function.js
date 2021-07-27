// We want to be able to modify any given function, creating a clone of it which, when called, repeats the given function several times.
// On creation of the new clone function, we need to be able to specify how many times the given function should be repeated.
// As such, your task is to define a function `createRepeatingClone`, that works exactly as described above & depicted below.

// sayHelloTo is a demo function, which we'll use as test input for `createRepeatingClone`
function sayHelloTo(name) {
    console.log(`Hello ${name}!`);
    return "Successful";
}

// `createRepeatingClone` should be used as follows:

// const sayHelloTo3Times = createRepeatingClone(sayHelloTo, 3);
// const returnedArray = sayHelloTo3Times("Arjun");

// 🖨Desired Output:
// Hello Arjun!
// Hello Arjun!
// Hello Arjun!

// console.log(returnedArray);

// 🖨Desired Output:
// ["Successful", "Successful", "Successful"]


// And now, you're up. Good luck!
function createRepeatingClone(inputFunction, timesToRepeat){
    return ()=>{}
}


module.exports = createRepeatingClone;
