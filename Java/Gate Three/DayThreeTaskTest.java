import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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


}