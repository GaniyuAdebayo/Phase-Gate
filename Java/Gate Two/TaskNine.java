import java.util.Scanner;
public class TaskNine{

	public static void main (String [] args){
	
		Scanner input = new Scanner (System.in);

		System.out.println("Enter triangle height: ");
		int height = input.nextInt();

		for (int count = 1; count <= height; count++){
			System.out.println("*".repeat(count));
		}
	}

}