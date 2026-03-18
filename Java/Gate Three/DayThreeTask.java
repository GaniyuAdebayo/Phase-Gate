public class DayThreeTask{

	public static int [] taskOne(int [] numbers, int arraySize){

		int [] newNumber = new int [arraySize];

			for (int index = 0; index < arraySize; index++){

				if (index < numbers.length){
					newNumber[index] = numbers[index];
				}

				else{
					newNumber[index] = -1;
				}
			}
		
		return newNumber;

	}

}