import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class LevelFourTasksTest{

	@Test
	public void testTheSumAreEqual(){
		double expected = LevelFourTasksMethod.taskOne(4, 5);
		double actual = 9.0;
		assertEquals(expected, actual);
	}

	@Test
	public void testTheSumOfPositiveAndNegativeNumbersAreEqual(){
		double expected = LevelFourTasksMethod.taskOne(-4, 5);
		double actual = 1.0;
		assertEquals(expected, actual);
	}

	@Test
	public void testThatZeroIsEven(){
		boolean expected = LevelFourTasksMethod.taskTwo(0);
		assertTrue(expected);
	}

	@Test
	public void testThatANegativeIntegerIsOdd(){
		boolean expected = LevelFourTasksMethod.taskTwo(-7);
		assertFalse(expected);
	}

	@Test
	public void testThatSquareOfNegativeTenIs100(){
		double expected = LevelFourTasksMethod.taskThree(-10);
		double actual = 100.0;
		assertEquals(expected, actual);
	}

	@Test
	public void testThatSquareOf25Is625(){
		double expected = LevelFourTasksMethod.taskThree(25);
		double actual = 625.0;
		assertEquals(expected, actual);
	}

	@Test
	public void testThatZeroDegreeCelciusGives32degF(){
		double expected = LevelFourTasksMethod.taskFour(0);
		double actual = 32.0;
		assertEquals(expected, actual);
	}

	@Test
	public void testThatNegative100DegreeCelciusGivesNegative148degF(){
		double expected = LevelFourTasksMethod.taskFour(-100);
		double actual = -148.0;
		assertEquals(expected, actual);
	}

	@Test
	public void testThat23IsPrime(){
		boolean expected = LevelFourTasksMethod.taskFive(23);
		assertTrue(expected);
	}

	@Test
	public void testThat121IsNotPrime(){
		boolean expected = LevelFourTasksMethod.taskFive(121);
		assertFalse(expected);
	}

	@Test
	public void testForLargestWhenAllAreNegative(){
		double expected = LevelFourTasksMethod.taskSix(-8, -3, -67);
		double actual = -3;
		assertEquals(expected, actual);		

	}

	@Test
	public void testForLargestWhenAllArePositive(){
		double expected = LevelFourTasksMethod.taskSix(6.3, 4.4, 9.3);
		double actual = 9.3;
		assertEquals(expected, actual);		

	}

	@Test
	public void testSimpleInterestIsEqual(){
		double expected = LevelFourTasksMethod.taskSeven(1000, 21.4, 5);
		double actual = 1070.0;
		assertEquals(expected, actual);		
	}

	@Test
	public void testSimpleInterestCannotHaveNegativeArguments(){
		assertThrows(IllegalArgumentException.class, () -> LevelFourTasksMethod.taskSeven(1000, 21.4, -5));	
	}

	@Test
	public void testAreaOfRectangleOfLength10AndWidth5Is50(){
		double expected = LevelFourTasksMethod.taskNine(10, 5);
		double actual = 50.0;
		assertEquals(expected, actual);	

	}

	@Test
	public void testAreaOfRectangleOfLength10AndWidthNegative5ThrowsError(){
		assertThrows(IllegalArgumentException.class, () -> LevelFourTasksMethod.taskNine(10, -5));

	}

	@Test
	public void testReverseOf12345is54321(){
		int expected = LevelFourTasksMethod.taskTen(12345);
		int actual = 54321;
		assertEquals(expected, actual);			
	}

	@Test
	public void testReverseOf12321IsNot12321(){
		int expected = LevelFourTasksMethod.taskTen(12321);
		int actual = 12321;
		assertEquals(expected, actual);			
	}

}