import java.util.Scanner;
public class TaskTwelve{

	public static void main (String [] args){
		
		Scanner input = new Scanner (System.in);

		System.out.println("Enter a number: ");
		int number = input.nextInt();

		if (number >= 0){
			System.out.printf("%d is positive!%n", number);
		}
		else{
			System.out.printf("%d is negative!%n", number);

		}

	}

}