const prompt = require('prompt-sync')();

let number = Number(prompt("Enter a number: "));

for(let count = 1; count <= 12; count++){

	console.log("%d X %d = %d", number, count, number*count);
}