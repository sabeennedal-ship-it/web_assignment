// Variables
let name = "Sabine";
let age = 21;

console.log("Name:", name); 
console.log("Age:", age);

// Operators
let x = 10;
let y = 5;

console.log("Addition:", x + y);
console.log("Subtraction:", x - y);
console.log("Multiplication:", x * y);
console.log("Division:", x / y);

// If Conditions
if (age >= 18) {
    console.log("Adult");
} else {
    console.log("Minor");
}

// Loops
console.log("For Loop:");
for (let i = 1; i <= 5; i++) {
    console.log(i);
}

console.log("While Loop:");
let counter = 1;
while (counter <= 3) {
    console.log(counter);
    counter++;
}

// Strings
let text = "JavaScript";
console.log("Length:", text.length);
console.log("Uppercase:", text.toUpperCase());

// Functions
function square(num) {
    return num * num;
}

console.log("Square of 5:", square(5));

// Arrays
let colors = ["Red", "Blue", "Green"];
colors.push("Black");

console.log("Colors:", colors);

// Objects
let student = {
    name: "Sabine",
    major: "Computer Science",
    year: 3
};

console.log("Student Name:", student.name);

// Date
let today = new Date();
console.log("Current Date:", today);

// Math
console.log("Square Root:", Math.sqrt(64));
console.log("Random Number:", Math.random());

// Set
let numbers = new Set([1, 2, 3, 3, 4]);
console.log("Set:", numbers);

// Map
let countries = new Map();
countries.set("JO", "Jordan");
countries.set("SA", "Saudi Arabia");

console.log("Country JO:", countries.get("JO"));

// Data Types
console.log(typeof name);
console.log(typeof age);
console.log(typeof true);

// Error Handling
try {
    console.log(result);
} catch (error) {
    console.log("Error:", error.message);
}

console.log("Program Finished Successfully");
