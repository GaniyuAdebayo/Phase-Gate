public class LevelFourTasksMethod{

	public static double taskOne(double firstNum, double secondNum){

		return firstNum + secondNum;
	}

	public static boolean taskTwo(int number){
		if (number % 2 == 0){
			return true;
		}
		return false;
	}

	public static double taskThree(double number){
		return number * number;
	}

	public static double taskFour(double tempCelcius){

		return (1.8 * tempCelcius) + 32;	
	}

	public static boolean taskFive(int number){
		
		int halveNumber = 0;

		if (number % 2 == 0){
			halveNumber = number/2;
		}
		else{
			halveNumber = (number / 2) + 1;
		}

		int counter = 0;
		for (int count = 1; count <= halveNumber; count++){
			if(number % count == 0){
				counter++;
			}
		}

		if(counter == 1){
			return true;
		}
		return false;

	}

	public static double taskSix(double num1, double num2, double num3){

		double largest = num1;
		if (num2 > largest){
			largest = num2;
		}

		if (num3 > largest){
			largest = num3;
		}
		
		return largest;
	}

	public static double taskSeven(double principal, double rate, int time){

		if (principal <= 0 || rate <= 0 || time <= 0){
			throw new IllegalArgumentException("Argument cannot be negative");
			
		}

		return (principal * rate * time)/100;

	}

	public static void taskEight(){
		
		for (int number = 1; number <= 12; number++){
			for (int value = 1; value <= 12; value++){
				System.out.printf("%3d X %-3d = %-3d%n", number, value, number * value);
	
			}
			System.out.println();
		}

	}

	public static double taskNine(double length, double width){

		if (length < 0 || width < 0){
			throw new IllegalArgumentException("Argument cannot be negative");
		}
		return length * width;
	}

	public static int taskTen(int number){
		int newNumber = 0;
		while(number != 0){
			newNumber = (newNumber * 10) + (number%10);
			number /= 10;
		}

		return newNumber;

	}

}