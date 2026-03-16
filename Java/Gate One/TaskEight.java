import java.util.Scanner;
public class TaskEight{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter a number: ");
		double number = input.nextDouble();

		System.out.printf("The square of %.2f is %.2f%n", number, number * number);
	}

}