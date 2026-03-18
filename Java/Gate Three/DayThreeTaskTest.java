import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DayThreeTaskTest{

	@Test
	public void testWhenExpectedSizeIsLessThanPresentArraySize(){
		int [] number = {10, 11, 12, 13, 14};
		int [] actual = DayThreeTask.taskOne(number, 2);
		int [] expected = {10, 11};

		assertArrayEquals(actual, expected);
	}

	@Test
	public void testWhenExpectedSizeIsGreaterThanPresentArraySize(){
		int [] number = {10, 11, 12};
		int [] actual = DayThreeTask.taskOne(number, 7);
		int [] expected = {10, 11, 12, -1, -1, -1, -1};

		assertArrayEquals(actual, expected);
	}

	@Test
	public void testWhenExpectedSizeIsEqualToPresentArraySize(){
		int [] number = {10, 11, 12};
		int [] actual = DayThreeTask.taskOne(number, 3);
		int [] expected = {10, 11, 12};

		assertArrayEquals(actual, expected);
	}

	@Test
	public void testForLargestNumberIn2DArray(){
		double [][] number ={{45.2, 90.28, 77.1}, {3.52, 9.86, 11.77}, {7.7, 10, 22.33, 12}};
		int [] actual = DayThreeTask.taskThree(number);
		int [] expected = {0,1};
		assertArrayEquals(actual, expected);
	}

	@Test
	public void testTheNumberOfCharacters(){
		String words = "AaaBBc";
		String actual = DayThreeTask.taskTwo(words);
		String expected = "A1a2B2c1";
		assertEquals(actual, expected);

	}

	@Test
	public void testForAnotherInTheNumberOfCharacters(){
		String words = "EEEEnnnneee";
		String actual = DayThreeTask.taskTwo(words);
		String expected = "E4n4e3";
		assertEquals(actual, expected);

	}

}