const prompt = require('prompt-sync')();
let sumOfNumbers = 0;

for (let count = 1; count <= 5; count++){

	let number = Number(prompt("Enter a number: "));

	sumOfNumbers += number;
}

console.log("The sum of the 5 numbers is %d", sumOfNumbers);