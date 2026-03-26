import org.junit.jupiter.api.Test;
import java.util.InputMismatchException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumberGuessingTest{

	@Test
	public void testUserInputIsValid(){
		assertTrue(NumberGuessing.validateUserInput("76"));
	}

	@Test
	public void testUserInputIsValidButNotWithinRange(){
		assertFalse(NumberGuessing.validateUserInput("900"));
	}

	@Test	
	public void testUserInputIsNotValid(){
		assertFalse(NumberGuessing.validateUserInput("5t"));	
	}

	@Test
	public void testGuessNumberIsEqual(){
		assertTrue(NumberGuessing.guessNumberIsEqual(56, "56"));
	}

	@Test
	public void testGuessNumberIsNotEqual(){
		assertFalse(NumberGuessing.guessNumberIsEqual(5, "56"));
	}

	@Test
	public void testGuessingRating(){
		String expected = "Good";
		String actual = NumberGuessing.guessingRating(3);
		assertEquals(expected, actual);
	}

}
