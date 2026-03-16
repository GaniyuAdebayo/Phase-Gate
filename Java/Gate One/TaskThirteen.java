import java.util.Scanner;
public class TaskTwelve{

	public static void main (String [] args){
		
		Scanner input = new Scanner (System.in);

		System.out.println("Enter a score: ");
		int number = input.nextInt();

		if (number >= 50){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");

		}

	}

}