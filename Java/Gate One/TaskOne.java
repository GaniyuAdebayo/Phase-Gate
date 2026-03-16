import java.util.Scanner;
public class TaskOne{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter your name: ");
		String name = input.nextLine();

		System.out.printf("Welcome, %s%n", name);
	}

}