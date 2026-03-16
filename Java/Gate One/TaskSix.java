import java.util.Scanner;
public class TaskSix{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter length of the rectangle: ");
		double length = input.nextDouble();

		System.out.println("Enter width of the triangle: ");
		double width = input.nextDouble();

		System.out.printf("The area of the  rectangle is %.2f%n", length * width);
	}

}