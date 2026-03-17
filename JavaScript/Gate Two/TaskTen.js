const prompt = require('prompt-sync')();

let number = Number(prompt("Enter a number: "));

let newNumber = number;
let count = 0;

while(newNumber != 0){

	newNumber = Math.floor(newNumber / 10);
	count++;

}

console.log("%d has %d digits", number, count);