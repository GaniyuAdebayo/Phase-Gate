public class Level5Tasks{

	public static boolean primeNumber(int number){
		int count = 0;
		for (int index = 1; index<= number/2; index++){
			if(number%index == 0){
				count++;
			}
		}

		if(count == 1){
			return true;
		}
		return false;
	}

	public static boolean isPerfectSquare(int number){
		boolean isSquare = false;
		for (int count = 1; count <= number; count++){
			if (count * count == number){
				isSquare = true;
				break;
			}
		}
		return isSquare;
	}

	public static int [] taskOne(int [] numbers){

		int count = 0;
		for (int number : numbers){
			if (primeNumber(number) == true){
				count++;
			}
		}

		int [] primeNumbers = new int [count];
		int index = 0;
		for (int number : numbers){
			if (primeNumber(number) == true){
				primeNumbers[index] = number;
				index++;
			}
		}
		return primeNumbers;
	}

	public static int [] taskTwo(int [] numbers){
		
		for (int index = 0; index < numbers.length; index++){
			if (numbers[index] < 0){
				numbers[index] = 0;
			}
		}
		return numbers;
	}

	public static int [] taskThree(int [] numbers){
		int count = 0;
		int [] newNumbers = new int [numbers.length];
		for (int index = 0; index < numbers.length; index++){
			if(numbers[index] != 0){
				newNumbers[count] = numbers[index];
				count++;
			}
		}
		return newNumbers;
	}

	public static int [][] taskFive(int [] numbers){
		int evenCount = 0;
		int oddCount = 0;

		for (int number : numbers){
			if (number%2 == 0){
				evenCount++;
			}
			else{
				oddCount++;
			}
		}

		int [][] oddEvenNumbers = new int[2][];
		oddEvenNumbers[0] = new int [oddCount];
		oddEvenNumbers[1] = new int [evenCount];

		evenCount = 0;
		oddCount = 0;

		for (int number : numbers){
			if (number % 2 == 0){
				oddEvenNumbers[1][evenCount] = number;
				evenCount++;
			}
			else{
				oddEvenNumbers[0][oddCount] = number;
				oddCount++;
			}

		}

		return oddEvenNumbers;	
	}

	public static boolean taskSix(int [] numbers){
		boolean isPalindrome = true;
		for (int index = 0; index < numbers.length/2; index++){
			if(numbers[index] != numbers[numbers.length - 1 - index]){
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}

	public static int [] taskSeven(int [] numbers){
		int count = 0;
		for (int val : numbers){
			if (isPerfectSquare(val) == true){
				count++;
			}
		}

		int [] perfectNumbers = new int [count];
		int counter = 0;

		for (int value : numbers){
			if (isPerfectSquare(value) == true){
				perfectNumbers[counter] = value;
				counter++;
			}
		}
		return perfectNumbers;
	}

	public static int [] taskEight (int [] numbers){
		for (int index = 0; index < numbers.length; index++){
			if (isPerfectSquare(numbers[index]) == false){
				numbers[index] = -1;
			}
		}
		return numbers;
	}


}