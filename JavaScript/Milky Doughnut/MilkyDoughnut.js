function sortedNumber(numbers){

	for (let count = 0; count < numbers.length; count++){
		let smallest = numbers[count];
		for (let index = count+1; index < numbers.length; index++){
			if (numbers[index] < smallest){
				smallest = numbers[index];
				numbers[index] = numbers[count];
				numbers[count] = smallest;
			}
		}
	}
	return numbers;
}

function countEvens(numbers){
	let count = 0;
	for (let index = 0; index < numbers.length; index++){
		if (numbers[index] % 2 == 0){
			count++;
		}
	}
	return count;
}

function linearSearch(numbers, target){
	for (let index = 0; index < target.length; index++){
		if (numbers[index] === target){
			return index;
		}
	}
	return -1;
}

function squares(number){
	let n_squares = [];
	for (let count = 1; count <= number; count++){
		n_squares.push(count*count);
	}
	return n_squares;
}

function arraysEqual(a, b){
	if ((a.length == b.length) && (sortedNumber(a) === sortedNumber(b))){
	return true;
	}
	return false;
}

function flatten(number){
	let newMatrix = [];
	for (let rowIndex = 0; rowIndex < number.length; rowIndex ++){
		for (let columnIndex = 0; columnIndex < number[rowIndex].length; columnIndex++){
			newMatrix.push(number[rowIndex][columnIndex]);
		}
	}
	return newMatrix

}