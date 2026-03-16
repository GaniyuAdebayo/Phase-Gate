import java.util.Scanner;
public class TaskTen{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		double sum = 0;

		for (int counter = 1; counter <= 3; counter++){
			
			System.out.printf("Enter number %d: ", counter);
			double number = input.nextDouble();

			sum += number;

		}

		System.out.printf("The average of the numbers is %.2f%n", sum/3);
	}

}