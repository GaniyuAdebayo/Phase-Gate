public class DuplicateRemoval{

	public static int [] nonDuplicateNumber(int [] number){
		int count = 0;
		for (int index = 0; index < number.length; index++){
			
			int counter = 0;
			for (int val = 0; val < number.length; val++){
				if (number[index] == number[val]){
					counter++;
				}
			}
	
			if (counter ==1){
				count++;
			}
		}

		int [] newNumber = new int [count];
		int newIndex = 0;

		for (int index = 0; index < number.length; index++){
			
			int counter = 0;
			for (int val = 0; val < number.length; val++){
				if (number[index] == number[val]){
					counter++;
				}
			}
	
			if (counter ==1){
				newNumber[newIndex] = number[index];
				newIndex++;
			}
		}
		return newNumber;


	}

}