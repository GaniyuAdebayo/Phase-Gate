import java.util.Scanner;

public class TaskFive{

	public static void main (String [] args){
	
		Scanner input = new Scanner (System.in);
	
		System.out.println("Enter a number: ");
		int number = input.nextInt();

		while(number < 0){
			System.out.println("Enter a positive number: ");
			number = input.nextInt();
		}

		int product = 1;

		for (int count = number; count >= 1; count--){
			product *= count;

		}

		System.out.printf("%d! = %d%n", number, product);
	}

}