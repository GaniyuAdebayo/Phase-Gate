const prompt = require('prompt-sync')();

let height = Number(prompt("Enter height of triangle: "));

for (let count = 1; count <= height; count++){

	let star = "";

	for (let counter = 1; counter <= count; counter++){
		star += "*"
	}
	console.log(star);

}