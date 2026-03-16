import java.util.Scanner;
public class TaskEleven{

	public static void main (String [] args){
		
		Scanner input = new Scanner (System.in);

		System.out.println("Enter a number: ");
		int number = input.nextInt();

		if (number % 2 == 0){
			System.out.printf("%d is even!%n", number);
		}
		else{
			System.out.printf("%d is odd!%n", number);

		}

	}

}