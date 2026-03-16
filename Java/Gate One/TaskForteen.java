import java.util.Scanner;
public class TaskForteen{

	public static void main (String [] args){
		
		Scanner input = new Scanner (System.in);

		System.out.println("Enter first number: ");
		int number1 = input.nextInt();

		System.out.println("Enter second number: ");
		int number2 = input.nextInt();

		if (number1 > number2){
			System.out.printf("%d is greater%n", number1);
		}
		else if (number1 < number2){
			System.out.printf("%d is greater%n", number2);

		}

		else{
			System.out.printf("%d is equal to %d%n", number1, number2);
		}

	}

}