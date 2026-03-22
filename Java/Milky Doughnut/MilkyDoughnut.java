
public class MilkyDoughnut{

	public static int [] sortedNumber( int [] numbers){

		for (int count = 0; count < numbers.length; count++){
			int smallest = numbers[count];
			for (int index = count+1; index < numbers.length; index++){
				if (numbers[index] < smallest){
					smallest = numbers[index];
					numbers[index] = numbers[count];
					numbers[count] = smallest;
				}
			}
		}
		return numbers;
	}

	public static boolean isContained(int [] numbers, int number){
		
		for (int value : numbers){
			if (value == number){
				return true;
			}
		}
		return false;

	}

	public static int countEvens(int [] numbers){

		int count = 0;
		for (int number : numbers){
			if (number % 2 == 0){
				count++;
			}
		}
		return count;
	}

	public static int linearSearch(int [] numbers, int target){

		for (int index = 0; index < numbers.length; index++){
			if (numbers[index] == target){
				return index;
			}
		}
		return -1;
	}
	
	public static int [] squares (int number){

		if (number > 0){
		
			int [] perfectSquares = new int [number];
			for (int count = 1; count <= number; count++){
				perfectSquares[count-1] = count * count;
			}
			return perfectSquares;
		}
		return new int [] {-1};
	}
	
	public static boolean arraysEqual(int [] a, int [] b){
		if ((a.length == b.length) && (sortedNumber(a) == sortedNumber(b))){
			return true;
		}
		return false;
	}

	public static int [] removeDuplicates(int [] arr){
		int counter = 0;
		int noOfZeros = 0;
		int [] numbers = new int [arr.length];
		for (int index = 0; index < arr.length; index++){
			if (isContained(numbers, arr[index]) == false){
				numbers[counter] = arr[index];
				counter++;
			}
			if (arr[index] == 0 && noOfZeros == 0){
				numbers[counter] = arr[index];
				counter++;
				noOfZeros++;
			}
		}

		int [] uniqueNumbers = new int [counter];
		for (int index = 0; index < counter; index++){
			uniqueNumbers[index] = numbers[index];
		}

		return uniqueNumbers;

	}

	public static int [] flatten(int [][] matrix){
		
		int positions = 0;

		for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++){
			positions += matrix[rowIndex].length;
		}

		int [] newMatrix = new int [positions];
		int index = 0;
		for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++){
			for (int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++){
				newMatrix[index] = matrix[rowIndex][columnIndex];
				index++;
			}
		}
		return newMatrix;
	}

}