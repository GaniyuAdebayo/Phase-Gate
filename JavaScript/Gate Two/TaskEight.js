const prompt = require('prompt-sync')();
let total = 0;

let number;

do{

	number = Number(prompt("Enter a number: "));
	total += number;
}while(number != 0);

console.log("The sum of the numbers is %d", total);