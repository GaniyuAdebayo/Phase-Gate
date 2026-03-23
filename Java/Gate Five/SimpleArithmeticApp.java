//import Scanner and Random
//generate 2 random numbers
//if first number is less than second number, generate another second number
//on each question, allow user to input the answer
//if answer is wrong on first attempt, allow user to input on second attempt
//if second attempt is wrong, the next question should be displayed
//display 10 questions to the user one after the other
//give a summary of questions asked, questions answered correctly, and those missed.
//display the score in percentage


import java.security.SecureRandom;
import java.util.Scanner;

public class SimpleArithmeticApp{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);
		SecureRandom secureRandom = new SecureRandom();

		int noOfCorrectAnswers = 0;
		int count = 1;
		while (count <= 10){
			System.out.printf("Question %d%n", count);
			int firstNumber = secureRandom.nextInt(101);
			int secondNumber = secureRandom.nextInt(101);
			while(secondNumber > firstNumber){
				secondNumber = secureRandom.nextInt(100) + 1;
			}
			System.out.printf("%d - %d = ", firstNumber, secondNumber);
			int answer = input.nextInt();

			if ((firstNumber - secondNumber) != answer){
				System.out.printf("%d - %d = ", firstNumber, secondNumber);
				answer = input.nextInt();
			}
			if ((firstNumber - secondNumber) == answer){
				noOfCorrectAnswers++;
			}
			count++;
		}

		System.out.printf("%nYour Score is %d%%%n", (noOfCorrectAnswers * 10));

	}




}