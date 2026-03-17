function taskOne (num1, num2){

	return num1 + num2;
}

function taskTwo (number){

	if (number % 2 == 0){
		return true;
	}
	return false;
}

function taskThree (number){
	return number * number;
}

function taskFour (tempCelcius){

	return (1.8 * tempCelcius) + 32;
}

function taskFive (number){

	let counter = 0;

	for (let count = 1; count <= Math.floor(number/2) + 1; count++){
		if (number % count == 0){
			counter++;
		}
	}

	if (counter == 1){
		return true;
	}

	return false;

}