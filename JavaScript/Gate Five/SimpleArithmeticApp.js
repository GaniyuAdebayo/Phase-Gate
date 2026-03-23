//generate 2 random numbers
//if first number is less than second number, generate another second number
//on each question, allow user to input the answer
//if answer is wrong on first attempt, allow user to input on second attempt
//if second attempt is wrong, the next question should be displayed
//display 10 questions to the user one after the other
//give a summary of questions asked, questions answered correctly, and those missed.
//display the score in percentage

const prompt = require('prompt-sync')();

let count = 1;
let noOfCorrectAnswers = 0;

while (count <= 10){

	console.log("Question %d", count);

	let firstNumber = Math.floor(Math.random() * (100 - 0 + 1) + 0);
	let secondNumber = Math.floor(Math.random() * (100 - 0 + 1) + 0);

	while (secondNumber > firstNumber){
		secondNumber = Math.floor(Math.random() * (100 - 0 + 1) + 0);
	}

	let answer = Number(prompt(console.log("%d - %d = ", firstNumber, secondNumber)));
	if ((firstNumber - secondNumber) != answer){
	answer = Number(prompt(console.log("%d - %d = ", firstNumber, secondNumber)));
	}

	if ((firstNumber - secondNumber) == answer){
		noOfCorrectAnswers++;
	}
	count++;
}
console.log("Your Score is %d%", noOfCorrectAnswers * 10);





