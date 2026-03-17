import java.util.Scanner;

public class TaskFour{

	public static void main (String [] args){
	
		Scanner input = new Scanner (System.in);
	
		System.out.println("Enter a number: ");
		int number = input.nextInt();

		for (int count = 1; count <= 12; count++){
			System.out.printf("%3d X %-3d = %3d%n", number, count, number*count);

		}
	}

}