function primeNumber(numbers){
	let count = 0;
	for (let index = 1; index<= numbers/2; index++){
		if(numbers%index == 0){
			count++;
		}
	}
	if(count == 1){
		return true;
	}
	return false;
}

function perfectSquare(number){
	let isSquare = false;
	for (let count = 1; count <= number; count++){
		if (count * count == number){
			isSquare = true;
			break;
		}
	}
	return isSquare;
}

function taskOne(numbers){
	let primeNumbers = [];
	for (let index = 0; index < numbers.length; index++){
		if (primeNumber(numbers[index]) == true){
			primeNumbers.push(numbers[index]);
		}
	}
	return primeNumbers;
}

function taskTwo(numbers){
	for (let index = 0; index < numbers.length; index++){
		if (numbers[index] < 0){
			numbers[index] = 0;
		}
	}
	return numbers;
}

function taskThree(numbers){
	let count = 0;
	let newNumbers = [];
	for (let index = 0; index < numbers.length; index++){
		if(numbers[index] != 0){
			newNumbers[count] = numbers[index];
			count++;
		}
	}
	for (let index = newNumbers.length; index < numbers.length; index++){
		newNumbers.push(0);
	}
	return newNumbers;
}

function taskFive(numbers){
	let oddEvenNumbers = [[],[]];
	for (let index = 0; index < numbers.length; index++){
		if (numbers[index] % 2 == 0){
			oddEvenNumbers[1].push(numbers[index]);
		}
		else{
			oddEvenNumbers[0].push(numbers[index]);
		}
	}	
	return oddEvenNumbers;
}

function taskSix(numbers){
	let isPalindrome = true;
	for (let index = 0; index < Math.floor(numbers.length/2); index++){
		if (numbers[index] != numbers[numbers.length - 1 - index]){
			isPalindrome = false;
			break;
		}
	}
	return isPalindrome;
}

function taskSeven(numbers){
	let perfectSquares = [];
	for (let index = 0; index < numbers.length; index++){
		if (perfectSquare(numbers[index]) == true){
			perfectSquares.push(numbers[index]);
		}
	}
	return perfectSquares;
}

function taskEight(numbers){
	for (let index = 0; index < numbers.length; index++){
		if (perfectSquare(numbers[index]) == false){
			numbers[index] = -1;
		}
	}
	return numbers;
}
