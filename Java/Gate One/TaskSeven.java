import java.util.Scanner;
public class TaskSeven{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter the radius of the circle: ");
		double radius = input.nextDouble();

		double circumference = Math.PI * 2 * radius;

		System.out.printf("The circumference of the circle with radius %.2f is %.2f%n", radius, circumference);

	}

}