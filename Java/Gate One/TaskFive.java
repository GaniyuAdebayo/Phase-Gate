import java.util.Scanner;
public class TaskFive{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter temperature in celsius: ");
		double celciusTemperature = input.nextDouble();

		double fahrenheit = (1.8 * celciusTemperature) + 32;

		System.out.printf("%.2f degCelcius = %.2f degFahrenheit %n", celciusTemperature, fahrenheit);

	}

}