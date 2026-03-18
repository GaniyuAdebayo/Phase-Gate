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
let num = [10, 11, 12];
console.log(taskOne(num, 9));