import java.security.SecureRandom;
import java.util.InputMismatchException;
public class NumberGuessing{

	static SecureRandom secureRandom = new SecureRandom();

	public static int generatedNumber(){		
		int number = secureRandom.nextInt(1, 101);
		return number;
	}

	public static boolean guessNumberIsEqual(int randomNumberGenerated, String guessedNumber){

		if (validateUserInput(guessedNumber) == true){
			if (randomNumberGenerated == Integer.valueOf(guessedNumber)){
				return true;
			}
		}
		return false;
	}

	public static boolean validateUserInput(String guessedNumber){
		try{
			int number = Integer.valueOf(guessedNumber);
			if (number <1 || number > 100){
				System.out.println("Number should be between 1 and 100");
				return false;
			}
			return true;
		} catch(NumberFormatException e){
			System.out.println("Non-numeric input inserted");
			return false;
		}
	}

	public static String guessingRating(int noOfGuesses){

		switch(noOfGuesses){
			case 1:
				return "Legendary";
			case 2:
				return "Excellent";
			case 3:
			case 4:
				return "Good";
			case 5:
				return "Close!";
			default:
				return "Better Luck!";
		}
	}



}