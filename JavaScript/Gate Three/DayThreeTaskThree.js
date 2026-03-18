function taskOne(numbers, arraySize){

	let newNumber = [];

		for (let index = 0; index < arraySize; index++){

			if (index < numbers.length){
				newNumber[index] = numbers[index];
			}

			else{
				newNumber[index] = -1;
			}
		}
		
	return newNumber;

}

function taskThree(numbers){

	let numberIndex = [0, 0];
	let largest = numbers[0][0];

		for (let rowIndex = 0; rowIndex < numbers.length; rowIndex++){

			for (let columnIndex = 0; columnIndex < numbers[rowIndex].length; columnIndex++){
				if (numbers[rowIndex][columnIndex] > largest){
					largest = numbers[rowIndex][columnIndex];
					numberIndex[0] = rowIndex;
					numberIndex[1] = columnIndex;
				}
			}
		}
	return numberIndex;
}