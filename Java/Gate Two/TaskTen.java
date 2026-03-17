import java.util.Scanner;
public class TaskTen{

	public static void main (String [] args){
	
		Scanner input = new Scanner (System.in);

		System.out.println("Enter a number: ");
		int number = input.nextInt();

		int newNumber = number;
		int counter = 0;

		while (newNumber != 0){
			newNumber /= 10;
			counter++;
		}
		System.out.printf("%d has %d digits%n", number, counter);
	}

}