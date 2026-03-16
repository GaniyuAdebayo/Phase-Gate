import java.util.Scanner;
public class TaskNine{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter price of item: ");
		double price = input.nextDouble();

		System.out.printf("The new price of item is #%.2f%n", 1.1 * price);
	}

}