const prompt = require('prompt-sync')();

let number = Number(prompt("Enter a number: "));

let sumOfNumbers = 0;

for (let count = 1; count <= number; count++){
	sumOfNumbers += count;
}

console.log("The sum of numbers from 1 to %d is %d", number, sumOfNumbers);