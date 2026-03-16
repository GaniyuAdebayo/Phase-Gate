import java.util.Scanner;
public class TaskThree{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter first number: ");
		int firstNumber = input.nextInt();

		System.out.println("Enter second number: ");
		int secondNumber = input.nextInt();

		System.out.printf("The sum of %d and %d is %d%n", firstNumber, secondNumber, firstNumber + secondNumber);
	}

}