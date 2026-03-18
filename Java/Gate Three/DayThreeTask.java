
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

	public static int [] taskThree(double [][] numbers){

		int [] numberIndex = {0, 0};
		double largest = numbers[0][0];

		for (int rowIndex = 0; rowIndex < numbers.length; rowIndex++){

			for (int columnIndex = 0; columnIndex < numbers[rowIndex].length; columnIndex++){
				if (numbers[rowIndex][columnIndex] > largest){
					largest = numbers[rowIndex][columnIndex];
					numberIndex[0] = rowIndex;
					numberIndex[1] = columnIndex;
				}
			}
		}
		return numberIndex;
	}


	public static String taskTwo(String word){
		String outcome = "";
		for(int index = 0; index < word.length(); index++){
			int count = 0;
			String letter = word.charAt(index) + "";
			if (!outcome.contains(letter)){
				for (int counter = 0; counter < word.length(); counter++){
					if(letter.equals(word.charAt(counter) + "")){
						count++;
					}
				}
				outcome += String.format("%s%d", letter, count);
			}

		}

		return outcome;

	}

}