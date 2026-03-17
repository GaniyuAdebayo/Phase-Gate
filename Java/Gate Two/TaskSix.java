import java.util.Scanner;

public class TaskSix{

	public static void main (String [] args){
	
		Scanner input = new Scanner (System.in);
	
		System.out.println("Enter a number: ");
		int number = input.nextInt();

		int sum = 0;

		for (int count = 1; count <= number; count++){
			sum += count;
		}

		System.out.printf("The sum of numbers from 1 to %d is %d%n", number, sum);
	}

}