import java.util.Scanner;
public class TaskFifteen{

	public static void main (String [] args){
		
		Scanner input = new Scanner (System.in);

		System.out.println("Enter number: ");
		int number1 = input.nextInt();

		int largest = number1;

		for (int count = 1; count <= 2; count++){
			System.out.println("Enter number: ");
			int number2 = input.nextInt();

			if (number2 > largest)
				largest = number2;

		}

		System.out.printf("The largest number is %d%n", largest);

	}

}