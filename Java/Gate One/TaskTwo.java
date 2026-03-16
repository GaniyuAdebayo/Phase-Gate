import java.util.Scanner;
public class TaskTwo{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter your age: ");
		int age = input.nextInt();

		System.out.printf("You will be %d years in 5 years time%n", age + 5);
	}

}