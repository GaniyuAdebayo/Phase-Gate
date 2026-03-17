import java.util.Scanner;

public class TaskSeven{

	public static void main (String [] args){
	
		Scanner input = new Scanner (System.in);

		int sum = 0;

		for (int count = 1; count <= 5; count++){
			System.out.printf("Enter number %d: ", count);
			int number = input.nextInt();
			sum += number;
		}

		System.out.printf("The sum of the 5 numbers is %d%n", sum);
	}

}