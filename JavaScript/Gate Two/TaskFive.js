const prompt = require('prompt-sync')();

let number = Number(prompt("Enter a number: "));

let factorial = 1;

for (let count = number; count >= 1; count--){

	factorial *= count;
}

console.log("%d! = %d", number, factorial);